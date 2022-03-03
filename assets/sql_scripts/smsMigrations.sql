ALTER TABLE seasons ADD COLUMN is_supplementary BOOLEAN NOT NULL DEFAULT FALSE;
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