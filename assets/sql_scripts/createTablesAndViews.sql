Do $$ DECLARE
  r RECORD;
BEGIN
  FOR r IN (SELECT tablename FROM pg_tables WHERE schemaname = current_schema()) LOOP
  	raise notice 'droping table: %', r.tablename;
    EXECUTE 'DROP TABLE ' || quote_ident(r.tablename) || ' CASCADE';
  END LOOP;
END $$;

CREATE OR REPLACE FUNCTION random_between(low BIGINT ,high BIGINT) 
   RETURNS INT AS
$$
BEGIN
   RETURN floor(random()* (high-low + 1) + low);
END;
$$ language 'plpgsql' STRICT;

-- ----- master tables  -----------
-- masters-1 : organizational units
CREATE TABLE trusts (
  trust_id BIGSERIAL PRIMARY KEY,
  name character varying NOT NULL DEFAULT '',
  email character varying NOT NULL DEFAULT '',
  address_line1 character varying NOT NULL DEFAULT '',
  address_line2 character varying NOT NULL DEFAULT '',
  city character varying NOT NULL DEFAULT '',
  state character varying NOT NULL DEFAULT '',
  pincode character varying NOT NULL DEFAULT '',
  country int NOT NULL DEFAULT 130,
  govt_code character varying NOT NULL DEFAULT '',
  phone_number character varying NOT NULL DEFAULT '',
  account_status character varying NOT NULL DEFAULT 'NA',
  is_active boolean DEFAULT TRUE, 
  created_at timestamp,
  updated_at timestamp
);

CREATE TABLE institutes (
  institute_id BIGSERIAL PRIMARY KEY,
  trust_id bigint NOT NULL,
  name character varying NOT NULL,
  institute_type character varying NOT NULL DEFAULT '',
  address_line1 character varying NOT NULL DEFAULT '',
  address_line2 character varying NOT NULL DEFAULT '',
  city character varying NOT NULL DEFAULT '',
  state character varying NOT NULL DEFAULT '',
  pincode character varying NOT NULL DEFAULT '',
  country int NOT NULL DEFAULT 130,
  govt_code character varying NOT NULL DEFAULT '',
  phone_number character varying NOT NULL DEFAULT '',
  email character varying NOT NULL DEFAULT '',
  is_active boolean DEFAULT TRUE, 
  created_at timestamp,
  updated_at timestamp
);

