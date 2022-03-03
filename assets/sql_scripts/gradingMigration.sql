ALTER TABLE degrees ADD COLUMN min_passing_marks int NOT NULL DEFAULT 40;
ALTER TABLE degrees ADD COLUMN attendance_for_exemption int NOT NULL DEFAULT 85;
ALTER TABLE degrees ADD COLUMN cie_for_exemption int NOT NULL DEFAULT 45;
ALTER TABLE degrees ADD COLUMN fail_grade character varying NOT NULL DEFAULT 'F';
ALTER TABLE degrees ADD COLUMN withdrawal_grade character varying NOT NULL DEFAULT 'W';
ALTER TABLE degrees ADD COLUMN exemption_grade character varying NOT NULL DEFAULT 'I';
ALTER TABLE degrees ADD COLUMN exception_grade character varying NOT NULL DEFAULT 'X';

ALTER TABLE grades ADD COLUMN grade_points numeric(3,1) NOT NULL DEFAULT 0.0;

ALTER TABLE valuation_activities ALTER COLUMN is_valuation_frozen SET default true;
ALTER TABLE valuation_activities ALTER COLUMN is_grades_calculated SET default true;

ALTER TABLE student_enrollments ADD COLUMN sgpa numeric(4,2) NOT NULL DEFAULT 0.00;
ALTER TABLE student_enrollments ADD COLUMN cgpa numeric(4,2) NOT NULL DEFAULT 0.00;
ALTER TABLE student_enrollments ADD COLUMN registered_credits numeric(4,1) NOT NULL DEFAULT 0.00;
ALTER TABLE student_enrollments ADD COLUMN obtained_credits numeric(4,1) NOT NULL DEFAULT 0.00;

ALTER TABLE subject_registers ADD COLUMN is_eligible_to_withdraw boolean NOT NULL default true;
ALTER TABLE subject_registers ADD COLUMN has_withdrawn boolean NOT NULL default false;
ALTER TABLE subject_registers ADD COLUMN is_authorized_absence boolean NOT NULL default false;


CREATE OR REPLACE VIEW subject_register_details as
SELECT
  a.institute_id,
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
  c.name as department,
  a.is_eligible_to_withdraw,
  a.has_withdrawn,
  a.is_authorized_absence,
  a.grade
FROM subject_registers as a
  join students as b
    on a.student_id = b.student_id
  join departments c 
    on b.department_id = c.department_id;

CREATE OR REPLACE VIEW registered_student_names as
SELECT
  a.institute_id,
  a.subject_section_id,
  a.subject_register_id,
  a.offered_subject_id,
  a.student_id,
  a.is_eligible_for_exam,
  a.has_opted_for_makeup,
  a.has_attended_exam,
  a.has_attended_makeup,
  b.name,
  b.usn,
  c.name as department,
  d.name as level,
  f.name as section,
  a.is_authorized_absence
FROM subject_registers as a
  join students as b
    on a.student_id = b.student_id
  join departments c 
    on b.department_id = c.department_id
  join levels d 
    on b.level_id = d.level_id
  join level_sections e 
    on b.level_section_id = e.level_section_id
  join sections f
    on e.section_id = f.section_id;

CREATE OR REPLACE VIEW exam_registers AS  
SELECT 
	sr.subject_register_id,
    sr.offered_subject_id,
    sr.institute_id,
    sr.student_id,
    sr.subject_id,
    sr.is_eligible_for_exam,
    sr.has_attended_exam,
    sr.has_opted_for_makeup,
    sr.has_attended_makeup,
    st.name,
    st.usn,
    d.name AS department,
    l.name AS level,
    sr.overall_attendance,
    sr.subject_section_id,
    sr.is_eligible_to_withdraw,
    sr.has_withdrawn,
    sr.is_authorized_absence,
    sr.section_id
   FROM subject_registers sr
     JOIN students st ON sr.student_id = st.student_id
     JOIN departments d ON st.department_id = d.department_id
     JOIN levels l ON l.level_id = st.level_id;

CREATE OR REPLACE VIEW section_attendance as
SELECT
  a.subject_register_id,
  a.institute_id,
  a.subject_section_id,
  a.total_classes,
  a.total_attendance,
  a.overall_attendance,
  b.student_id,
  b.name,
  b.usn,
  b.temp_usn,
  a.has_withdrawn
FROM subject_registers a
  join students b 
    on a.student_id = b.student_id;

CREATE OR REPLACE VIEW student_in_registers as
SELECT
  a.subject_register_id,
  a.offered_subject_id,
  a.subject_section_id,
  a.institute_id,
  a.student_id,
  a.cie_marks,
  b.name,
  b.usn,
  a.has_withdrawn
FROM subject_registers as a
  join students b
    on a.student_id = b.student_id;

CREATE OR REPLACE VIEW student_assessment_details as
SELECT
  a.student_assessment_id,
  a.institute_id,
  a.subject_section_id,
  a.assessment_scheme_id,
  a.assessment_seq_no,
  a.student_id,
  a.has_attended,
  a.marks_scored,
  CASE 
    WHEN a.has_attended = true THEN '' || a.marks_scored
    ELSE 'AB'
  END as marks,

  b.name,
  b.usn,
  sr.has_withdrawn
