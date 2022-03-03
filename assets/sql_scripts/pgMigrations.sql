CREATE OR REPLACE FUNCTION random_between(low BIGINT ,high BIGINT) 
   RETURNS INT AS
$$
BEGIN
   RETURN floor(random()* (high-low + 1) + low);
END;
$$ language 'plpgsql' STRICT;

ALTER TABLE programs ADD COLUMN sections_required boolean NOT NULL DEFAULT TRUE;

ALTER TABLE student_enrollments ADD COLUMN total_credits numeric(4,2) NOT NULL DEFAULT 0.00;
ALTER TABLE student_enrollments ADD COLUMN barcode text NOT NULL  DEFAULT random_between(0,999999999);

ALTER TABLE staffs ADD UNIQUE (email);
ALTER TABLE subjects ADD COLUMN slno bigint DEFAULT 0;

-- added program name 
DROP VIEW student_details;
CREATE VIEW student_details AS
SELECT 
a.institute_id,
a.student_id,
a.name,
a.department_id,
b.name as department_name,
a.phone_number,
a.usn,
c.name as semester,
e.name as section,
f.name as program_name
FROM students a
  join departments b 
  on a.department_id = b.department_id
  join levels c
  on a.level_id = c.level_id
  join level_sections d
  on a.level_section_id = d.level_section_id
  join sections e
  on d.section_id = e.section_id
  join programs f
  on a.program_id = f.program_id;

-- Adding 3 new degress Mtech and MBA
INSERT INTO "public"."degrees"("degree_id","institute_id","name","code","is_active","created_at","updated_at")
VALUES
(3,1,E'Master\'s Of Technology',E'M.Tech',TRUE,NULL,NULL),
(4,1,E'Master\'s Of Computer Application',E'MCA',TRUE,NULL,NULL);

-- Adding 2 new departments MTECH and MBA
INSERT INTO "public"."departments"("department_id","institute_id","name","code","phone_number","email","address_line1","address_line2","city","state","pincode","country","is_active","created_at","updated_at")
VALUES
(19,1,'Masters of Computer Application','MCA','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(20,1,'Masters of Business Adminstration','MBA','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL);

--Adding new Programs for MTECH MBA and MCA
INSERT INTO "public"."programs"("program_id","degree_id","department_id","institute_id","name","code","sections_required","is_active")
VALUES
(14,3,1,1,'Masters In Construction Technology','',FALSE,TRUE),
(15,3,1,1,'Masters In Environmental Engineering','',FALSE,TRUE),
(16,3,1,1,'Masters In Transportation Engineering and Management','',FALSE,TRUE),
(17,3,2,1,'Masters In Machine Design','',FALSE,TRUE),
(18,3,2,1,'Masters In Manufacturing Science and Engineering','',FALSE,TRUE),
(19,3,2,1,'Masters In Thermal Engineering','',FALSE,TRUE),
(20,3,3,1,'Masters In Power Electronics','',FALSE,TRUE),
(21,3,4,1,'Masters In Electronics','',FALSE,TRUE),
(22,3,4,1,'Masters In Digital Communication','',FALSE,TRUE),
(23,3,6,1,'Masters In Computer Science and Engineering','',FALSE,TRUE),
(24,3,6,1,'Masters In Computer Network Engineering','',FALSE,TRUE),
(25,3,12,1,'Masters In Chemical Engineering','',FALSE,TRUE),
(26,3,11,1,'Masters In BIO MEDICAL SIGNAL PROCESSING AND INSTRUMENTATION','',FALSE,TRUE),
(27,3,4,1,'Masters In VLSI Design & Embedded Systems','',FALSE,TRUE),
(28,4,19,1,'Masters In Computer Application','',FALSE,TRUE),
(29,2,20,1,'Masters In Business Admistration','',TRUE,TRUE);

-- adding new levels to MCA MBA and MTECH

