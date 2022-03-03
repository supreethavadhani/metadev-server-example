ALTER TABLE subject_registers ADD COLUMN effective_marks int NOT NULL DEFAULT 0;
ALTER TABLE offered_subjects ADD COLUMN max_cie_marks int NOT NULL DEFAULT 50;
ALTER TABLE offered_subjects ADD COLUMN max_see_marks int NOT NULL DEFAULT 100;
ALTER TABLE offered_subjects ADD COLUMN cie_weightage int NOT NULL DEFAULT 100;
ALTER TABLE offered_subjects ADD COLUMN see_weightage int NOT NULL DEFAULT 50;
ALTER TABLE subjects ADD COLUMN is_attendance_required boolean NOT NULL DEFAULT TRUE;

CREATE TABLE grading_schemes (
    institute_id bigint NOT NULL,
    grading_scheme_id BIGSERIAL PRIMARY KEY,
    name character varying NOT NULL
);

CREATE OR REPLACE VIEW packet_list AS 
 SELECT pp.packet_code,
    pp.institute_id,
    pp.offered_subject_id,
    pp.valuation_round,
    pp.assigned_to,
    COALESCE(ev.name, ''::character varying) AS name,
    COALESCE(ev.phone_number, ''::character varying) AS phone_number,
        CASE
            WHEN pp.assigned1_id = 0 THEN 0
            ELSE
            CASE
                WHEN pp.assigned2_id = 0 THEN 1
                ELSE
                CASE
                    WHEN pp.assigned3_id = 0 THEN 2
                    ELSE 3
                END
            END
        END AS valuation_type
   FROM paper_packets pp
     JOIN valuation_activities va ON pp.institute_id = va.institute_id
     LEFT JOIN evaluators ev ON ev.offered_subject_id = pp.offered_subject_id AND ev.evaluator_id = pp.assigned_to
  WHERE pp.is_makeup = va.makeup_exam_initiated AND pp.valuation_round = va.current_valuation_round;

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

  CREATE OR REPLACE VIEW offerable_subjects AS  SELECT a.institute_id,
    a.subject_id,
    a.name,
    a.code,
    b.name AS department_name,
    '' AS offered_sections,
    a.department_id
   FROM subjects a
     JOIN departments b ON a.department_id = b.department_id AND a.is_active = true AND a.parent_id = 0;


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

CREATE VIEW form_a_details AS  SELECT a.institute_id,
    a.student_id,
    a.offered_subject_id,
    a.usn,
    a.has_attended_exam,
    b.name AS program_name
   FROM subject_register_details a
     JOIN programs b ON a.program_id = b.program_id
  WHERE a.is_eligible_for_exam = true
  ORDER BY a.usn;