FROM student_assessments as a
  join students b
    on a.student_id = b.student_id
  join subject_registers as sr
  	on a.student_id = sr.student_id and a.subject_register_id=sr.subject_register_id and a.institute_id=sr.institute_id;


CREATE OR REPLACE VIEW current_enrolled_students as 
SELECT
a.institute_id,
a.student_id,
a.season_id,
b.name as student_name,
b.usn,
c.level_id,
d.name as level_name,
e.program_id,
e.name as program_name,
f.name as department_name,
a.sgpa,
a.registered_credits,
a.obtained_credits,
a.cgpa
FROM student_enrollments as a
  join students as b 
  on a.student_id = b.student_id
  join level_sections as c
  on a.level_section_id = c.level_section_id
  join levels as d
  on c.level_id = d.level_id
  join programs as e
  on a.program_id = e.program_id
  join departments as f
  on b.department_id = f.department_id
  join institute_configurations as g
  on b.institute_id = g.institute_id AND a.season_id = g.current_season; 


CREATE OR REPLACE VIEW coded_paper_names AS  
SELECT 
	cp.paper_code,
    cp.institute_id,
    cp.subject_register_id,
    cp.is_makeup,
    cp.valuation_round,
    cp.packet_code,
    cp.offered_subject_id,
    cp.student_id,
    st.name,
    st.usn,
    cp.grade,
    cp.marks1,
    cp.marks2,
    cp.marks3,
    cp.effective_marks
FROM coded_papers cp
     JOIN students st ON st.student_id = cp.student_id;
     
CREATE OR REPLACE VIEW student_in_registers AS  
SELECT a.subject_register_id,
    a.offered_subject_id,
    a.subject_section_id,
    a.institute_id,
    a.student_id,
    a.cie_marks,
    b.name,
    b.usn,
    a.has_withdrawn,
    c.name as subject_name,
    c.is_integrated,
    a.overall_attendance,
    a.season_id
   FROM subject_registers a
     JOIN students b ON a.student_id = b.student_id and a.institute_id = b.institute_id
     JOIN offered_subject_details c ON a.offered_subject_id = c.offered_subject_id;


CREATE VIEW student_subject_marks AS
SELECT a.institute_id,
    a.subject_section_id,
    a.student_id,
    asi.seq_no,
    a.marks,
	asi.max_marks,
	asi.name
 FROM student_assessment_details a
     JOIN assessment_items asi ON asi.assessment_scheme_id = a.assessment_scheme_id AND asi.seq_no = a.assessment_seq_no;



CREATE VIEW student_subject_results AS
SELECT 
	a.institute_id,
	a.season_id,
	a.student_id,
	a.department as department_name,
	a.usn,
	a.name,
	e.offered_subject_id as subject_id,
	c.code as subject_code,
	c.name as subject_name,
	a.has_withdrawn,
	a.cie_marks,
	d.exam_marks,
	c.total_credits as credits,
	b.grade,
	b.grade_points
FROM subject_register_details a
	JOIN grades b
		ON a.grade = b.grade
	JOIN subjects c
		ON a.subject_id = c.subject_id
	JOIN subject_registers d
		ON a.student_id = d.student_id and c.subject_id=d.subject_id
	JOIN offered_subject_list e
		ON a.offered_subject_id = e.offered_subject_id;

DROP VIEW assigned_staff_names;
CREATE VIEW assigned_staff_names AS  
SELECT a.institute_id,	
	a.season_id,
	a.section_id,
	a.subject_section_id,
	ssd.section_name,
    b.staff_id,
    b.display_name AS name,
    b.email,
    b.phone_number,
    ssd.subject_name,
    CASE 
    	WHEN ssd.cie_frozen = true THEN 'YES'
    	ELSE 'NO'
    END as cie_submitted
    FROM assigned_staffs a
     JOIN staffs b ON a.staff_id = b.staff_id
     JOIN subject_section_details ssd ON a.subject_section_id = ssd.subject_section_id;

DELETE FROM grades;
insert into "public"."grades" ("grade", "institute_id", "seq_no", "min_marks", "grade_points")
VALUES
('S', 1, 1, 90, 10.0),
('A', 1, 2, 80, 9.0),
('B', 1, 3, 70, 8.0),
('C', 1, 4, 60, 7.0),
('D', 1, 5, 50, 6.0),
('E', 1, 6, 40, 4.0),
('F', 1, 7, 0, 0.0),
('X', 1, 8, -1, 0.0),
('I', 1, 9, -1, 0.0),
('W', 1, 10, -1, 0.0);

DELETE FROM valuation_activities;
INSERT INTO "public"."valuation_activities"("institute_id")
VALUES
(1);


DELETE FROM sections WHERE section_id=9;
DELETE FROM subject_sections WHERE section_id=9;
DELETE FROM level_sections WHERE section_id=9;
DELETE FROM students WHERE level_section_id=9;
DELETE FROM students WHERE level_section_id=37;


ALTER TABLE institute_configurations ADD COLUMN results_announced BOOLEAN NOT NULL DEFAULT FALSE;