-- parameters at the institite that change periodically.
-- these are to be maintained differemtly from the institute table
CREATE TABLE institute_configurations (
  institute_id bigint NOT NULL PRIMARY KEY,
  current_season bigint NOT NULL,
  institute_type_id bigint NOT NULL,
  auto_subject_registration BOOLEAN NOT NULL,
  auto_roll_over_subjects BOOLEAN NOT NULL,
  auto_roll_over_enrollment BOOLEAN NOT NULL,
  min_attendance_for_eligibility int NOT NULL default 0,
  min_attendance_for_exemption int NOT NULL default 0,
  -- code for an answer paper uses seq no, but we need to use fied width.
  -- e.g. S1PHY0001in this case width is 4 
  answer_packet_seq_width int NOT NULL default 4,
  nbr_papers_per_packet int not null default 10,
  min_marks_for_autoreval int not null default 20,
  max_marks_for_auotreval int not null default 30,
  acceptable_marks_deviation int not null default 16,
  results_announced BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE departments (
  department_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  name character varying NOT NULL,
  code character varying NOT NULL DEFAULT '',
  phone_number character varying NOT NULL DEFAULT '',
  email character varying NOT NULL DEFAULT '',
  address_line1 character varying NOT NULL DEFAULT '',
  address_line2 character varying NOT NULL DEFAULT '',
  city character varying NOT NULL DEFAULT '',
  state character varying NOT NULL DEFAULT '',
  pincode character varying NOT NULL DEFAULT '',
  country int NOT NULL DEFAULT 130,
  is_active boolean DEFAULT TRUE, 
  created_at timestamp,
  updated_at timestamp
);

-- sections are 'operating units' in which a subject is taught to a set of students.
-- it may also be used to enroll students in a level into managable sub-groups.
-- While these two usages are thearetically independent, in most cases they are tied to each other.
-- the default is to tie the two togetherm and allow exceptions to that.
-- that is, a student enrolled in a level-section will study a subject in that section by default.
CREATE TABLE sections (
  section_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  name character varying NOT NULL,
  description character varying NOT NULL DEFAULT '',
  is_active boolean DEFAULT TRUE, 
  created_at timestamp,
  updated_at timestamp
);

-- masters-2 : academic units
CREATE TABLE degrees (
  degree_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  name character varying NOT NULL,
  code character varying NOT NULL DEFAULT '',
  is_active boolean DEFAULT TRUE, 
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
CREATE TABLE programs (
  program_id  BIGSERIAL PRIMARY KEY,

-- a program leads to a degree
  degree_id bigint NOT NULL,

-- offered/managed/anchored by a department
  department_id bigint NOT NULL,
  institute_id bigint NOT NULL,
  name character varying NOT NULL,
  code character varying NOT NULL DEFAULT '',
  sections_required boolean DEFAULT FALSE,
  is_active boolean DEFAULT TRUE, 
  created_at timestamp,
  updated_at timestamp
);

-- a degree has levels. like semesters, years, units.
CREATE TABLE levels (
  level_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  degree_id bigint NOT NULL,
  
  -- seq should be 1 to n where n is the number of levels in this degree
  level_seq integer NOT NULL,
  name character varying NOT NULL,
  code character varying NOT NULL DEFAULT '',
  is_active boolean DEFAULT TRUE, 
  created_at timestamp,
  updated_at timestamp,
  
  UNIQUE (degree_id,level_seq)
);

-- level-section could be for a degree-level or for a program-level
-- as of now we are using it for degree-level. May require tweaking when we use it for program
CREATE TABLE level_sections (
  level_section_id BIGSERIAL PRIMARY KEY,
  level_id bigint NOT NULL, 
  section_id bigint NOT NULL,

--  0  if sections common across the departments / progrm_id for department wise sections
  program_id bigint  NOT NULL DEFAULT 0, 

  is_active boolean DEFAULT TRUE,
  UNIQUE (level_id, program_id, section_id)
);

-- masters-3 : users/humans
-- any one who can use this applicaiton.
CREATE TABLE users (
  user_id BIGSERIAL PRIMARY KEY,
  -- default institute for a trustee. It is THE instittute for all other users 
  institute_id bigint NOT NULL,
 --- de-normalized for ease of use 
  trust_id bigint NOT NULL,
  -- one of Trustee, Student, Staff, Guardian, Extern, App
  user_type character varying NOT NULL,
  -- login-id remains same for a student across institutes, possibly across trusts
  login_id character varying NOT NULL,
  password character varying NOT NULL,
  login_enabled boolean NOT NULL DEFAULT False,
  login_token character varying NOT NULL DEFAULT '',
  previous_login_at timestamp,
  current_login_at timestamp,
  current_login_ip character varying NOT NULL DEFAULT '',
  previous_login_ip character varying NOT NULL DEFAULT '',
  login_count bigint NOT NULL DEFAULT 0,
  reset_password_sent_at character varying,
  reset_password_count bigint ,
  confirmation_token character varying NOT NULL DEFAULT '',
  force_password_reset boolean  NOT NULL DEFAULT FALSE,
  is_active boolean not null default true,
  created_at timestamp,
  updated_at timestamp
);


CREATE TABLE trustees (
  -- trustee id is the user id of this trustee.
  trustee_id bigint NOT NULL,
  trust_id bigint NOT NULL,
  name character varying NOT NULL,
  email character varying NOT NULL DEFAULT '',
  phone_number character varying NOT NULL DEFAULT '',
  designation character varying NOT NULL DEFAULT '',
  created_at timestamp,
  updated_at timestamp
);

CREATE TABLE admins (
  -- admin id is the user id of this admin.
  admin_id bigint NOT NULL,
  institute_id bigint NOT NULL,
  name character varying NOT NULL,
  email character varying NOT NULL DEFAULT '',
  phone_number character varying NOT NULL DEFAULT '',
  created_at timestamp,
  updated_at timestamp
);

CREATE TABLE staffs (
  -- userId is used as staffId. It is not generated
  staff_id bigint NOT NULL,
  institute_id bigint NOT NULL,
  department_id bigint NOT NULL,
  emp_id character varying NOT NULL DEFAULT '',
  first_name character varying NOT NULL DEFAULT '',
  middle_name character varying NOT NULL DEFAULT '',
  last_name character varying NOT NULL DEFAULT '',
  display_name character varying NOT NULL DEFAULT '',
  date_of_birth date,
  spouse_name character varying NOT NULL DEFAULT '',
  father_name character varying NOT NULL DEFAULT '',
  address_line1 character varying NOT NULL DEFAULT '',
  address_line2 character varying NOT NULL DEFAULT '',
  city character varying NOT NULL DEFAULT '',
  state character varying NOT NULL DEFAULT '',
  pincode character varying NOT NULL DEFAULT '',
  country int NOT NULL DEFAULT 130,
  phone_number character varying NOT NULL DEFAULT '',
  email character varying NOT NULL DEFAULT '',
  gender character varying NOT NULL DEFAULT 'NA',
  date_of_joining date,
  date_of_leaving date,
  reason_for_leaving character varying NOT NULL DEFAULT '',
  -- designationis optional, and is required only if the staff is given app access
  designation_id bigint NOT NULL default 0,
  created_at timestamp,
  updated_at timestamp,
  UNIQUE (email)
);

-- designations are specific to an institute.
-- they are used for granting access to pages for staff.
CREATE TABLE designations(
  -- generated key
  designation_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  name character varying NOT NULL,
  code character varying NOT NULL DEFAULT '',
  -- server will do access control by service, but client needs to do it by page.
  -- client app keeps track of have delegated the pages to the client-app.
  -- client uses a comma separated list as a string
  -- for the server, this is just a string
  allowed_pages character varying NOT NULL DEFAULT '',
  is_active boolean not null DEFAULT TRUE, 
  created_at timestamp,
  updated_at timestamp
);


CREATE TABLE students (
  -- student-id is the user-idof this student. Not generated
  student_id bigint NOT NULL,
  institute_id bigint NOT NULL,
  -- a student can be pursuing only one program.
  program_id bigint NOT NULL,
 
  -- de-normalized field
  department_id bigint NOT NULL,

  -- current level/section. De-normalized from student_enrollments.
  -- that is, these two fields are also present in student_enrollments with season_id = current season
  level_id  bigint NOT NULL default 0,
  level_section_id bigint NOT NULL default 0,
  academic_regulation_id BIGINT NOT NULL DEFAULT 1,
  -- temp usn is used till the student gets the real usn.
  temp_usn character varying NOT NULL DEFAULT '',

  -- carries temp-usn till the student gets a real usn.
  usn character varying NOT NULL DEFAULT '',
  name character varying NOT NULL,
  present_address_line1 character varying NOT NULL DEFAULT '',
  present_address_line2 character varying NOT NULL DEFAULT '',
  present_city character varying NOT NULL DEFAULT '',
  present_state character varying NOT NULL DEFAULT '',
  present_pincode character varying NOT NULL DEFAULT '',
  present_country int NOT NULL DEFAULT 130,
  address_line1 character varying NOT NULL DEFAULT '',
  address_line2 character varying NOT NULL DEFAULT '',
  city character varying NOT NULL DEFAULT '',
  state character varying NOT NULL DEFAULT '',
  pincode character varying NOT NULL DEFAULT '',
  country int NOT NULL DEFAULT 130,
  phone_number character varying NOT NULL DEFAULT '',
  email character varying NOT NULL DEFAULT '',
  gender character varying NOT NULL DEFAULT 'NA',
  admission_quota character varying NOT NULL DEFAULT '',
  admission_date date,
  blood_group character varying NOT NULL DEFAULT '',
  religion character varying NOT NULL DEFAULT '',
  caste character varying NOT NULL DEFAULT '',
  nationality character varying NOT NULL DEFAULT '',
  category character varying NOT NULL DEFAULT '',
  personal_id character varying NOT NULL DEFAULT '',
  date_of_birth date,
  place_of_birth character varying NOT NULL DEFAULT '',
  domicile_state character varying NOT NULL DEFAULT '',
  previous_board character varying NOT NULL DEFAULT '',
  previous_class character varying NOT NULL DEFAULT '',
  previous_institute character varying NOT NULL DEFAULT '',
  qualifying_exam_rank character varying NOT NULL DEFAULT 0,
  is_active boolean DEFAULT TRUE, -- do we need this as user has the boolean active  ?
  created_at timestamp,
  updated_at timestamp
);


CREATE TABLE guardians (
  guardian_id bigint NOT NULL,
  institute_id bigint NOT NULL,
  student_id bigint NOT NULL,
  relation_type character varying NOT NULL,
  occupation character varying NOT NULL DEFAULT '',
  annual_salary bigint NOT NULL DEFAULT 0,
  qualification character varying NOT NULL DEFAULT '',
  name character varying NOT NULL,
  address_line1 character varying NOT NULL DEFAULT '',
  address_line2 character varying NOT NULL DEFAULT '',
  city character varying NOT NULL DEFAULT '',
  state character varying NOT NULL DEFAULT '',
  pincode character varying NOT NULL DEFAULT '',
  country int NOT NULL DEFAULT 130,
  phone_number character varying NOT NULL DEFAULT '',
  email character varying NOT NULL DEFAULT '',
  gender character varying NOT NULL DEFAULT 'NA',
  created_at timestamp,
  updated_at timestamp
);

-- users who are external to this institute. e.g. evaluators
CREATE TABLE externals (
  external_id bigint NOT NULL PRIMARY KEY,
  institute_id bigint NOT NULL,
  department_id bigint NOT NULL,
  name character varying NOT NULL DEFAULT '',
  phone_number character varying NOT NULL DEFAULT '',
  email character varying NOT NULL DEFAULT '',
  college_name character varying NOT NULL DEFAULT '',
  is_active boolean not null default true,
  created_at timestamp,
  updated_at timestamp
);

-- masters-4: subjetcs

-- an assesment scheme consists of a number of assessments that are to be conducted.
-- a subject will have am assessment_scheme as a default, but it can choose one for a given season
-- we use a header-detail pattern with assessment_scheme and assessments
CREATE TABLE assessment_schemes (
  assessment_scheme_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  name character varying NOT NULL,
  code character varying NOT NULL DEFAULT '',
  cie_calculation character varying NOT NULL default '',
  min_cie_marks int NOT NULL default 0,
  is_active  boolean NOT NULL DEFAULT TRUE,
  is_terminal boolean default false,
  created_at timestamp,
  updated_at timestamp
);

-- assessments within an assessment_schema.
-- note that there may be more than one assessments of the same type within  scheme.
-- for exmple first-test and second-test. both are of sane type. Hence the name attribute is to be used properly
CREATE TABLE assessment_items (
  institute_id bigint NOT NULL,
  assessment_scheme_id bigint NOT NULL,
  seq_no int NOT NULL,
  name character varying NOT NULL,
  max_marks int NOT NULL,
  PRIMARY KEY(assessment_scheme_id, seq_no)
);

CREATE TABLE subject_types (
  subject_type_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  name character varying NOT NULL,

-- integrated is used as a type now, hence this boolean.
-- this concept mey require changes as we add more funcitonality
  is_integrated boolean not null DEFAULT FALSE,
  created_at timestamp,
  updated_at timestamp
);

CREATE TABLE subjects (
  subject_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  
  -- offered/anchored/managed by this department. 
  -- May be taught by staff from other departments.
  department_id bigint NOT NULL,

  subject_type_id bigint NOT NULL,
  name character varying NOT NULL,
  code character varying NOT NULL DEFAULT '',
  
  -- for an integrated subject credits are sum of of cedits from its child subjects
  lecture_credits bigint NOT NULL DEFAULT 0,
  practical_credits bigint NOT NULL DEFAULT 0,
  tutorial_credits bigint NOT NULL DEFAULT 0,
  total_credits bigint NOT NULL DEFAULT 0,
  
  -- if this subject is a child of an integrated subject
  parent_id  bigint NOT NULL DEFAULT 0, 
  is_elective boolean NOT NULL DEFAULT FALSE,
  
  --prefix to be added the answer-paper-packet-id
  packet_prefix character varying not null default '',
  -- de-normalized from subject_types
  is_integrated boolean NOT NULL DEFAULT FALSE,
  -- scheme of grading to be used for this subject
  grading_scheme_id BIGINT NOT NULL DEFAULT 1,

  is_attendance_required boolean DEFAULT TRUE,
  
  is_active  boolean NOT NULL DEFAULT TRUE,
  slno bigint DEFAULT 0,
  exams_required boolean NOT NULL DEFAULT true,
  is_printed_in_hallticket boolean NOT NULL DEFAULT true,
  alternate_required boolean NOT NULL DEFAULT false,
  created_at timestamp,
  updated_at timestamp
);

-- final result for a subject could be marks or grade.
-- we are starting with the simplest scheme
-- grades are sequenced, from 1 to n, best to worst, with each one specifying the minMarks
-- obviously, the last one should have 0 as the minMarks
CREATE TABLE grades (
  grade character varying NOT NULL,
  institute_id bigint NOT NULL,
  -- to accomodate different academic regulations 
  -- and different subject grading schemes
  academic_regulation_id BIGINT NOT NULL DEFAULT 1,
  grading_scheme_id BIGINT NOT NULL DEFAULT 1,
  
  grade_points numeric(3,1) NOT NULL DEFAULT 0.0,
  -- 1 to n with no gaps. 1 being the best.
  seq_no int not null,
  -- min marks (inclusive) for this grade. 
  min_marks int not null,
  -- is this grade a passing grade?
  is_pass_grade boolean NOT NULL DEFAULT TRUE,
  PRIMARY KEY(institute_id,academic_regulation_id,grade)
);

--  TRNSACTIONS ---
-- all trnsctions happen in a season.
CREATE TABLE seasons (
  season_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  name character varying NOT NULL,
  code character varying NOT NULL DEFAULT '',
  course_reg_start_date timestamp,
  course_reg_end_date timestamp,
  season_start_date timestamp,
  season_end_date timestamp,
  is_active boolean DEFAULT TRUE,
  is_supplementary boolean DEFAULT FALSE
);
-- cie activities are managed prbably at program level. 
-- As of now, we are using instituteId as the key but we will revise this.
-- fields are "current-values", UX should ensure that these are set/reset at appropriate time
CREATE TABLE cie_activities (
  institute_id bigint NOT NULL,
  attendance_entry_frozen boolean NOT NULL default false,
  cie_entry_frozen boolean NOT NULL default false
);

-- valuation activities are managed prbably at program level. 
-- As of now, we are using instituteId as the key but we will revise this.
-- fields are "current-values", UX should ensure that these are set/reset at appropriate time
CREATE TABLE valuation_activities (
  institute_id bigint NOT NULL,
  is_valuation_frozen boolean NOT NULL default false,
  is_grades_calculated boolean NOT NULL default false,
  -- prefix to be used while generating a bundle of answer-paper to make it unque across seasons
  -- also, this is changed for regular and makeup
  answer_packet_prefix character varying not null default '',

  -- in case makeup exams are allowed, this field is set at true when th process starts
  makeup_exam_initiated boolean not null default false,
  -- 0 valuaiton not active, 1-initial, 2-reval, 3-challenge
  current_valuation_round integer not null default 0,
  makeup_answer_packet_prefix character varying not null default ''
);

-- transctions-1 : academic(subject) related

-- A subject is offered in a season. 
-- When an integrated subject is offered, it's children are automatically offered
CREATE TABLE offered_subjects (
  offered_subject_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  
  -- conceptual keys
  subject_id bigint NOT NULL,
  season_id bigint NOT NULL,

  -- a subject can be offered, in practice to more than on levels.
  -- however, we are restricting it as of now.
  degree_id bigint not null,
  level_id bigint not null,
  
  --cie/eligibility related
  assessment_scheme_id bigint not null default 0,
  cie_frozen boolean NOt NULL default false,
  attendance_frozen boolean NOT NULL default false,
  
  -- answer paper code, once generated, should not be generated again..
  code_generated boolean NOT NULL default false,
  
  -- de-normalized fields for convenience
  department_id bigint NOT NULL,
  is_integrated bool not null,
  is_child bool not null default false,

  --weight and max marks for the subjects
  max_cie_marks integer NOT NULL,
  cie_weightage integer NOT NULL,
  max_see_marks integer NOT NULL,
  see_weightage integer NOT NULL,
  requires2 boolean default false,

  created_at timestamp,
  updated_at timestamp,
  UNIQUE (subject_id, season_id)
);

-- sections in which a subject is offered. 
-- integrated subjects are NOT inserted here. their child subjects are.
CREATE TABLE subject_sections (
  subject_section_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  offered_subject_id bigint NOT NULL,
  section_id bigint NOT NULL,
  subject_id bigint NOT NULL,
  level_section_id bigint default 0 NOT NULL, -- auto-generated based on sections in the degree-level to which this subject os offered
  season_id bigint NOT NULL,
  total_classes int default 0 NOT NULL,
  attendance_frozen boolean NOT NULL default false,
  cie_frozen boolean NOT NULL default false,
  created_at timestamp,
  updated_at timestamp,
  UNIQUE(subject_id, section_id, season_id)
);

-- a staff is assigned to handle a subject-section
CREATE TABLE assigned_staffs ( 
  subject_section_id bigint NOT NULL,
  staff_id bigint NOT NULL,
  institute_id bigint NOT NULL,
  offered_subject_id bigint NOT NULL,
  subject_id bigint NOT NULL,
  section_id bigint NOT NULL,
  season_id bigint NOT NULL,
  created_at timestamp,
  updated_at timestamp,
  PRIMARY KEY (subject_section_id, staff_id),
  UNIQUE(subject_id, section_id, season_id, staff_id)
);

-- a staff is assigned to handle attendance/cie at subject level
CREATE TABLE assigned_staff_subjects ( 
  offered_subject_id bigint NOT NULL,
  staff_id bigint NOT NULL,
  institute_id bigint NOT NULL,
  subject_id bigint NOT NULL,
  season_id bigint NOT NULL,
  created_at timestamp,
  updated_at timestamp,
  PRIMARY KEY (offered_subject_id, staff_id)
);

-- Transactions-2 : students' participation in academics
-- in a season, a student enrolls for a level of his/her prgram in a secific section of that level
CREATE TABLE student_enrollments (
  student_id bigint,
  season_id bigint,
  institute_id bigint NOT NULL,
  program_id bigint NOT NULL,
  level_section_id bigint NOT NULL,
  hall_ticket_printed boolean NOT NULL DEFAULT false,
  sgpa numeric(4,2) NOT NULL DEFAULT 0.00,
  cgpa numeric(4,2) NOT NULL DEFAULT 0.00,
  registered_credits numeric(4,1) NOT NULL DEFAULT 0.00,
  obtained_credits numeric(4,1) NOT NULL DEFAULT 0.00,
  total_credits numeric(4,2) NOT NULL DEFAULT 0.00,
  barcode text NOT NULL DEFAULT random_between(0::bigint, 999999999::bigint),
  usn character varying,
  project_title character varying DEFAULT ''::character varying,
  created_at timestamp,
  updated_at timestamp,
  CONSTRAINT student_enrollments_pkey PRIMARY KEY (student_id, season_id)
);

-- a student has opted to sit in a section for this subject.
CREATE TABLE subject_registers (
  subject_register_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  subject_id bigint NOT NULL,
  section_id bigint NOT NULL,
  student_id bigint NOT NULL,
  season_id bigint NOT NULL,
  offered_subject_id bigint NOT NULL,
  subject_section_id bigint NOT NULL,
  -- attendance related
  total_classes int  default 0 NOT NULL,
  total_attendance int  default 0 NOT NULL,
  overall_attendance character varying NOT NULL default '',
  has_attendance_shortage boolean NOT NULL default true,
  is_condonable boolean NOT NULL default false, 
  attendance_entered_by bigint NOT NULL default 0,
  is_condoned boolean NOT NULL default FALSE,
  condoned_by_user bigint NOT NULL default 0,
  -- exam/eligibility realted fields. should be logically treated as as a different row
  cie_marks integer NOT NULL default 0,
  has_cie_shortage boolean NOT NULL default true,

  -- set based on business rules
  is_eligible_for_exam boolean NOT NULL default FALSE,
  has_attended_exam boolean not null default false,

  -- institute may offer makeup exam
  is_eligible_for_makeup boolean not null default false,
  has_opted_for_makeup boolean NOT NULL default FALSE,
  has_attended_makeup boolean not null default false,
  is_eligible_to_withdraw boolean NOT NULL default true,
  has_withdrawn boolean NOT NULL default false,
  is_authorized_absence boolean NOT NULL default false,
  -- marks from terminal exam. in case of makeup, makeup marks over-rides regualr exam
  -- final marks and grade are set and reset based on valuations/makeup etc..
  -- history is mot mainitained here, as it is available in packets and papers
  exam_marks int not null default 0,
  effective_marks int not null default 0, 
  grade character varying not null default '',
  alternate_name character varying DEFAULT ''::character varying,
  created_at timestamp,
  updated_at timestamp,
  -- we decided not to store answer-paper-id here. 
  -- answer_papers has subject_register_id for us to link it back here
  UNIQUE(subject_id, student_id, season_id)
);

-- assessment of students in subjects.
-- rows are added automatically when a student is enrolled
-- we have all kinds of referred ids here, because we expect filters based on these ids
CREATE TABLE student_assessments (
  student_assessment_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  season_id bigint NOT NULL,
  offered_subject_id bigint NOT NULL,
  subject_section_id bigint NOT NULL,
  subject_register_id bigint NOT NULL,
  assessment_scheme_id bigint NOT NULL,
  assessment_seq_no int NOT NULL,
  student_id bigint NOT NULL,
  section_id bigint NOT NULL,
  has_attended boolean NOT NULL DEFAULT FALSE,
  marks_scored numeric(5,2) NOT NULL DEFAULT 0.0,
  entered_by_user_id bigint  NOT NULL default 0,
  created_at timestamp,
  updated_at timestamp,
  UNIQUE(subject_register_id, assessment_seq_no)
);

-- approvals for attendaance/cie changes sfter freeze
CREATE TABLE approvals (
  approval_id BIGSERIAL PRIMARY KEY,
  
  institute_id bigint NOT NULL,
  -- current season is used to show the list.
  season_id bigint NOT NULL,

  --request_type is Attendance, Cie. Defined as enum in Java
  request_type character varying NOT NULL,

  -- pointer to the relevant table where the approved value is to be used
  -- subject_register_id for attendance and student_assessment_id for cie 
  internal_ref_id bigint NOT NULL,
  -- text is formed based on th etype of request.
  -- subjectname for attendance, + testName for cie
  ref_text character varying NOT NULL,

  -- studet details are de-normalized fields
  usn character varying NOT NULL,
  name character varying NOT NULL,

  -- narration has the reason for seeking approval
  narration character varying NOT NULL,
  old_value character varying NOT NULL,
  new_value character varying NOT NULL,
  
  -- id of the staff making this request
  requested_by_staff bigint NOT NULL,
  requested_date date NOT NULL,
  
  -- contact person and phone are copied by default from staff, but can be changed at the time of request 
  contact_person character varying NOT NULL,
  contact_phone character varying NOT NULL default '',

  --Requested, Approved, Rejected
  approval_status character varying NOT NULL,

  -- disposal details
  disposal_remarks character varying NOT NULL default '',
  disposed_date date,
  disposed_by_user bigint NOT NULL default 0,
  
  -- copied from user table 
  disposed_by_name character varying NOT NULL default ''
);

-- internal/external staff who are the evaluators for a offered subjects
CREATE TABLE evaluators ( 
  -- this is NOT generated.
  -- it is staff_id or external_id. 
  -- external and internal staff ids do not clash because they are essentially userId fromusers table
  evaluator_id bigint NOT NULL,
  offered_subject_id bigint NOT NULL,
  institute_id bigint NOT NULL,
  is_external boolean not null,
  -- redundant fields to avoid confusing joins.
  -- better to make the queries faster at the cost of complexity of insert
  name character varying NOT NULL,
  email character varying NOT NULL default '',
  phone_number character varying NOT NULL default '',
  subject_id bigint NOT NULL,
  season_id bigint NOT NULL,
  PRIMARY KEY (offered_subject_id, evaluator_id)
);

-- students who attended a terminal exam for an offered_subject
-- only eligible students can attend
-- 0,1 or 2 rows per subject_register_id
CREATE TABLE exam_attendees (
  subject_register_id bigint not null,
  is_makeup boolean not null default false,
  institute_id bigint not null,
  offered_subject_id bigint not null,
  student_id bigint not null,

  -- false on insert. updated when round-1 is finalzed
  -- false if the first round included an auto-reval because the marks was within that range 
  eligible_for_reval boolean not null default false,
  
  -- false on insert. updated based on an admin process 
  -- coded-paper rows for second-round are created for attendees with this field=true
  opted_for_reval boolean not null default false,

  -- flase on insert. set to true based on an admin process.
  -- coded-paper rows for 3rd round are created for attendees with this field=true
  opted_to_challenge boolean not null default false,

  -- 0 on insert. updated when each round is finalized
  -- not updated as and when marks in coded-paper is updated
  final_marks integer not null default 0,
  
  -- 0 on insert. updated along with final_marks.
  -- same as final_mrks, except for challenge-valuation round
  -- in challenge round, it is the marks in the challenge round
  listed_marks integer not null default 0,
  
  PRIMARY KEY (subject_register_id, is_makeup)
);

-- answer papers are coded for valuation, and organized into packets
-- coding and packets are done for each round for all the papers that are to be evaluated in that round
CREATE TABLE paper_packets (
  -- packet code is created with prefix and then serial number
  -- such that it is unique. e.g. season-evaltype-subject-nnnn
  packet_code character varying not null,
  institute_id bigint not null,
  
  -- parent key is offered_subject_id+is_makeup+valuation_round
  offered_subject_id bigint not null,
  is_makeup boolean not null default false,
  -- 1-Initial, 2-Reval, 3-Challenge are the possible values
  valuation_round integer not null,

  -- de-normalozed to avoid joinss.
  subject_name character varying not null,

  -- valuator who is currently evaluting this packet.
  -- this is equal to asshined1/2/3_id depending on the current status of this packet
  -- this is reset to 0 once the marks for that valuation is entered.
  assigned_to bigint not null default 0,
  -- initial_valuation is applicable for round1. not applicable for 2nd and 3rd
  assigned1_id bigint not null default 0,
  
  -- valuation2 happens for all in rond2/3. However, it happens for only selected one in round1
  assigned2_id bigint not null default 0,

  -- valuation3 is required based on the diff between initial and mark2  
  assigned3_id bigint not null default 0,
 
   PRIMARY KEY (institute_id, packet_code)
);

-- one exam paper has one entry per round of valuation.
-- maximum three rows per exam_attendee
CREATE TABLE coded_papers (
  --paper-code it packet-code-nn and hence is unique
  -- following two are primary keys
  paper_code character varying not null,
  institute_id bigint not null,
  
  -- it is unique by these two as well
  -- part of this packet
  subject_register_id bigint not null,
  is_makeup boolean not null default false,
  valuation_round integer not null default 0,
  -- parent key
  packet_code character varying not null,

  -- for second round, this is the effective marks from the first round
  marks1 integer not null default 0,
 
  -- In intial round, 2nd valuarion is required if the initial marks is within some ramge.
  -- or the other two rounds, this field has no meaning (it is assumed to be true)
  requires2 boolean not null default false,

  -- marks from second valuation. In the first round, this could be becuse of two reason:
  -- 1. marks is within a range (23 to 37)
  -- 2. randomly picked for moderation? (revalidaiton?)
  marks2 integer not null default 0,

  -- third valuation is required if the initial and marks 2 are way-off
  requires3 boolean not null default false,
  marks3 integer not null default 0,

  -- calculated marks based on initial, marks1 and marks2.
  -- this could be less than the initial marks.
  -- this marks is used as final in exam_attendees table, or the initial_marks based onits business logic
  effective_marks integer not null default 0,
  -- grades obtained for the effective marks in this evaluation round.
  -- this was added to maintain the history of grades obtained in each valuation round.
  grade character varying not null default '',

  -- valuation is completed if requires3 is false after entering marks2.
  -- it is also set to true in round 1 if requires2 is false,

  valuation_completed boolean not null default false,
  -- redundant field added for performance of views/joins
  offered_subject_id bigint not null,
  student_id bigint not null,
  
  PRIMARY KEY(institute_id, paper_code)
);

-- To track malpractices
CREATE TABLE malpractice_papers (
    paper_code character varying,
    institute_id bigint,
    subject_register_id bigint NOT NULL,
    is_makeup boolean NOT NULL DEFAULT false,
    valuation_round integer NOT NULL DEFAULT 0,
    packet_code character varying NOT NULL,
    marks1 integer NOT NULL DEFAULT 0,
    requires2 boolean NOT NULL DEFAULT false,
    marks2 integer NOT NULL DEFAULT 0,
    requires3 boolean NOT NULL DEFAULT false,
    marks3 integer NOT NULL DEFAULT 0,
    effective_marks integer NOT NULL DEFAULT 0,
    valuation_completed boolean NOT NULL DEFAULT false,
    offered_subject_id bigint NOT NULL,
    student_id bigint NOT NULL,
    grade character varying NOT NULL DEFAULT ''::character varying,
    CONSTRAINT malpractice_papers_pkey PRIMARY KEY (institute_id, paper_code)
);


-- To track the students who changed programs
CREATE TABLE transferred_students (
	student_id BIGINT NOT NULL,
	institute_id BIGINT NOT NULL,
	from_program_id bigint NOT NULL,
  	from_department_id bigint NOT NULL,
	from_level_id  bigint NOT NULL default 0,
	from_level_section_id bigint NOT NULL default 0,
	transferred_program_id bigint NOT NULL,
  	transferred_department_id bigint NOT NULL,
	transferred_level_id  bigint NOT NULL default 0,
	transferred_level_section_id bigint NOT NULL default 0,
	transfer_done_by BIGINT NOT NULL,
	season_id BIGINT NOT NULL,
	created_at timestamp
);

-- subjects that were unregistered by students
CREATE TABLE unregistered_subjects (
	subject_register_id BIGSERIAL PRIMARY KEY,
  institute_id bigint NOT NULL,
  subject_id bigint NOT NULL,
  section_id bigint NOT NULL,
  student_id bigint NOT NULL,
  season_id bigint NOT NULL,
  offered_subject_id bigint NOT NULL,
  subject_section_id bigint NOT NULL,
  total_classes int  default 0 NOT NULL,
  total_attendance int  default 0 NOT NULL,
  overall_attendance character varying NOT NULL default '',
  has_attendance_shortage boolean NOT NULL default true,
  is_condonable boolean NOT NULL default false, 
  attendance_entered_by bigint NOT NULL default 0,
  is_condoned boolean NOT NULL default FALSE,
  condoned_by_user bigint NOT NULL default 0,
  cie_marks integer NOT NULL default 0,
  has_cie_shortage boolean NOT NULL default true,
  is_eligible_for_exam boolean NOT NULL default FALSE,
  has_attended_exam boolean not null default false,
  is_eligible_for_makeup boolean not null default false,
  has_opted_for_makeup boolean NOT NULL default FALSE,
  has_attended_makeup boolean not null default false,
  is_eligible_to_withdraw boolean NOT NULL default true,
  has_withdrawn boolean NOT NULL default false,
  is_authorized_absence boolean NOT NULL default false,
  exam_marks int not null default 0,
  grade character varying not null default '',
  created_at timestamp,
  updated_at timestamp,
  UNIQUE(subject_register_id, student_id, season_id)
);

-- For now we have considered the fields to be 
-- irrespective of degrees. (This is done as per current requirement)
-- Degree id should be implemented here.
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

-- To main tain the different type grading such as 
-- S,A,B,C or NP,PP other instituts might have different grading
CREATE TABLE grading_schemes (
    institute_id bigint NOT NULL,
    grading_scheme_id BIGSERIAL PRIMARY KEY,
    name character varying NOT NULL
);

--- temp pdc table
CREATE TABLE pdc_temp_ug (
pdc_temp_ug_id BIGSERIAL PRIMARY KEY,
institute_id bigint NOT NULL,
date character varying NOT NULL,
pdc_no character varying NOT NULL,
usn character varying NOT NULL,
student_name character varying NOT NULL,
program_name character varying NOT NULL,
department_name character varying NOT NULL,
cgpa character varying NOT NULL,
createdAt timestamp,
updatedAt timestamp
);

CREATE TABLE terminal_assessments (
  terminal_assessment_scheme_id BIGSERIAL PRIMARY KEY,
  offered_subject_id bigint NOT NULL,
  institute_id bigint NOT NULL,
  
  -- conceptual keys
  subject_id bigint NOT NULL,
  season_id bigint NOT NULL,

  -- a subject can be offered, in practice to more than on levels.
  -- however, we are restricting it as of now.
  degree_id bigint not null,
  level_id bigint not null,
  
  --cie/eligibility related
  assessment_scheme_id bigint not null default 0,

  created_at timestamp,
  updated_at timestamp,
  UNIQUE (subject_id, season_id)
);

--   VIEWS  -----

-- views for drop-downs. refer to application.json for drop-down definitions

-- levels are defined at degree. we want them at program
CREATE VIEW program_levels as SELECT
  a.program_id,
  a.department_id,
  b.level_id,
  b.name
FROM programs a
  join levels b 
    on a.degree_id = b.degree_id 
    and b.is_active = true
  ORDER by a.program_id, b.level_seq;
  
-- get institute and season names for the ocnfig table
CREATE VIEW institute_config_details as SELECT
  a.institute_id,
  a.current_season,
  a.institute_type_id,
  a.auto_subject_registration,
  a.auto_roll_over_subjects,
  a.auto_roll_over_enrollment,
  a.min_attendance_for_eligibility,
  a.min_attendance_for_exemption,
  -- code for an answer paper uses seq no, but we need to use fied width.
  -- e.g. S1PHY0001in this case width is 4 
  a.answer_packet_seq_width,
  a.nbr_papers_per_packet,
  a.min_marks_for_autoreval,
  a.max_marks_for_auotreval,
  a.acceptable_marks_deviation,
  a.results_announced,
  b.name,
  c.name as season
  FROM institute_configurations a
    JOIN institutes b
      ON a.institute_id = b.institute_id
    JOIN seasons c
      on a.current_season = c.season_id;

-- for offerdSubjectList drop-down source. child-subjects of integrated subjects are excluded
-- alsoused as the list of subjects to be used for various down-loads
CREATE VIEW offered_subject_list as 
SELECT 
  a.offered_subject_id,
  c.department_id,
  c.institute_id,
  c.name
FROM offered_subjects as a
  join institute_configurations as b 
    on a.season_id = b.current_season
  join subjects c 
    on a.subject_id = c.subject_id 
    and c.parent_id = 0
order by name;

-- for offerdSubjectList drop-down source. child-subjects of integrated subjects are excluded
-- alsoused as the list of subjects to be used for various down-loads
CREATE VIEW all_offered_subject_list as 
SELECT 
  a.offered_subject_id,
  c.department_id,
  c.institute_id,
  c.name
FROM offered_subjects as a
  join institute_configurations as b 
    on a.season_id = b.current_season
  join subjects c 
    on a.subject_id = c.subject_id 
order by name;

-- offered_subjects includes integrated ones. We should eliminate them wen we have to go to subject-sections
CREATE VIEW taught_subject_list as 
SELECT 
  a.offered_subject_id,
  c.department_id,
  c.institute_id,
  c.name
FROM offered_subjects as a
  join institute_configurations as b 
    on a.season_id = b.current_season
  join subjects c 
    on a.subject_id = c.subject_id 
    and c.is_integrated = false;

-- offered_subjects including integrated and children
CREATE VIEW all_subject_list as 
SELECT 
  a.offered_subject_id,
  c.department_id,
  c.institute_id,
  c.name
FROM offered_subjects as a
  join institute_configurations as b 
    on a.season_id = b.current_season
  join subjects c 
    on a.subject_id = c.subject_id;

CREATE VIEW level_section_details as 
SELECT
  a.level_section_id,
  a.level_id,
  a.section_id,
  a.program_id,
  b.is_active,
  b.name
FROM level_sections a 
  join sections b
    on a.section_id = b.section_id;


-- offered subjects in the current season
CREATE VIEW current_offered_subjects as 
SELECT 
  a.offered_subject_id,
  a.subject_id
FROM offered_subjects as a
  join institute_configurations as b 
    on a.season_id = b.current_season;

-- offered subjects with details. used to send data for a create/edit of offeredSubject
CREATE OR REPLACE VIEW offered_subject_details AS  
SELECT 
  a.offered_subject_id,
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
  c.name as level_name,
  d.name as department_name,
  0 as nbr_enrolled,
  true as can_be_withdrawn,
  true as is_offered,
  b.parent_id,
  e.name as degree_name
  FROM offered_subjects a
    JOIN subjects b ON a.subject_id = b.subject_id
    JOIN levels c ON a.level_id = c.level_id
    JOIN departments d ON a.department_id = d.department_id
    JOIN degrees e ON a.degree_id = e.degree_id;

-- active subjects that are not child/components can be offered
CREATE VIEW offerable_subjects as 
SELECT
  a.institute_id,
  a.subject_id,
  a.name,
  a.code,
  b.name as department_name,
  '' as offered_sections
FROM subjects as a
  join departments b 
    on a.department_id = b.department_id
    and a.is_active = true 
    and a.parent_id = 0;
 

-- subject sections that are currently offered
CREATE VIEW current_offered_sections as 
SELECT 
  b.subject_section_id,
  b.section_id,
  b.level_section_id
FROM current_offered_subjects as a
  join subject_sections b 
    on a.offered_subject_id = b.offered_subject_id;

-- for drop-down of sections for an offered subject
CREATE VIEW subject_section_list as 
SELECT
  a.subject_section_id,
  a.offered_subject_id,
  b.name
FROM subject_sections as a
  join sections as b 
    on a.section_id = b.section_id;


-- we need section name 
CREATE VIEW subject_section_details as 
SELECT a.institute_id,
    a.subject_section_id,
    a.offered_subject_id,
    a.level_section_id,
    a.section_id,
    a.subject_id,
    a.total_classes,
    a.attendance_frozen,
    a.cie_frozen,
    b.name AS section_name,
    c.name AS subject_name,
    c.code AS subject_code,
    c.department_id,
    c.is_integrated,
    true AS is_offered,
    c.slno,
    c.parent_id,
    a.season_id
   FROM subject_sections a
     JOIN sections b ON a.section_id = b.section_id
     JOIN subjects c ON a.subject_id = c.subject_id;

-- sections to which subjects can be offered to for degree/level
CREATE VIEW offerable_sections as 
SELECT
  a.level_section_id,
  a.level_id,
  a.section_id,
  b.name,
  b.institute_id,
  0 as subject_section_id,
  0 as nbr_enrolled,
  true as can_be_withdrawn,
  false as is_offered
FROM level_sections as a
  join sections as b 
    on a.is_active = true
    and b.is_active = true 
    and a.section_id = b.section_id;

-- view for listing the programs 
CREATE VIEW program_list AS
SELECT
	a.institute_id,
    a.name as program_name,
    a.code as program_code,
    a.program_id,
    a.department_id,
    b.name as department_name,
    b.code as department_code
FROM programs a
    join departments b 
      on a.department_id = b.department_id;
    
-- view for rendering the list of subjects with department name
CREATE VIEW subject_list AS
SELECT
	a.institute_id,
	a.subject_id,
	a.name as subject_name,
	b.name as department_name,
	a.practical_credits,
	a.tutorial_credits,
	a.lecture_credits,
	a.parent_id,
	a.code,
	a.total_credits,
	a.is_active
FROM subjects a
    join departments b 
      on a.department_id = b.department_id;

CREATE VIEW staff_details AS
SELECT
  a.staff_id,
  a.emp_id,
  a.institute_id,
  b.name as department_name,
  a.department_id,
  a.first_name,
  a.middle_name,
  a.last_name,
  a.display_name,
  a.email,
  a.phone_number
FROM
  staffs a
  join departments b 
    on a.department_id = b.department_id;

-- we just need name and email of staff assigned to a subjectSection
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

-- offered-subject-id and subject-section name for drop-down-list
CREATE VIEW staff_section_list AS  SELECT a.subject_section_id,
    a.staff_id,
    concat(b.name, ' - ', c.name) AS name,
    a.season_id
   FROM assigned_staffs a
     JOIN subjects b ON a.subject_id = b.subject_id
     JOIN sections c ON a.section_id = c.section_id AND b.is_integrated = false;
	
-- offered-subject-id and subject-section name for drop-down-list including integrated subjects
CREATE OR REPLACE VIEW staff_section_integrated_list AS  SELECT a.subject_section_id,
    a.staff_id,
    concat(b.name, ' - ', c.name) AS name,
    a.season_id
   FROM assigned_staffs a
     JOIN subjects b ON a.subject_id = b.subject_id
     JOIN sections c ON a.section_id = c.section_id;

-- assignable staff for a subject-section are staff of the department the subject belongs to.
-- this veiw has fields defined with default values. These are managed by the program logic
CREATE VIEW assignable_staffs as
SELECT
  a.department_id,
  a.staff_id,
  a.display_name as name,
  a.email,
  false as is_assigned
FROM  staffs a;

-- staff who can be assigned to evaluate answer papers
-- as of now, any staff can be assigned to any subject...
CREATE VIEW assignable_evaluators as
SELECT
  s.institute_id,
  s.staff_id as evaluator_id,
  false as is_external,
  'Internal' as evaluator_type,
  s.display_name as name,
  s.email,
  s.phone_number,
  d.name as department
FROM  staffs s join departments d
  on s.department_id = d.department_id
UNION ALL
SELECT 
  e.institute_id,
  e.external_id as evaluator_id,
  true as is_external,
  'External' as evaluator_type,
  e.name,
  e.email,
  e.phone_number,
  d.name as department
FROM  externals e join departments d
  on e.department_id = d.department_id;

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

-- get list of students registered for a subject-section
CREATE VIEW registered_student_names as
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

CREATE VIEW exam_registers as  
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


-- subject-register details for attendance entry for a given student
CREATE VIEW attendance_update as
SELECT
  a.subject_register_id,
  a.institute_id,
  a.subject_id,
  a.student_id,
  a.total_attendance as current_total_attendance,
  b.name as student_name,
  b.usn,
  c.name as subject_name,
  d.name as section_name,
  CASE 
    WHEN a.total_classes > 0  THEN a.total_classes
    ELSE e.total_classes
    END as total_classes
FROM subject_registers as a
  join students as b
    on a.student_id = b.student_id
  join subjects c 
    on a.subject_id = c.subject_id
  join sections d 
    on a.section_id = d.section_id
  join subject_sections e 
    on a.subject_section_id = e.subject_section_id;
    
-- student-assessment details for marks update for a given student
CREATE VIEW marks_update as
SELECT
  a.student_assessment_id,
  a.institute_id,
  a.subject_register_id,
  a.assessment_seq_no,
  CASE
  WHEN a.has_attended THEN CAST(a.marks_scored as character varying)
    ELSE 'AB'
  END as current_marks,
  a.student_id,
  b.name as student_name,
  b.usn,
  d.subject_id,
  d.name as subject_name,
  e.name as test_name  
FROM student_assessments as a
  join students as b
    on a.student_id = b.student_id
  join offered_subjects c 
    on a.offered_subject_id = c.offered_subject_id
  join subjects d
    on c.subject_id = d.subject_id
  join assessment_items e 
    on a.assessment_scheme_id = e.assessment_scheme_id and a.assessment_seq_no = e.seq_no;
    
--- eligibility list/edit
CREATE VIEW eligibility_list as
SELECT
  a.subject_register_id,
  a.institute_id,
  a.subject_section_id,
  a.student_id,
  a.cie_marks,
  a.overall_attendance,
  a.has_attendance_shortage,
  a.has_cie_shortage,
  a.is_condoned,
  a.is_condonable,
  a.is_eligible_for_exam,
  b.name,
  b.usn
FROM subject_registers as a
  join students as b
    on a.student_id = b.student_id;

--eligibility list of students with eligible/noon-eligibble in columns--
CREATE VIEW eligibility_list_download as
SELECT
  a.subject_register_id,
  a.institute_id,
  a.subject_section_id,
  a.student_id,
  a.cie_marks,
  a.overall_attendance,
  a.has_attendance_shortage,
  a.has_cie_shortage,
  a.is_condoned,
  a.is_condonable,
  b.name,
  b.usn,
  CASE
  WHEN a.is_eligible_for_exam THEN 'ELIGIBLE'
  ELSE 'NOT ELIGIBLE'
  END as is_eligible
FROM subject_registers as a
  join students as b
    on a.student_id = b.student_id;

-- all enrolled students who can register for any subject-section
-- we did not join it with current_season. let that be handled by the filtering condition
-- is_registered column is created with false. Program logic takes care of setting this 
CREATE VIEW registerable_students as
SELECT
  a.student_id,
  a.name,
  a.usn,
  b.name as department,
  false as is_registered
FROM students a 
  join departments b 
    on a.department_id = b.department_id and a.level_id != 0;

-- used to get student-ids who have registered for a subject-section
-- used in utilities for Students based services
CREATE VIEW registered_students_list as
SELECT
  a.subject_register_id,
  a.subject_section_id,
  a.student_id
FROM subject_registers as a;

-- student details
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

 -- subject_regiser with subject name/code to pick up line items for hall-ticket
CREATE VIEW hall_ticket_subjects as
SELECT
  a.institute_id,
  a.subject_id,
  a.student_id,
  a.season_id,
  a.is_eligible_for_exam as is_eligible,
  b.name,
  b.code
FROM subject_registers a
  join subjects b 
    on a.subject_id = b.subject_id;


 -- consolidated attendance
CREATE VIEW section_attendance as
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

-- register with student details
CREATE  VIEW student_in_registers AS  
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

-- student assessment with student name/usn
CREATE VIEW student_assessment_details as
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

CREATE VIEW current_approvals as 
SELECT
  a.approval_id,
  a.institute_id,
  a.request_type,
  a.internal_ref_id,
  a.ref_text,
  a.usn,
  a.name,
  a.requested_date,
  a.contact_person,
  a.approval_status
FROM approvals a 
  join institute_configurations b 
    on a.season_id = b.current_season
ORDER BY requested_date;

CREATE VIEW pending_approvals as
SELECT
  a.approval_id,
  a.institute_id,
  a.request_type,
  a.internal_ref_id ,
  a.ref_text,
  a.usn,
  a.name,
  a.requested_date,
  a.contact_person

  FROM approvals a 
  join institute_configurations b 
    on a.season_id = b.current_season
WHERE a.approval_status = 'Requested'
ORDER BY requested_date;

-- download cie view ----------
CREATE VIEW cie_downloads as 
SELECT
	a.subject_id,
	a.offered_subject_id,
	a.subject_section_id,
	b.name as subject_name,
	b.code as subject_code,
	b.is_integrated,
	d.name as level_name,
	e.name as section_name
FROM subject_sections as a
  join subjects as b 
    on a.subject_id = b.subject_id
  join  level_sections as c
  	on a.level_section_id = c.level_section_id
  join levels as d
  	on c.level_id = d.level_id
  join sections as e
  	on a.section_id = e.section_id;

--Gte Current Enrolled student for the current season --

CREATE VIEW current_enrolled_students as 
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

--Populates CIE for each student for each subject for cie download --
CREATE VIEW student_cie_details as 
SELECT
	a.student_id,
	a.subject_section_id,
  a.subject_register_id,
	b.name as student_name,
	b.usn,
	c.name as department_name,
	a.is_eligible_for_exam as is_eligible,
	a.is_condonable,
	a.is_condoned
FROM subject_registers as a
  join students as b 
    on a.student_id = b.student_id
  join departments as c
  	on b.department_id = c.department_id;
 
-- Populates eligibility for each student for each subject for hall ticket--
CREATE VIEW hall_ticket_details AS SELECT b.institute_id,
    a.student_id,
    a.season_id,
    b.name AS subject_name,
    b.code AS subject_code,
    e.name AS program_name,
        CASE
            WHEN a.is_eligible_for_exam THEN 'ELIGIBLE'::text
            ELSE 'NOT ELIGIBLE'::text
        END AS is_eligible,
    a.is_eligible_for_makeup
   FROM subject_registers a
     JOIN subjects b ON a.subject_id = b.subject_id
     JOIN student_enrollments c ON a.student_id = c.student_id and a.season_id = c.season_id
     JOIN level_sections d ON c.level_section_id = d.level_section_id
     JOIN levels e ON d.level_id = e.level_id
  WHERE b.parent_id = 0;


--  exam paper evaluation related views ------

-- attendance for a subject with student name/usn
CREATE VIEW exam_attendee_names as
SELECT
  ea.subject_register_id,
  ea.institute_id,
  ea.is_makeup,
  ea.opted_for_reval,
  ea.eligible_for_reval,
  ea.opted_to_challenge,
  rs.subject_section_id,
  rs.offered_subject_id,
  rs.student_id,
  rs.name,
  rs.usn,
  rs.department as department,
  rs.level as level,
  rs.section as section
FROM exam_attendees as ea
  join registered_student_names as rs
    on ea.subject_register_id = rs.subject_register_id;

-- Packets details to be used for a view page
CREATE VIEW packet_details as
SELECT
  pp.packet_code,
  pp.institute_id,
  pp.is_makeup,
  pp.offered_subject_id,
  pp.valuation_round,
  pp.assigned1_id,
  pp.subject_name,
  pp.assigned_to,
  osd.code as subject_code,
  COALESCE(ev1.name, '') as name1,
  COALESCE(ev1.phone_number, '') as phone_number1,
  pp.assigned2_id,
  COALESCE(ev2.name, '') as name2,
  COALESCE(ev2.phone_number, '') as phone_number2,
  pp.assigned3_id,
  COALESCE(ev3.name, '') as name3,
  COALESCE(ev3.phone_number, '') as phone_number3
 FROM paper_packets as pp
  left join evaluators ev1
    on ev1.offered_subject_id = pp.offered_subject_id and ev1.evaluator_id = pp.assigned1_id 
  left join evaluators ev2
    on ev2.offered_subject_id = pp.offered_subject_id and ev2.evaluator_id = pp.assigned2_id 
  left join evaluators ev3
    on ev3.offered_subject_id = pp.offered_subject_id and ev3.evaluator_id = pp.assigned3_id 
  join  offered_subject_details as osd
    on pp.offered_subject_id = osd.offered_subject_id;


-- code papers with student name/usns 
CREATE VIEW coded_paper_names AS  
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
    cp.effective_marks,
    sr.has_malpracticed
   FROM coded_papers cp
     JOIN students st ON st.student_id = cp.student_id
     JOIN subject_registers sr ON cp.subject_register_id = sr.subject_register_id;

-- List of papers that were booked for malpractice
CREATE VIEW malpractice_paper_list AS  SELECT mp.paper_code,
    mp.institute_id,
    mp.subject_register_id,
    mp.is_makeup,
    mp.valuation_round,
    mp.packet_code,
    mp.offered_subject_id,
    mp.student_id,
    st.name,
    st.usn,
    mp.grade,
    mp.marks1,
    mp.marks2,
    mp.marks3,
    mp.effective_marks,
    sr.has_malpracticed
   FROM malpractice_papers mp
     JOIN students st ON st.student_id = mp.student_id
     JOIN subject_registers sr ON mp.subject_register_id = sr.subject_register_id;

-- packtes for an offered-subject meant for list-service 
CREATE OR REPLACE VIEW packet_list as SELECT pp.packet_code,
    pp.institute_id,
    pp.offered_subject_id,
    pp.valuation_round,
    pp.assigned_to,
    COALESCE(ev.name, ''::character varying) AS name,
    COALESCE(ev.phone_number, ''::character varying) AS phone_number,
        CASE WHEN pp.valuation_round=1 THEN
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
        END
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
  WHERE pp.is_makeup = va.makeup_exam_initiated;
  
  
CREATE OR REPLACE VIEW paper_list AS  SELECT cp.paper_code,
    cp.packet_code,
    cp.institute_id,
    cp.subject_register_id,
    cp.marks1,
    cp.marks2,
    cp.marks3,
    cp.requires2,
    cp.requires3,
    cp.offered_subject_id
   FROM coded_papers cp
     JOIN valuation_activities va ON cp.institute_id = va.institute_id
  WHERE cp.is_makeup = va.makeup_exam_initiated;
    
--list of students who are eligible for revaluation--
CREATE VIEW revaluation_eligible_students as
SELECT
  a.institute_id,
  a.offered_subject_id,
  a.student_id,
  a.opted_for_reval,
  a.name as student_name,
  a.usn,
  a.department as department_name,
  a.level as level_name,
  a.section as section_name
FROM exam_attendee_names as a
where a.eligible_for_reval = true;

--list of students who have opted for revaluation--
CREATE VIEW revaluation_opted_students as
SELECT
  a.institute_id,
  a.offered_subject_id,
  a.student_id,
  a.name as student_name,
  a.usn,
  a.department as department_name,
  a.level as level_name,
  a.section as section_name
FROM exam_attendee_names as a
where a.opted_for_reval = true;

-- list of students who have opted for challenge valuation
CREATE VIEW challenge_valuation_opted_students as
SELECT
  a.institute_id,
  a.offered_subject_id,
  a.student_id,
  a.name as student_name,
  a.usn,
  a.department as department_name,
  a.level as level_name,
  a.section as section_name
FROM exam_attendee_names as a
where a.opted_to_challenge = true;


-- list of students who are eligible for challenge valuation
CREATE VIEW challenge_valuation_eligible_students as
SELECT
	a.institute_id,
	a.offered_subject_id,
	a.student_id,
	a.opted_to_challenge,
	b.name as student_name,
	b.usn,
	c.name as department_name,
	d.name as level_name
FROM exam_attendees as a
	join students as b
		on a.student_id = b.student_id
	join departments as c
		on b.department_id = c.department_id
	join levels as d
		on b.level_id = d.level_id;

--details required for downloading form A--
CREATE VIEW form_a_details as
SELECT
a.institute_id,
a.student_id,
a.offered_subject_id,
a.usn,
a.has_attended_exam
FROM subject_register_details as a
WHERE a.is_eligible_for_exam = true;

--view to get details of the current evaluator who has the packet--
CREATE VIEW current_evaluator_details as
SELECT
a.institute_id,
a.subject_name,
a.subject_code,
a.packet_code,
a.valuation_round,
b.name as evaluator_name,
b.email as evaluator_email,
b.phone_number as phone_number,
b.evaluator_type,
b.department
FROM packet_details as a
JOIN assignable_evaluators as b
ON a.assigned_to = b.evaluator_id;
-- getting current season

-- Marks of student in subjects
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

-- Student Final Results 
CREATE OR REPLACE VIEW student_subject_results AS SELECT a.institute_id,
    a.season_id,
    a.student_id,
    a.department AS department_name,
    a.usn,
    a.name,
    c.subject_id,
    c.code AS subject_code,
    CASE
      WHEN c.alternate_required THEN d.alternate_name
      ELSE c.name
    END AS subject_name,
    a.has_withdrawn,
    a.cie_marks,
    d.exam_marks,
    a.effective_marks::numeric AS total_marks,
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
    i.admission_quota,
    a.has_attended_exam,
    a.subject_register_id,
    b.is_pass_grade,
    h.academic_year,
    j.level_seq,
    j.name AS level_name,
    a.has_opted_for_makeup
   FROM subject_register_details a
     JOIN grades b ON a.grade::text = b.grade::text AND a.academic_regulation_id = b.academic_regulation_id
     JOIN subjects c ON a.subject_id = c.subject_id AND c.parent_id = 0
     JOIN subject_registers d ON a.student_id = d.student_id AND d.subject_id = c.subject_id AND a.season_id = d.season_id
     JOIN subject_sections e ON a.subject_section_id = e.subject_section_id
     JOIN level_sections f ON e.level_section_id = f.level_section_id
     JOIN sections g ON g.section_id = f.section_id
     JOIN seasons h ON h.season_id = a.season_id AND a.institute_id = h.institute_id
     JOIN students i ON i.student_id = a.student_id
     JOIN levels j ON j.level_id = f.level_id;
     
CREATE VIEW grade_card_student_details AS  SELECT a.institute_id,
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
    g.degree_id,
    a.level_section_id,
    e.session_semester,
    e.academic_year,
    a.project_title,
    e.session_name
   FROM student_enrollments a
     JOIN students b ON a.student_id = b.student_id
     JOIN level_sections c ON a.level_section_id = c.level_section_id
     JOIN levels d ON c.level_id = d.level_id
     JOIN seasons e ON a.season_id = e.season_id
     JOIN departments f ON b.department_id = f.department_id
     JOIN programs g ON b.program_id = g.program_id
     ORDER BY b.usn, c.level_id, a.season_id;

-- GPA statistics for dashboard
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

CREATE OR REPLACE VIEW program_section AS  SELECT DISTINCT c.name AS section_name,
    b.level_section_id,
    a.institute_id,
    a.season_id,
    a.program_id,
    b.level_id
   FROM student_enrollments a
     LEFT JOIN level_sections b ON b.level_section_id = a.level_section_id
     LEFT JOIN sections c ON c.section_id = b.section_id;

CREATE VIEW enrolled_student_details AS SELECT 
    se.institute_id,
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
JOIN programs p ON se.program_id = p.program_id and se.institute_id = p.institute_id
JOIN students s ON se.student_id = s.student_id and se.institute_id = s.institute_id
JOIN level_sections ls ON se.level_section_id = ls.level_section_id
JOIN levels l ON ls.level_id = l.level_id 
JOIN sections sec ON ls.section_id = sec.section_id;

-- Alloted Parent Subject for staff. 
-- Used for offered subject id rather that ubject section id
CREATE VIEW staff_parent_subject_list AS SELECT a.offered_subject_id,
    a.staff_id,
    b.name,
    a.season_id
   FROM assigned_staffs a
     JOIN subjects b ON a.subject_id = b.subject_id AND b.parent_id = 0;
     
-- Test statistics of a subject section
-- More fields can be added
CREATE VIEW subject_section_test_statistis AS SELECT institute_id,subject_section_id,name,seq_no,AVG(
	CASE
		WHEN marks='AB' THEN 0
		ELSE marks::decimal
	END
	)::numeric(4,2) as average
FROM student_subject_marks GROUP BY name,subject_section_id,institute_id,seq_no;

-- Parent subject details of all the offered subjects
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

-- A view which contains the average GPA statistics of (season,program,level)  
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
  
-- List of students that can be enrolled to a semester in a given season
-- This will contain only those students who haven't been enrolled in a given season
CREATE VIEW enrollable_students AS SELECT 
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

-- List of levels and sections for a degree in a given season
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

-- Grade Statistics Quota Wise
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

-- GPA statistics for quota
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
			

-- Grade statistics for subject grades
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

CREATE VIEW offered_subject_code_list AS SELECT a.offered_subject_id,
  c.department_id,
  c.institute_id,
  concat(c.name, ' - ', c.code) AS name
  FROM offered_subjects a
    JOIN institute_configurations b ON a.season_id = b.current_season
    JOIN subjects c ON a.subject_id = c.subject_id AND c.parent_id = 0
ORDER BY c.name;

CREATE VIEW taught_subject_code_list AS  SELECT a.offered_subject_id,
  c.department_id,
  c.institute_id,
  concat(c.name, ' - ', c.code) AS name
  FROM offered_subjects a
    JOIN institute_configurations b ON a.season_id = b.current_season
    JOIN subjects c ON a.subject_id = c.subject_id AND c.is_integrated = false
ORDER BY c.name;

CREATE VIEW degree_level_packet_details AS  SELECT a.institute_id,
    a.offered_subject_id,
    a.valuation_round,
    a.paper_code,
    a.packet_code,
    a.marks1,
    a.marks2,
    a.marks3,
    a.requires2,
    a.requires3,
    b.degree_id,
    b.level_id
   FROM coded_papers a
     JOIN offered_subjects b ON a.offered_subject_id = b.offered_subject_id;

CREATE VIEW degree_subject_evaluation_statistics AS  SELECT a.institute_id,
    a.degree_id,
    a.level_id,
    a.valuation_round,
    osd.department_id,
    a.offered_subject_id,
    osd.code,
    osd.name,
    COALESCE(a.total_papers, 0::bigint) AS total_papers,
    COALESCE(b.completed_evaluation, 0::bigint) AS completed_evaluation,
    COALESCE(c.pending_evaluation, 0::bigint) AS pending_evaluation,
    COALESCE(d.moderated, 0::bigint) AS moderated,
    COALESCE(e.ii_evaluated, 0::bigint) AS ii_evaluated
   FROM ( SELECT degree_level_packet_details.institute_id,
            degree_level_packet_details.valuation_round,
            degree_level_packet_details.offered_subject_id,
            degree_level_packet_details.degree_id,
            degree_level_packet_details.level_id,
            count(*) AS total_papers
           FROM degree_level_packet_details
          GROUP BY degree_level_packet_details.institute_id, degree_level_packet_details.offered_subject_id, degree_level_packet_details.degree_id, degree_level_packet_details.level_id, degree_level_packet_details.valuation_round) a
     LEFT JOIN ( SELECT degree_level_packet_details.offered_subject_id,
            count(*) AS completed_evaluation
           FROM degree_level_packet_details
          WHERE degree_level_packet_details.requires2 = false AND degree_level_packet_details.requires3 = false AND degree_level_packet_details.marks1 > 0 OR degree_level_packet_details.requires2 = true AND degree_level_packet_details.requires3 = false AND degree_level_packet_details.marks2 > 0 OR degree_level_packet_details.requires3 = true AND degree_level_packet_details.marks3 > 0
          GROUP BY degree_level_packet_details.offered_subject_id) b ON a.offered_subject_id = b.offered_subject_id
     LEFT JOIN ( SELECT degree_level_packet_details.offered_subject_id,
            count(*) AS pending_evaluation
           FROM degree_level_packet_details
          WHERE degree_level_packet_details.marks1 = 0 OR degree_level_packet_details.requires2 = true AND degree_level_packet_details.marks2 = 0 OR degree_level_packet_details.requires3 = true AND degree_level_packet_details.marks3 = 0
          GROUP BY degree_level_packet_details.offered_subject_id) c ON a.offered_subject_id = c.offered_subject_id
     LEFT JOIN ( SELECT degree_level_packet_details.offered_subject_id,
            count(*) AS moderated
           FROM degree_level_packet_details
          WHERE degree_level_packet_details.requires2 = false AND degree_level_packet_details.marks2 > 0
          GROUP BY degree_level_packet_details.offered_subject_id) d ON a.offered_subject_id = d.offered_subject_id
     LEFT JOIN ( SELECT degree_level_packet_details.offered_subject_id,
            count(*) AS ii_evaluated
           FROM degree_level_packet_details
          WHERE degree_level_packet_details.requires2 = true AND degree_level_packet_details.marks2 = 0
          GROUP BY degree_level_packet_details.offered_subject_id) e ON a.offered_subject_id = e.offered_subject_id
     JOIN offered_subject_details osd ON a.offered_subject_id = osd.offered_subject_id;

CREATE VIEW degree_level_evaluation_statistics AS  SELECT a.institute_id,
    a.degree_id,
    a.level_id,
    l.name,
    a.valuation_round,
    COALESCE(a.total_papers, 0::bigint) AS total_papers,
    COALESCE(b.completed_evaluation, 0::bigint) AS completed_evaluation,
    COALESCE(c.pending_evaluation, 0::bigint) AS pending_evaluation,
    COALESCE(d.moderated, 0::bigint) AS moderated,
    COALESCE(e.ii_evaluated, 0::bigint) AS ii_evaluated
   FROM ( SELECT degree_level_packet_details.institute_id,
            degree_level_packet_details.valuation_round,
            degree_level_packet_details.degree_id,
            degree_level_packet_details.level_id,
            count(*) AS total_papers
           FROM degree_level_packet_details
          GROUP BY degree_level_packet_details.institute_id, degree_level_packet_details.degree_id, degree_level_packet_details.level_id, degree_level_packet_details.valuation_round) a
     LEFT JOIN ( SELECT degree_level_packet_details.degree_id,
            degree_level_packet_details.level_id,
            count(*) AS completed_evaluation
           FROM degree_level_packet_details
          WHERE degree_level_packet_details.requires2 = false AND degree_level_packet_details.requires3 = false AND degree_level_packet_details.marks1 > 0 OR degree_level_packet_details.requires2 = true AND degree_level_packet_details.requires3 = false AND degree_level_packet_details.marks2 > 0 OR degree_level_packet_details.requires3 = true AND degree_level_packet_details.marks3 > 0
          GROUP BY degree_level_packet_details.institute_id, degree_level_packet_details.degree_id, degree_level_packet_details.level_id, degree_level_packet_details.valuation_round) b ON a.degree_id = b.degree_id AND a.level_id = b.level_id
     LEFT JOIN ( SELECT degree_level_packet_details.degree_id,
            degree_level_packet_details.level_id,
            count(*) AS pending_evaluation
           FROM degree_level_packet_details
          WHERE degree_level_packet_details.marks1 = 0 OR degree_level_packet_details.requires2 = true AND degree_level_packet_details.marks2 = 0 OR degree_level_packet_details.requires3 = true AND degree_level_packet_details.marks3 = 0
          GROUP BY degree_level_packet_details.institute_id, degree_level_packet_details.degree_id, degree_level_packet_details.level_id, degree_level_packet_details.valuation_round) c ON a.degree_id = c.degree_id AND a.level_id = c.level_id
     LEFT JOIN ( SELECT degree_level_packet_details.degree_id,
            degree_level_packet_details.level_id,
            count(*) AS moderated
           FROM degree_level_packet_details
          WHERE degree_level_packet_details.requires2 = false AND degree_level_packet_details.marks2 > 0
          GROUP BY degree_level_packet_details.institute_id, degree_level_packet_details.degree_id, degree_level_packet_details.level_id, degree_level_packet_details.valuation_round) d ON a.degree_id = d.degree_id AND a.level_id = d.level_id
     LEFT JOIN ( SELECT degree_level_packet_details.degree_id,
            degree_level_packet_details.level_id,
            count(*) AS ii_evaluated
           FROM degree_level_packet_details
          WHERE degree_level_packet_details.requires2 = true AND degree_level_packet_details.marks2 = 0
          GROUP BY degree_level_packet_details.institute_id, degree_level_packet_details.degree_id, degree_level_packet_details.level_id, degree_level_packet_details.valuation_round) e ON a.degree_id = e.degree_id AND a.level_id = e.level_id
     JOIN levels l ON a.level_id = l.level_id AND a.degree_id = l.degree_id AND a.institute_id = l.institute_id;

CREATE VIEW paper_history AS  SELECT a.institute_id,
    a.is_makeup,
    a.subject_register_id,
    a.name,
    a.usn,
    a.offered_subject_id,
    a.paper_code,
    a.packet_code,
    COALESCE(b.paper_code, '-'::character varying) AS reval_paper_code,
    COALESCE(b.packet_code, '-'::character varying) AS reval_packet_code,
    COALESCE(c.paper_code, '-'::character varying) AS ch_paper_code,
    COALESCE(c.packet_code, '-'::character varying) AS ch_packet_code
   FROM coded_paper_names a
     LEFT JOIN ( SELECT coded_paper_names.institute_id,
            coded_paper_names.is_makeup,
            coded_paper_names.subject_register_id,
            coded_paper_names.offered_subject_id,
            coded_paper_names.paper_code,
            coded_paper_names.packet_code
           FROM coded_paper_names
          WHERE coded_paper_names.valuation_round = 2) b ON a.subject_register_id = b.subject_register_id AND a.valuation_round = 1 AND a.offered_subject_id = b.offered_subject_id AND a.is_makeup = b.is_makeup
     LEFT JOIN ( SELECT w.institute_id,
            w.is_makeup,
            w.subject_register_id,
            w.offered_subject_id,
            w.paper_code,
            w.packet_code
           FROM coded_paper_names w
          WHERE w.valuation_round = 3) c ON a.subject_register_id = c.subject_register_id AND a.valuation_round = 1 AND a.offered_subject_id = c.offered_subject_id AND a.is_makeup = c.is_makeup;

CREATE VIEW backlog_subject_details AS  SELECT a.institute_id,
    a.student_id,
    c.usn,
    c.name,
    a.subject_id,
    d.code AS subject_code,
    d.name AS subject_name,
    d.total_credits AS pending_credits,
    a.number_of_attempts,
    COALESCE(b.number_of_failed_attempts, 0::bigint) AS number_of_failed_attempts
   FROM ( SELECT student_subject_results.institute_id,
            student_subject_results.student_id,
            student_subject_results.subject_id,
            count(*) AS number_of_attempts
           FROM student_subject_results
          GROUP BY student_subject_results.institute_id, student_subject_results.student_id, student_subject_results.subject_id) a
     LEFT JOIN ( SELECT student_subject_results.institute_id,
            student_subject_results.student_id,
            student_subject_results.subject_id,
            count(*) AS number_of_failed_attempts
           FROM student_subject_results
          WHERE student_subject_results.is_pass_grade = false
          GROUP BY student_subject_results.institute_id, student_subject_results.student_id, student_subject_results.subject_id) b ON a.student_id = b.student_id AND a.subject_id = b.subject_id AND a.institute_id = b.institute_id
     JOIN students c ON a.student_id = c.student_id AND a.institute_id = c.institute_id
     JOIN subjects d ON a.subject_id = d.subject_id
  WHERE b.number_of_failed_attempts <> 0;
  
  
CREATE VIEW current_backlog_subject_details AS  SELECT backlog_subject_details.institute_id,
    backlog_subject_details.student_id,
    backlog_subject_details.usn,
    backlog_subject_details.name,
    backlog_subject_details.subject_id,
    backlog_subject_details.subject_code,
    backlog_subject_details.subject_name,
    backlog_subject_details.pending_credits,
    backlog_subject_details.number_of_attempts,
    backlog_subject_details.number_of_failed_attempts
   FROM backlog_subject_details
  WHERE backlog_subject_details.number_of_attempts = backlog_subject_details.number_of_failed_attempts;
  
CREATE VIEW current_backlog_details AS  SELECT a.institute_id,
    a.student_id,
    b.name,
    b.usn,
    b.program_id,
    b.level_id,
    b.level_section_id,
    a.total_pending_credits,
    a.number_of_subjects
   FROM ( SELECT current_backlog_subject_details.institute_id,
            current_backlog_subject_details.student_id,
            sum(current_backlog_subject_details.pending_credits) AS total_pending_credits,
            count(*) AS number_of_subjects
           FROM current_backlog_subject_details
          GROUP BY current_backlog_subject_details.institute_id, current_backlog_subject_details.student_id) a
     JOIN students b ON a.student_id = b.student_id AND a.institute_id = b.institute_id;

--For terminal marks entry flow
create view terminal_assessment_schemes as select a.*
from assessment_schemes as a
where is_terminal = 'true';

--For session marks entry flow
create view sessional_assessment_schemes as select a.*
from assessment_schemes as a
where is_terminal = 'false';

CREATE VIEW student_assessment_scheme_details AS  SELECT a.student_assessment_id,
    a.institute_id,
    a.season_id,
    a.offered_subject_id,
    a.subject_register_id,
    a.subject_section_id,
    a.assessment_scheme_id,
    a.assessment_seq_no,
    a.student_id,
    a.section_id,
    a.has_attended,
    a.marks_scored,
    a.entered_by_user_id,
    b.is_terminal
   FROM student_assessments a
 JOIN assessment_schemes b ON b.assessment_scheme_id = a.assessment_scheme_id;
CREATE VIEW transcripts AS  SELECT student_subject_results.student_id,
  student_subject_results.subject_id,
  max(student_subject_results.grade_points) AS max_grade_points,
  bool_or(student_subject_results.is_pass_grade) AS has_passed,
  min(student_subject_results.level_id) AS level_id,
  min(student_subject_results.level_name::text) AS level_name,
  min(student_subject_results.level_seq) AS level_seq,
  count(*) AS attempts,
  min(student_subject_results.credits) AS subject_credits
  FROM student_subject_results
GROUP BY student_subject_results.student_id, student_subject_results.subject_id;

CREATE VIEW student_transcripts AS  SELECT transcripts.student_id,
  min(transcripts.level_id) AS level_id,
  min(transcripts.level_name) AS level_name,
  transcripts.level_seq,
  sum(transcripts.max_grade_points) AS total_max_grade_points,
  sum(transcripts.subject_credits) AS total_subject_credits,
  sum(transcripts.max_grade_points * transcripts.subject_credits::numeric) AS credit_points
  FROM transcripts
GROUP BY transcripts.student_id, transcripts.level_seq
ORDER BY transcripts.level_seq;

CREATE VIEW makeup_packet_list AS  SELECT pp.packet_code,
  pp.institute_id,
  pp.offered_subject_id,
  pp.valuation_round,
  pp.assigned_to,
  COALESCE(ev.name, ''::character varying) AS name,
  COALESCE(ev.phone_number, ''::character varying) AS phone_number,
      CASE
          WHEN pp.valuation_round = 1 THEN
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
          END
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
WHERE pp.is_makeup = true;


CREATE VIEW student_enrollment_details AS  SELECT a.student_id,
  a.institute_id,
  a.season_id,
  a.program_id,
  a.level_section_id,
  a.sgpa,
  a.cgpa,
  a.registered_credits,
  a.obtained_credits,
  a.total_credits,
  s.session_name,
  s.season_start_date,
  s.season_end_date,
  p.name AS program_name,
  l.name AS level_name,
  se.name AS section_name,
  s.is_supplementary,
  l.level_seq,
  s.academic_year,
  s.session_semester
FROM student_enrollments a
JOIN seasons s ON a.season_id = s.season_id
JOIN programs p ON a.program_id = p.program_id
JOIN level_sections ls ON a.level_section_id = ls.level_section_id
JOIN levels l ON l.level_id = ls.level_id
JOIN sections se ON ls.section_id = se.section_id;

-- DDL generated by Postico 1.5.10
-- Not all database features are supported. Do not use for backup.

-- Table Definition ----------------------------------------------

CREATE VIEW transcript_semester_details AS  SELECT student_enrollment_details.student_id,
  student_enrollment_details.institute_id,
  student_enrollment_details.season_id,
  student_enrollment_details.program_id,
  student_enrollment_details.level_section_id,
  student_enrollment_details.sgpa,
  student_enrollment_details.cgpa,
  student_enrollment_details.registered_credits,
  student_enrollment_details.obtained_credits,
  student_enrollment_details.total_credits,
  student_enrollment_details.session_name,
  student_enrollment_details.season_start_date,
  student_enrollment_details.season_end_date,
  student_enrollment_details.program_name,
  student_enrollment_details.level_name,
  student_enrollment_details.section_name,
  student_enrollment_details.is_supplementary,
  student_enrollment_details.level_seq,
  student_enrollment_details.academic_year,
  student_enrollment_details.session_semester
FROM student_enrollment_details
WHERE student_enrollment_details.is_supplementary = false
ORDER BY student_enrollment_details.level_seq;


CREATE VIEW transcript_subject_details AS  SELECT a.institute_id,
  a.subject_register_id,
  a.student_id,
  a.subject_id,
  c.subject_season_id,
  a.season_id,
  a.subject_name,
  a.grade,
  d.grade_points::numeric(5,2) AS grade_points,
  COALESCE(b.number_of_attempts, 1::bigint) AS attempts,
  e.slno,
  d.is_pass_grade,
  e.total_credits
FROM subject_register_details a
  JOIN ( SELECT subject_registers.student_id,
        subject_registers.subject_id,
        min(subject_registers.season_id) AS subject_season_id
        FROM subject_registers
      GROUP BY subject_registers.student_id, subject_registers.subject_id) c ON a.student_id = c.student_id AND a.subject_id = c.subject_id
  LEFT JOIN backlog_subject_details b ON a.student_id = b.student_id AND a.subject_id = b.subject_id
  JOIN grades d ON a.academic_regulation_id = d.academic_regulation_id AND a.grade::text = d.grade::text
  JOIN subjects e ON a.subject_id = e.subject_id
WHERE a.parent_id = 0 AND a.is_final_grade = true
ORDER BY e.slno;

--  populate data --------
-- masters
INSERT INTO "public"."trusts"("trust_id","name","email","address_line1","address_line2","city","state","pincode","country","govt_code","phone_number","account_status","is_active","created_at","updated_at")
VALUES
(1,E'BMS',E'',E'',E'',E'',E'',E'',130,E'',E'',E'NA',TRUE,NULL,NULL);
SELECT setval('trusts_trust_id_seq', 1, true);

INSERT INTO "public"."institutes"("institute_id","trust_id","name","institute_type","address_line1","address_line2","city","state","pincode","country","govt_code","phone_number","email","is_active","created_at","updated_at")
VALUES
(1,1,E'BMSCE',E'VTU(A)',E'',E'',E'',E'',E'',130,E'',E'',E'',TRUE,NULL,NULL);
SELECT setval('institutes_institute_id_seq', 1, true);

INSERT INTO "public"."institute_configurations"("institute_id","current_season","institute_type_id","auto_subject_registration","auto_roll_over_subjects","auto_roll_over_enrollment", "min_attendance_for_eligibility", "min_attendance_for_exemption", "answer_packet_seq_width", "nbr_papers_per_packet")
VALUES
(1,2,1,TRUE,TRUE,TRUE, 75, 60, 4,10);


INSERT INTO "public"."trustees"("trustee_id","trust_id","name","email","phone_number","designation","created_at","updated_at")
VALUES
(100000,1,E'Suresh',E'test@test.com',E'',E'Hon. Secretary',NULL,NULL);


INSERT INTO "public"."assessment_schemes"("assessment_scheme_id","institute_id","name","code","cie_calculation", "min_cie_marks","is_active")
VALUES
(1,1,'2-of-3 test-20  and 2 AAT-5', 'SCHEME-1', 'sumOfTopN(2, m1, m2, m3) + m4 + m5', 20, TRUE),
(2,1,'2-of-3 test-15 and 1 AAT-20', 'SCHEME-2', 'sumOfTopN(2, m1, m2, m3) + m4',20, TRUE),
(3,1,'2-of-3 test-10 and 1 AAT-5', 'LECTURE-1', 'sumOfTopN(2, m1, m2, m3) + m4',10, TRUE),
(4,1,'Lab-25', 'LAB-1', 'm1',10, TRUE),
(5,1,'2-of-3 test-25 ', 'SCHEME-3', 'sumOfTopN(2, m1, m2, m3)', 20, TRUE);
SELECT setval('assessment_schemes_assessment_scheme_id_seq', 100, true);

INSERT INTO "public"."assessment_items"("assessment_scheme_id","seq_no","institute_id","name","max_marks")
VALUES
(1,1,1,'Test 1', 20),
(1,2,1,'Test 2', 20),
(1,3,1,'Test 3', 20),
(1,4,1,'AAT 1', 5),
(1,5,1,'AAT 2', 5),
(2,1,1,'Test 1', 15),
(2,2,1,'Test 2', 15),
(2,3,1,'Test 3', 15),
(2,4,1,'AAT 1', 20),
(3,1,1,'Test 1', 10),
(3,2,1,'Test 2', 10),
(3,3,1,'Test 3', 10),
(3,4,1,'AAT 1', 5),
(4,1,1,'Lab', 25),
(5,1,1,'Test 1', 25),
(5,2,1,'Test 2', 25),
(5,3,1,'Test 3', 25);
-- this table has no generated key..

INSERT INTO "public"."subject_types"("subject_type_id","institute_id","name","created_at","updated_at","is_integrated")
VALUES
(1,1,E'Theory',NULL,NULL,FALSE),
(2,1,E'Lab',NULL,NULL,FALSE),
(3,1,E'Tutorial',NULL,NULL,FALSE),
(4,1,E'Integrated',NULL,NULL,TRUE);
SELECT setval('subject_types_subject_type_id_seq', 3, true);

INSERT INTO "public"."seasons"("season_id","institute_id","name","code","course_reg_start_date","course_reg_end_date","season_start_date","season_end_date","is_active")
VALUES
(1,1,E'ODD 2019-2020',E'AY20-1 SEM',NULL,NULL,NULL,NULL,TRUE),
(2,1,E'EVEN 2019-2020',E'AY20-2',NULL,NULL,NULL,NULL,TRUE);

SELECT setval('seasons_season_id_seq', 2, true);

-- one row per institute. default values are good enough, and hence we insert with just teh primary key
INSERT INTO "public"."cie_activities"("institute_id")
VALUES
(1);

-- one row per institute. default values are good enough, and hence we insert with just teh primary key
INSERT INTO "public"."valuation_activities"("institute_id")
VALUES
(1);

INSERT INTO "public"."degrees"("degree_id","institute_id","name","code","is_active","created_at","updated_at")
VALUES
(1,1,E'Bachelor\'s Of Engineering',E'B.E',TRUE,NULL,NULL),
(2,1,E'Master\'s Of Buissness Administartion',E'MBA',TRUE,NULL,NULL),
(3,1,E'Master\'s Of Technology',E'M.Tech',TRUE,NULL,NULL),
(4,1,E'Master\'s Of Computer Application',E'MCA',TRUE,NULL,NULL);

SELECT setval('degrees_degree_id_seq', 100, true);

INSERT INTO "public"."departments"("department_id","institute_id","name","code","phone_number","email","address_line1","address_line2","city","state","pincode","country","is_active","created_at","updated_at")
VALUES

(1,1,'Civil Engineering','CV','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(2,1,'Mechanical Engineering','ME','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(3,1,'Electrical and Electronics Engineering','EEE','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(4,1,'Electronics and Communication Engineering','ECE','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(5,1,'Industrial Engineering Management','IEM','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(6,1,'Computer Science and Engineering','CSE','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(7,1,'Electronics and Telecommunication Engineering','ET','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(8,1,'Information Science and Engineering','ISE','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(9,1,'Electronics and Instrumentation Engineering','EIE','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(10,1,'Medical Electronics','ML','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(11,1,'Bio Technology','BT','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(12,1,'Chemical Engineering','CH','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(13,1,'Aero Space Engineering','AS','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(14,1,'Mathematics','MA','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(15,1,'Physics','PY','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(16,1,'Chemistry','CY','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(17,1,'Human Science','HS','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(18,1,'Examination Section','COE','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(19,1,'Masters of Computer Application','MCA','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL),
(20,1,'Masters of Business Adminstration','MBA','' ,'' ,'' ,'' ,'' ,'' ,'' ,130,TRUE,NULL,NULL);

SELECT setval('departments_department_id_seq', 100, true);

INSERT INTO "public"."programs"("program_id","degree_id","department_id","institute_id","name","code","sections_required","is_active")
VALUES
(1,1,1,1,'BE In Civil Engineering','',TRUE,TRUE),
(2,1,2,1,'BE In Mechanical Engineering','',TRUE,TRUE),
(3,1,3,1,'BE In Electrical and Electronics Engineering','',TRUE,TRUE),
(4,1,4,1,'BE In Electronics and Communication Engineering','',TRUE,TRUE),
(5,1,5,1,'BE In Industrial Engineering Management','',TRUE,TRUE),
(6,1,6,1,'BE In Computer Science and Engineering','',TRUE,TRUE),
(7,1,7,1,'BE In Telecommunication Engineering','',TRUE,TRUE),
(8,1,8,1,'BE In Information Science and Engineering','',TRUE,TRUE),
(9,1,9,1,'BE In Electronics and Instrumentation Engineering','',TRUE,TRUE),
(10,1,10,1,'BE In Medical Electronics','',TRUE,TRUE),
(11,1,11,1,'BE In Bio Technology','',TRUE,TRUE),
(12,1,12,1,'BE in Chemical Engineering','',TRUE,TRUE),
(13,1,13,1,'BE in Aero Space Engineering','',TRUE,TRUE),
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

SELECT setval('programs_program_id_seq', 100, true);

INSERT INTO "public"."levels"("level_id","institute_id","degree_id","level_seq","name","code","is_active")
VALUES
(1,1,1,0,'I SEM','',TRUE),
(2,1,1,1,'II SEM','',TRUE),
(3,1,1,2,'III SEM','',TRUE),
(4,1,1,3,'IV SEM','',TRUE),
(5,1,1,4,'V SEM','',TRUE),
(6,1,1,5,'VI SEM','',TRUE),
(7,1,1,6,'VII SEM','',TRUE),
(8,1,1,7,'VIII SEM','',TRUE),
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

SELECT setval('levels_level_id_seq', 100, true);


INSERT INTO "public"."sections"("section_id","institute_id","name","description","is_active")
VALUES
(1,1,'PA','',TRUE),
(2,1,'PB','',TRUE),
(3,1,'PC','',TRUE),
(4,1,'PD','',TRUE),
(5,1,'PE','',TRUE),
(6,1,'PF','',TRUE),
(7,1,'PG','',TRUE),
(8,1,'PH','',TRUE),
(10,1,'PJ','',TRUE),
(11,1,'PK','',TRUE),
(12,1,'PL','',TRUE),
(13,1,'PM','',TRUE),
(14,1,'PN','',TRUE),
(15,1,'CA','',TRUE),
(16,1,'CB','',TRUE),
(17,1,'CC','',TRUE),
(18,1,'CD','',TRUE),
(19,1,'CE','',TRUE),
(20,1,'CF','',TRUE),
(21,1,'CG','',TRUE),
(22,1,'CH','',TRUE),
(23,1,'CI','',TRUE),
(24,1,'CJ','',TRUE),
(25,1,'CK','',TRUE),
(26,1,'CL','',TRUE),
(27,1,'CM','',TRUE),
(28,1,'CN','',TRUE),
(29,1,'A','',TRUE),
(30,1,'B','',TRUE);
SELECT setval('sections_section_id_seq', 100, true);


INSERT INTO "public"."level_sections"("level_section_id","level_id","section_id","program_id","is_active")
VALUES
(1,1,1,0,TRUE),
(2,1,2,0,TRUE),
(3,1,3,0,TRUE),
(4,1,4,0,TRUE),
(5,1,5,0,TRUE),
(6,1,6,0,TRUE),
(7,1,7,0,TRUE),
(8,1,8,0,TRUE),
(10,1,10,0,TRUE),
(11,1,11,0,TRUE),
(12,1,12,0,TRUE),
(13,1,13,0,TRUE),
(14,1,14,0,TRUE),
(15,1,15,0,TRUE),
(16,1,16,0,TRUE),
(17,1,17,0,TRUE),
(18,1,18,0,TRUE),
(19,1,19,0,TRUE),
(20,1,20,0,TRUE),
(21,1,21,0,TRUE),
(22,1,22,0,TRUE),
(23,1,23,0,TRUE),
(24,1,24,0,TRUE),
(25,1,25,0,TRUE),
(26,1,26,0,TRUE),
(27,1,27,0,TRUE),
(28,1,28,0,TRUE),
(29,2,1,0,TRUE),
(30,2,2,0,TRUE),
(31,2,3,0,TRUE),
(32,2,4,0,TRUE),
(33,2,5,0,TRUE),
(34,2,6,0,TRUE),
(35,2,7,0,TRUE),
(36,2,8,0,TRUE),
(37,2,9,0,TRUE),
(38,2,10,0,TRUE),
(39,2,11,0,TRUE),
(40,2,12,0,TRUE),
(41,2,13,0,TRUE),
(42,2,14,0,TRUE),
(43,2,15,0,TRUE),
(44,2,16,0,TRUE),
(45,2,17,0,TRUE),
(46,2,18,0,TRUE),
(47,2,19,0,TRUE),
(48,2,20,0,TRUE),
(49,2,21,0,TRUE),
(50,2,22,0,TRUE),
(51,2,23,0,TRUE),
(52,2,24,0,TRUE),
(53,2,25,0,TRUE),
(54,2,26,0,TRUE),
(55,2,27,0,TRUE),
(56,2,28,0,TRUE),
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
SELECT setval('level_sections_level_section_id_seq', 100, true);

INSERT INTO "public"."subjects"("subject_id","institute_id","department_id","subject_type_id","name","code","lecture_credits","practical_credits","tutorial_credits","total_credits","parent_id","is_elective","is_integrated","packet_prefix","is_active")
VALUES
(1,1,14,1,'Engineering Mathematics 1','18MA1BSEM1',3,0,1,4,0,false,false,'EM1-',true),
(2,1,14,1,'Engineering Mathematics 2','18MA2BSEM2',3,0,1,4,0,false,false,'EM2-',true),
(3,1,15,4,'Applied Physics','18PY1BSPHY',4,1,0,5,0,false,true,'PHY-',true),
(4,1,15,1,'Applied Physics - Lecture','18PY1BSPHY',4,0,0,4,3,false,false,'',true),
(5,1,15,2,'Applied Physics - Practical','18PY1BSPHY',0,1,0,1,3,false,false,'',true),
(6,1,4,1,'Elements of Electronics and Engineering','18EC1ESECE',3,0,0,3,0,false,false,'ECE-',true),
(7,1,2,4,'Elements of Mechanical Engineering','18ME1ESEME',3,1,0,4,0,false,false,'EME-',true),
(8,1,2,1,'Elements of Mechanical Engineering - Lecture','18ME1ESEME',3,0,0,3,7,false,true,'',true),
(9,1,2,3,'Elements of Mechanical Engineering - Practical','18ME1ESEME',0,1,0,1,7,false,false,'',true),
(10,1,6,4,'C Programming','18CS1ESCCP',3,1,0,4,0,false,true,'CCP-',true),
(11,1,6,1,'C Programming - Lecture','18CS1ESCCP',3,0,0,3,10,false,false,'',true),
(12,1,6,2,'C Programming - Practical','18CS1ESCCP',0,1,0,1,10,false,false,'',true),
(13,1,17,1,'Kannada Language','18HS1NCKAN',0,0,0,0,0,false,false,'KAN-',true),
(14,1,16,4,'Engineering Chemistry','18CY1BSCHY',4,1,0,5,0,false,true,'CHY-',true),
(15,1,16,1,'Engineering Chemistry - Lecture','18CY1BSCHY',4,0,0,4,14,false,false,'',true),
(16,1,16,2,'Engineering Chemistry - Practical','18CY1BSCHY',0,1,0,1,14,false,false,'',true),
(17,1,3,4,'Elements of Electrical Engineering','18EE1ESELE',3,0,1,4,0,false,false,'ELE-',true),
(18,1,3,1,'Elements of Electrical Engineering - Lecture','18EE1ESELE',3,0,0,3,17,false,false,'',true),
(19,1,3,2,'Elements of Electrical Engineering - Practical','18EE1ESELE',3,0,1,4,17,false,false,'',true),
(20,1,1,1,'Engineering Mechanics','18CV1ESENM',3,0,1,4,0,false,false,'ENM-',true),
(22,1,2,1,'Elements of Engineering Drawing - Lecture','18ME1ESEED',1,0,0,1,21,false,false,'',true),
(23,1,2,2,'Elements of Engineering Drawing - Practical','18ME1ESEED',0,2,0,2,21,false,false,'',true),
(24,1,17,1,'Functional English','18HS1NCENG',0,0,0,0,0,false,false,'ENG-',true);
SELECT setval('subjects_subject_id_seq', 100, true);

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
('W', 1, 10, -1, 0.0),
('PP', 1, 11, -1, 0.0),
('NP', 1, 12, -1, 0.0);

insert into "public"."admins" ("admin_id", "institute_id", "name", "email", "phone_number")
VALUES 
(1,1,'admin','admin@admin.in', '1234567890');

-- also set seq for users  
SELECT setval('users_user_id_seq', 10000, true);

SELECT setval('designations_designation_id_seq',1,true);

-- --------  special tables used internally by the app configurations  ------------
CREATE TABLE st_overrides (
  id character varying primary key,
  -- comma serated list of records/forms that are overridden
  records character varying not null default '',
  forms character varying not null default ''
);

CREATE TABLE st_rec_overrides (
  id character varying not null,
  name character varying not null,
  json character varying not null,
  PRIMARY KEY(id, name)
);

---------- added by bhandi --------------------
-- view for rendering the list of main-subjects with department name
CREATE VIEW main_subject_list AS
SELECT
	a.institute_id,
	a.subject_id,
	a.name as subject_name,
	b.name as department_name,
	a.practical_credits,
	a.tutorial_credits,
	a.lecture_credits,
	a.parent_id,
	a.code,
	a.total_credits,
	a.is_active
FROM subjects a
    join departments b 
      on a.parent_id = 0 and a.department_id = b.department_id;