INSERT INTO "public"."levels"("level_id","institute_id","degree_id","level_seq","name","code","is_active")
VALUES
(9,1,2,0,'I SEM','',TRUE),
(10,1,2,1,'II SEM','',TRUE),
(11,1,2,2,'III SEM','',TRUE),
(12,1,2,3,'IV SEM','',TRUE),
(13,1,3,0,'I SEM','',TRUE),
(14,1,3,1,'II SEM','',TRUE),
(15,1,3,2,'III SEM','',TRUE),
(16,1,3,3,'IV SEM','',TRUE),
(17,1,4,0,'I SEM','',TRUE),
(18,1,4,1,'II SEM','',TRUE),
(19,1,4,2,'III SEM','',TRUE),
(20,1,4,3,'IV SEM','',TRUE);


-- adding new section A and B
INSERT INTO "public"."sections"("section_id","institute_id","name","description","is_active")
VALUES
(29,1,'A','',TRUE),
(30,1,'B','',TRUE);

-- Inserting new level Sections
INSERT INTO "public"."level_sections"("level_section_id","level_id","section_id","program_id","is_active")
VALUES
-- FOR MBA
(57,9,29,29,TRUE),
(58,10,29,29,TRUE),
(59,11,29,29,TRUE),
(60,12,29,29,TRUE),
(61,9,30,29,TRUE),
(62,10,30,29,TRUE),
(63,11,30,29,TRUE),
(64,12,30,29,TRUE),
-- FOR MCA
(65,17,29,28,TRUE),
(66,18,29,28,TRUE),
(67,19,29,28,TRUE),
(68,20,29,28,TRUE),
-- FOR MTECH 
--I sem
(69,13,29,14,TRUE),
(70,13,29,15,TRUE),
(71,13,29,16,TRUE),
(72,13,29,17,TRUE),
(73,13,29,18,TRUE),
(74,13,29,19,TRUE),
(75,13,29,20,TRUE),
(76,13,29,21,TRUE),
(77,13,29,22,TRUE),
(78,13,29,23,TRUE),
(79,13,29,24,TRUE),
(80,13,29,25,TRUE),
(81,13,29,26,TRUE),
(82,13,29,27,TRUE),

--II sem
(83,14,29,14,TRUE),
(84,14,29,15,TRUE),
(85,14,29,16,TRUE),
(86,14,29,17,TRUE),
(87,14,29,18,TRUE),
(88,14,29,19,TRUE),
(89,14,29,20,TRUE),
(90,14,29,21,TRUE),
(91,14,29,22,TRUE),
(92,14,29,23,TRUE),
(93,14,29,24,TRUE),
(94,14,29,25,TRUE),
(95,14,29,26,TRUE),
(96,14,29,27,TRUE);

--joined on subject details instead of offered subject details
DROP VIEW student_subject_results;
CREATE VIEW student_subject_results AS  SELECT a.institute_id,
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



CREATE VIEW grade_card_student_details AS 
 SELECT 
 	a.institute_id,
 	a.student_id,
    b.name AS student_name,
    b.usn,
    c.level_id,
    a.season_id,
    e.name AS season_name,
    a.cgpa,
    a.sgpa,
    a.barcode,
    a.obtained_credits,
    a.registered_credits,
    a.total_credits,
    d.name AS level_name,
    f.name AS department_name,
    g.program_id,
    g.degree_id
   FROM student_enrollments a
     JOIN students b ON a.student_id = b.student_id
     JOIN level_sections c ON a.level_section_id = c.level_section_id
     JOIN levels d ON c.level_id = d.level_id
     JOIN seasons e ON a.season_id = e.season_id
     JOIN departments f ON b.department_id = f.department_id
     JOIN programs g ON b.program_id = g.program_id;
     
INSERT INTO "public"."grades" ("grade", "institute_id", "seq_no", "min_marks", "grade_points")
VALUES
('PP', 1, 11, -1, 0.0),
('NP', 1, 12, -1, 0.0);

