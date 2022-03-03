CREATE TABLE academic_regulations (
  institute_id bigint NOT NULL,
  academic_regulation_id BIGSERIAL PRIMARY KEY,
  name character varying NOT NULL DEFAULT '',
  min_passing_marks int NOT NULL DEFAULT 40,
  attendance_for_exemption int NOT NULL DEFAULT 85,
  cie_for_exemption int NOT NULL DEFAULT 45,
  fail_grade character varying NOT NULL DEFAULT 'F',
  withdrawal_grade character varying NOT NULL DEFAULT 'W',
  exemption_grade character varying NOT NULL DEFAULT 'I',
  exception_grade character varying NOT NULL DEFAULT 'X',
  created_at timestamp,
  updated_at timestamp
);

CREATE OR REPLACE VIEW student_subject_results AS  SELECT a.institute_id,
    a.season_id,
    a.student_id,
    a.department AS department_name,
    a.usn,
    a.name,
    c.subject_id,
    c.code AS subject_code,
    c.name AS subject_name,
    a.has_withdrawn,
    a.cie_marks,
    d.exam_marks,
    a.cie_marks::numeric + round(d.exam_marks::numeric / 2::numeric) AS total_marks,
    c.total_credits AS credits,
    b.grade,
    b.grade_points,
    f.level_id,
    c.slno,
    e.level_section_id,
    a.program_id,
    a.is_eligible_for_exam,
    a.offered_subject_id,
    a.subject_section_id,
    h.name AS season_name,
    i.admission_quota
   FROM subject_register_details a
     JOIN grades b ON a.grade::text = b.grade::text and a.academic_regulation_id = b.academic_regulation_id
     JOIN subjects c ON a.subject_id = c.subject_id AND c.parent_id = 0
     JOIN subject_registers d ON a.student_id = d.student_id AND d.subject_id = c.subject_id AND a.season_id = d.season_id
     JOIN subject_sections e ON a.subject_section_id = e.subject_section_id
     JOIN level_sections f ON e.level_section_id = f.level_section_id
     JOIN sections g ON g.section_id = f.section_id
     JOIN seasons h ON h.season_id = a.season_id AND a.institute_id = h.institute_id
     JOIN students i ON i.student_id = a.student_id;

ALTER TABLE grades ADD COLUMN academic_regulation_id BIGINT NOT NULL DEFAULT 1;
ALTER TABLE students ADD COLUMN academic_regulation_id BIGINT NOT NULL DEFAULT 1;
ALTER TABLE grades DROP CONSTRAINT grades_pkey;
ALTER TABLE subjects ADD COLUMN grading_scheme_id BIGINT NOT NULL DEFAULT 1;
ALTER TABLE grades ADD COLUMN grading_scheme_id BIGINT NOT NULL DEFAULT 1;
ALTER TABLE grades ADD CONSTRAINT grades_pkey PRIMARY KEY (institute_id,academic_regulation_id,grading_scheme_id,grade);

INSERT INTO "public"."academic_regulations"("institute_id","academic_regulation_id","name","min_passing_marks","attendance_for_exemption","cie_for_exemption","fail_grade","withdrawal_grade","exemption_grade","exception_grade","created_at","updated_at")
VALUES
(1,1,E'AR-ALL-2019',40,85,45,E'F',E'W',E'I',E'X',NULL,NULL),
(1,2,E'AR-ALL-2018',40,85,45,E'F',E'W',E'I',E'X',NULL,NULL),
(1,3,E'AR-UG-2017',40,85,45,E'F',E'W',E'I',E'X',NULL,NULL),
(1,4,E'AR-PG-2017',50,85,45,E'F',E'W',E'I',E'X',NULL,NULL);

DELETE FROM grades;
INSERT INTO "public"."grades"("institute_id","academic_regulation_id","grading_scheme_id","grade","seq_no","min_marks","grade_points")
VALUES
(1,1,1,E'A',2,80,9),
(1,1,1,E'B',3,70,8),
(1,1,1,E'C',4,60,7),
(1,1,1,E'D',5,50,6),
(1,1,1,E'E',6,40,4),
(1,1,1,E'F',7,0,0),
(1,1,1,E'I',9,101,0),
(1,1,2,E'NP',12,0,0),
(1,1,2,E'PP',11,10,0),
(1,1,1,E'S',1,90,10),
(1,1,1,E'W',10,101,0),
(1,1,1,E'X',8,101,0),
(1,2,1,E'A',2,75,9),
(1,2,1,E'B',3,60,8),
(1,2,1,E'C',4,50,7),
(1,2,1,E'D',5,45,5),
(1,2,1,E'E',6,40,4),
(1,2,1,E'F',7,0,0),
(1,2,1,E'S',1,90,10),
(1,3,1,E'A',2,75,9),
(1,3,1,E'B',3,60,8),
(1,3,1,E'C',4,50,7),
(1,3,1,E'D',5,45,5),
(1,3,1,E'E',6,40,4),
(1,3,1,E'F',7,0,0),
(1,3,1,E'S',1,90,10),
(1,4,1,E'A',2,80,9),
(1,4,1,E'B',3,70,8),
(1,4,1,E'C',4,56,7),
(1,4,1,E'D',5,50,5),
(1,4,1,E'F',6,0,0),
(1,4,1,E'S',1,90,10);

CREATE OR REPLACE VIEW subject_register_details AS  SELECT a.institute_id,
    a.season_id,
    a.subject_section_id,
    a.subject_register_id,
    a.offered_subject_id,
    a.subject_id,
    a.student_id,
    a.total_classes,
    a.total_attendance,
    a.overall_attendance,
    a.has_attendance_shortage,
    a.is_condonable,
    a.is_condoned,
    a.cie_marks,
    a.has_cie_shortage,
    a.is_eligible_for_exam,
    a.has_opted_for_makeup,
    a.has_attended_exam,
    a.has_attended_makeup,
    b.name,
    b.usn,
    c.name AS department,
    a.is_eligible_to_withdraw,
    a.has_withdrawn,
    a.is_authorized_absence,
    a.grade,
    b.program_id,
    d.name AS subject_name,
    d.parent_id,
    a.exam_marks,
    b.academic_regulation_id
   FROM subject_registers a
     JOIN students b ON a.student_id = b.student_id
     JOIN departments c ON b.department_id = c.department_id
     JOIN subjects d ON a.subject_id = d.subject_id;
     
CREATE OR REPLACE VIEW program_section AS  SELECT DISTINCT c.name AS section_name,
    b.level_section_id,
    a.institute_id,
    a.season_id,
    a.program_id,
    b.level_id
   FROM student_enrollments a
     LEFT JOIN level_sections b ON b.level_section_id = a.level_section_id
     LEFT JOIN sections c ON c.section_id = b.section_id;