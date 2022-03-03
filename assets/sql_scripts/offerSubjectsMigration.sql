CREATE OR REPLACE VIEW offered_subject_details AS  SELECT a.offered_subject_id,
    a.subject_id,
    a.degree_id,
    a.season_id,
    a.level_id,
    a.department_id,
    a.attendance_frozen,
    a.is_child,
    a.cie_frozen,
    b.name,
    b.code,
    b.is_integrated,
    c.name AS level_name,
    d.name AS department_name,
    0 AS nbr_enrolled,
    true AS can_be_withdrawn,
    true AS is_offered,
    b.parent_id,
    e.name AS degree_name
   FROM offered_subjects a
     JOIN subjects b ON a.subject_id = b.subject_id
     JOIN levels c ON a.level_id = c.level_id
     JOIN departments d ON a.department_id = d.department_id
     JOIN degrees e ON a.degree_id = e.degree_id;

CREATE VIEW subject_details AS  SELECT a.institute_id,
    a.subject_id,
    s.season_id,
    a.name,
    a.code,
    b.name AS department_name,
    a.department_id,
        CASE
            WHEN NOT (concat(a.subject_id, '-', s.season_id) IN ( SELECT concat(offered_subjects.subject_id, '-', offered_subjects.season_id) AS concat
               FROM offered_subjects)) THEN false
            ELSE true
        END AS is_offered,
        CASE
            WHEN
            CASE
                WHEN NOT (concat(a.subject_id, '-', s.season_id) IN ( SELECT concat(offered_subjects.subject_id, '-', offered_subjects.season_id) AS concat
                   FROM offered_subjects)) THEN false
                ELSE true
            END = true THEN ( SELECT Distinct(offered_subject_details.level_name)
               FROM offered_subject_details
              WHERE offered_subject_details.subject_id = a.subject_id AND offered_subject_details.season_id = s.season_id)
            ELSE ''::character varying
        END AS offered_level_name,
        CASE
            WHEN
            CASE
                WHEN NOT (concat(a.subject_id, '-', s.season_id) IN ( SELECT concat(offered_subjects.subject_id, '-', offered_subjects.season_id) AS concat
                   FROM offered_subjects)) THEN false
                ELSE true
            END = true THEN ( SELECT Distinct(offered_subject_details.level_id)
               FROM offered_subject_details
              WHERE offered_subject_details.subject_id = a.subject_id AND offered_subject_details.season_id = s.season_id)
            ELSE '-1'::integer::bigint
        END AS offered_level_id
   FROM subjects a
     JOIN departments b ON a.department_id = b.department_id AND a.is_active = true AND a.parent_id = 0
     JOIN seasons s ON a.institute_id = s.institute_id;
     
     
CREATE OR REPLACE VIEW offerable_sections AS  SELECT a.level_section_id,
    a.level_id,
    a.section_id,
    b.name,
    b.institute_id,
    0 AS subject_section_id,
    0 AS nbr_enrolled,
    true AS can_be_withdrawn,
    false AS is_offered,
    a.program_id
   FROM level_sections a
     JOIN sections b ON a.is_active = true AND b.is_active = true AND a.section_id = b.section_id;
     
CREATE OR REPLACE VIEW offerable_subjects AS  SELECT a.institute_id,
    a.subject_id,
    a.name,
    a.code,
    b.name AS department_name,
    ''::text AS offered_sections,
    a.department_id
   FROM subjects a
     JOIN departments b ON a.department_id = b.department_id AND a.is_active = true AND a.parent_id = 0;