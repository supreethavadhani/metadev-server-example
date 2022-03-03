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
    d.parent_id
   FROM subject_registers a
     JOIN students b ON a.student_id = b.student_id
     JOIN departments c ON b.department_id = c.department_id;
     
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
    h.name as season_name
   FROM subject_register_details a
     JOIN grades b ON a.grade::text = b.grade::text
     JOIN subjects c ON a.subject_id = c.subject_id AND c.parent_id = 0
     JOIN subject_registers d ON a.student_id = d.student_id AND d.subject_id = c.subject_id
     JOIN subject_sections e ON a.subject_section_id = e.subject_section_id
     JOIN level_sections f ON e.level_section_id = f.level_section_id
     JOIN sections g ON g.section_id = f.section_id
     JOIN seasons h ON h.season_id = a.season_id and a.institute_id = h.institute_id;
     
CREATE VIEW program_average_gpa_details AS 
  SELECT
	institute_id,
	season_id,
	degree_id,
	program_id,
	level_id,
	AVG(cgpa)::numeric(4,2) AS average_cgpa,
	AVG(sgpa)::numeric(4,2) AS average_sgpa,
	level_name,
	program_name 
  FROM enrolled_student_details
  GROUP BY season_id,degree_id,program_id,level_id,institute_id,level_name,program_name;
