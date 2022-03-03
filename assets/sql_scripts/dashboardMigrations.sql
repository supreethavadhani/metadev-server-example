CREATE VIEW institute_gpa_statistics AS SELECT 
	institute_id,
	season_id,
	CASE 
	    WHEN cgpa>=0 and cgpa<=3.99 then '0.0 - 3.99'
	    WHEN cgpa>=4 and cgpa<=5.99 then '4.0 - 5.99'
	    WHEN cgpa>=6 and cgpa<=6.99 then '6.0 - 6.99'
	    WHEN cgpa>=7 and cgpa<=7.99 then '7.0 - 7.99'
	    WHEN cgpa>=8 and cgpa<=8.99 then '8.0 - 8.99'
	    WHEN cgpa>=9 and cgpa<=10 then '9.0 - 10.0'
	END AS gpa_range,
  	count(*)
from student_enrollments
group by gpa_range,institute_id,season_id ORDER BY gpa_range;

DROP VIEW student_subject_results;
CREATE VIEW student_subject_results AS SELECT a.institute_id,
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
    a.cie_marks + ROUND(d.exam_marks/2::decimal) as total_marks,
    c.total_credits AS credits,
    b.grade,
    b.grade_points,
    f.level_id,
    c.slno,
    e.level_section_id,
    a.program_id,
    a.is_eligible_for_exam,
    a.offered_subject_id
   FROM subject_register_details a
     JOIN grades b ON a.grade::text = b.grade::text
     JOIN subjects c ON a.subject_id = c.subject_id AND c.parent_id = 0
     JOIN subject_registers d ON a.student_id = d.student_id AND d.subject_id = c.subject_id
     JOIN subject_sections e ON a.subject_section_id = e.subject_section_id
     JOIN level_sections f ON e.level_section_id = f.level_section_id
     JOIN sections g ON g.section_id = f.section_id;
     
DROP VIEW hall_ticket_details;
CREATE VIEW hall_ticket_details AS SELECT b.institute_id,
    a.student_id,
    a.season_id,
    b.name AS subject_name,
    b.code AS subject_code,
    e.name AS program_name,
        CASE
            WHEN a.is_eligible_for_exam THEN 'ELIGIBLE'::text
            ELSE 'NOT ELIGIBLE'::text
        END AS is_eligible
   FROM subject_registers a
     JOIN subjects b ON a.subject_id = b.subject_id
     JOIN student_enrollments c ON a.student_id = c.student_id and a.season_id = c.season_id
     JOIN level_sections d ON c.level_section_id = d.level_section_id
     JOIN levels e ON d.level_id = e.level_id
  WHERE b.parent_id = 0;

  CREATE VIEW enrolled_student_details AS SELECT 
	se.institute_id,
	se.season_id,
	se.student_id,
	p.degree_id,
	se.program_id,
	l.level_id,
	se.level_section_id,
	p.name as program_name,
	sec.name as section_name,
	l.name as level_name,
	s.usn,
	s.name,
	se.sgpa,
	se.cgpa,
	se.registered_credits,
	se.obtained_credits,
	se.total_credits,
	se.barcode
FROM student_enrollments se
JOIN programs p ON se.program_id = p.program_id and se.institute_id = p.institute_id
JOIN students s ON se.student_id = s.student_id and se.institute_id = s.institute_id
JOIN level_sections ls ON se.level_section_id = ls.level_section_id
JOIN levels l ON ls.level_id = l.level_id 
JOIN sections sec ON ls.section_id = sec.section_id;

CREATE VIEW staff_parent_subject_list AS SELECT a.offered_subject_id,
    a.staff_id,
    b.name
   FROM assigned_staffs a
     JOIN subjects b ON a.subject_id = b.subject_id AND b.parent_id = 0;
     
CREATE VIEW subject_section_test_statistis AS SELECT institute_id,subject_section_id,name,seq_no,AVG(
	CASE
		WHEN marks='AB' THEN 0
		ELSE marks::decimal
	END
	)::numeric(4,2) as average
FROM student_subject_marks GROUP BY name,subject_section_id,institute_id,seq_no;

CREATE VIEW offered_parent_subject_details AS  SELECT a.offered_subject_id,
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
    true AS is_offered
   FROM offered_subjects a
     JOIN subjects b ON a.subject_id = b.subject_id AND b.parent_id=0
     JOIN levels c ON a.level_id = c.level_id
     JOIN departments d ON a.department_id = d.department_id ORDER BY a.degree_id,b.name;


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
     JOIN departments c ON b.department_id = c.department_id
     JOIN subjects d ON a.subject_id = d.subject_id;
     
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
