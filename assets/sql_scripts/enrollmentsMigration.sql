CREATE OR REPLACE VIEW enrollable_students AS SELECT 
	a.institute_id,
	b.season_id,
	prg.degree_id,
	a.student_id,
	a.name,
	d.name as department_name,
	a.usn,
	prg.name program_name,
	FALSE AS is_registered
FROM students a 
	JOIN seasons b 
		ON a.institute_id = b.institute_id AND 
		(a.student_id,b.season_id) NOT IN 
			(SELECT 
				se.student_id,
				se.season_id 
			FROM student_enrollments se)
	 JOIN departments d ON a.department_id = d.department_id
	 JOIN programs prg ON a.program_id = prg.program_id;;

CREATE VIEW degree_levels AS SELECT 
	a.institute_id,
	s.season_id,
	a.degree_id,
	b.program_id,
	a.level_id,
	b.level_section_id,
	b.section_id  
  FROM levels a 
    JOIN level_sections b ON a.level_id = b.level_id 
    JOIN seasons s ON s.institute_id=a.institute_id;
    
    
CREATE OR REPLACE VIEW student_subject_results AS SELECT a.institute_id,
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
    h.name AS season_name
   FROM subject_register_details a
     JOIN grades b ON a.grade::text = b.grade::text
     JOIN subjects c ON a.subject_id = c.subject_id AND c.parent_id = 0
     JOIN subject_registers d ON a.student_id = d.student_id AND d.subject_id = c.subject_id and a.season_id = d.season_id
     JOIN subject_sections e ON a.subject_section_id = e.subject_section_id
     JOIN level_sections f ON e.level_section_id = f.level_section_id
     JOIN sections g ON g.section_id = f.section_id
     JOIN seasons h ON h.season_id = a.season_id and a.institute_id = h.institute_id;
     
CREATE OR REPLACE VIEW staff_section_list AS  SELECT a.subject_section_id,
    a.staff_id,
    concat(b.name, ' - ', c.name) AS name,
    a.season_id
   FROM assigned_staffs a
     JOIN subjects b ON a.subject_id = b.subject_id
     JOIN sections c ON a.section_id = c.section_id AND b.is_integrated = false;
     
CREATE OR REPLACE VIEW staff_parent_subject_list AS SELECT a.offered_subject_id,
    a.staff_id,
    b.name,
    a.season_id
   FROM assigned_staffs a
     JOIN subjects b ON a.subject_id = b.subject_id AND b.parent_id = 0;
     

CREATE OR REPLACE VIEW staff_section_integrated_list AS  SELECT a.subject_section_id,
    a.staff_id,
    concat(b.name, ' - ', c.name) AS name,
    a.season_id
   FROM assigned_staffs a
     JOIN subjects b ON a.subject_id = b.subject_id
     JOIN sections c ON a.section_id = c.section_id;