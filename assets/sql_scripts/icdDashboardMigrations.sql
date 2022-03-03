CREATE VIEW quota_wise_grade_statistics AS  
	SELECT 
	  a.institute_id,
	  a.season_id,
	  b.admission_quota,
	  a.grade,
	  COUNT(*) AS nbr 
    FROM student_subject_results a
      JOIN students b ON a.student_id = b.student_id 
    GROUP BY a.grade,a.grade_points,b.admission_quota,a.institute_id,a.season_id
    ORDER BY grade_points DESC;


CREATE VIEW quota_wise_gpa_statistics AS 
	SELECT student_enrollments.institute_id,
		student_enrollments.season_id,students.admission_quota,
			CASE
				WHEN student_enrollments.cgpa >= 0::numeric AND student_enrollments.cgpa <= 3.99 THEN '0.0 - 3.99'::text
				WHEN student_enrollments.cgpa >= 4::numeric AND student_enrollments.cgpa <= 5.99 THEN '4.0 - 5.99'::text
				WHEN student_enrollments.cgpa >= 6::numeric AND student_enrollments.cgpa <= 6.99 THEN '6.0 - 6.99'::text
				WHEN student_enrollments.cgpa >= 7::numeric AND student_enrollments.cgpa <= 7.99 THEN '7.0 - 7.99'::text
				WHEN student_enrollments.cgpa >= 8::numeric AND student_enrollments.cgpa <= 8.99 THEN '8.0 - 8.99'::text
				WHEN student_enrollments.cgpa >= 9::numeric AND student_enrollments.cgpa <= 10::numeric THEN '9.0 - 10.0'::text
				ELSE NULL::text
			END AS gpa_range,
		count(*) AS count
	  FROM student_enrollments
	  JOIN students ON student_enrollments.student_id = students.student_id
	GROUP BY (
			CASE
				WHEN student_enrollments.cgpa >= 0::numeric AND student_enrollments.cgpa <= 3.99 THEN '0.0 - 3.99'::text
				WHEN student_enrollments.cgpa >= 4::numeric AND student_enrollments.cgpa <= 5.99 THEN '4.0 - 5.99'::text
				WHEN student_enrollments.cgpa >= 6::numeric AND student_enrollments.cgpa <= 6.99 THEN '6.0 - 6.99'::text
				WHEN student_enrollments.cgpa >= 7::numeric AND student_enrollments.cgpa <= 7.99 THEN '7.0 - 7.99'::text
				WHEN student_enrollments.cgpa >= 8::numeric AND student_enrollments.cgpa <= 8.99 THEN '8.0 - 8.99'::text
				WHEN student_enrollments.cgpa >= 9::numeric AND student_enrollments.cgpa <= 10::numeric THEN '9.0 - 10.0'::text
				ELSE NULL::text
			END), student_enrollments.institute_id, student_enrollments.season_id,students.admission_quota
	ORDER BY (
			CASE
				WHEN student_enrollments.cgpa >= 0::numeric AND student_enrollments.cgpa <= 3.99 THEN '0.0 - 3.99'::text
				WHEN student_enrollments.cgpa >= 4::numeric AND student_enrollments.cgpa <= 5.99 THEN '4.0 - 5.99'::text
				WHEN student_enrollments.cgpa >= 6::numeric AND student_enrollments.cgpa <= 6.99 THEN '6.0 - 6.99'::text
				WHEN student_enrollments.cgpa >= 7::numeric AND student_enrollments.cgpa <= 7.99 THEN '7.0 - 7.99'::text
				WHEN student_enrollments.cgpa >= 8::numeric AND student_enrollments.cgpa <= 8.99 THEN '8.0 - 8.99'::text
				WHEN student_enrollments.cgpa >= 9::numeric AND student_enrollments.cgpa <= 10::numeric THEN '9.0 - 10.0'::text
				ELSE NULL::text
			END);
			
CREATE OR REPLACE VIEW enrolled_student_details AS 
 SELECT se.institute_id,
    se.season_id,
    se.student_id,
    p.degree_id,
    se.program_id,
    l.level_id,
    se.level_section_id,
    p.name AS program_name,
    sec.name AS section_name,
    l.name AS level_name,
    s.usn,
    s.name,
    se.sgpa,
    se.cgpa,
    se.registered_credits,
    se.obtained_credits,
    se.total_credits,
    se.barcode,
	s.admission_quota
   FROM student_enrollments se
     JOIN programs p ON se.program_id = p.program_id AND se.institute_id = p.institute_id
     JOIN students s ON se.student_id = s.student_id AND se.institute_id = s.institute_id
     JOIN level_sections ls ON se.level_section_id = ls.level_section_id
     JOIN levels l ON ls.level_id = l.level_id
     JOIN sections sec ON ls.section_id = sec.section_id;
     
CREATE VIEW quota_wise_subject_grade_statistics AS 
 SELECT a.institute_id,
    a.offered_subject_id,
    a.season_id,
    b.admission_quota,
    a.grade,
    count(*) AS nbr
   FROM student_subject_results a
     JOIN students b ON a.student_id = b.student_id
  GROUP BY a.grade, a.grade_points, b.admission_quota, a.institute_id, a.season_id, a.offered_subject_id
  ORDER BY a.grade_points DESC;
  
CREATE OR REPLACE VIEW student_subject_results AS 
 SELECT a.institute_id,
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
     JOIN grades b ON a.grade::text = b.grade::text
     JOIN subjects c ON a.subject_id = c.subject_id AND c.parent_id = 0
     JOIN subject_registers d ON a.student_id = d.student_id AND d.subject_id = c.subject_id and a.season_id = d.season_id
     JOIN subject_sections e ON a.subject_section_id = e.subject_section_id
     JOIN level_sections f ON e.level_section_id = f.level_section_id
     JOIN sections g ON g.section_id = f.section_id
     JOIN seasons h ON h.season_id = a.season_id AND a.institute_id = h.institute_id
     JOIN students i ON i.student_id = a.student_id;

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
    a.exam_marks
   FROM subject_registers a
     JOIN students b ON a.student_id = b.student_id
     JOIN departments c ON b.department_id = c.department_id
     JOIN subjects d ON a.subject_id = d.subject_id;