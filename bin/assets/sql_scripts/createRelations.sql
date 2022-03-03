/* PASSWORDS . mapping of password to encrypted passwords
 * admin = "$2a$10$DPauh9YEwWVjmq3Wkcy2..GGYGWLVKC4RAowMJS9f3naH3zhrswjK"
 * trustee = "$2a$10$xG3knr6fhSXzWLjHHwAjDOs3Yj8tPvwkjoezI137QMVRVxLvL22q2"
 * student = "$2a$10$bHcj7RGCKvBHRhgS.1aFD.DDIADWwkuNbZZdI6.2YS7eCnLJK4n/e"
 * staff = "$2a$10$hp0AQN0gmzG4Y4ClhPuJq.tCYZYyPgOUie69CyGA9Hq9OJbrYu5IO"
 * teacher = "$2a$10$jpTuiMB4/53tILN4E1E7/uMdudfqyHgvuUr.Su.PDBIQQkfh1n9qi"
 * guardian = "$2a$10$sZKuOExbc7mJBihDQrvUseHmlmt5SUmZdz8S0B8L72uwI..rN8xKK"
 * 
 */



--  Drop all indexes first ---
DROP INDEX if exists index_departments_on_institute_id ;
DROP INDEX if exists  index_institutes_on_trust_id ;
DROP INDEX if exists  index_programs_on_department_id;
DROP INDEX if exists  index_sections_on_level_id;
DROP INDEX if exists  index_gaurdians_on_student_id;

DROP INDEX if exists index_categories_on_caster_id;

--- and the views -----
drop view if exists class_details;
drop view if exists student_details;

---- though we delete all tables, we would like ti avoid cascade ------------
-------- reference or codes ---------------
drop table if exists categories;
drop table if exists castes;
drop table if exists states;
drop table if exists countries;
drop table if exists relation_types;
drop table if exists domicile_states;
drop table if exists religions;
drop table if exists institute_types;
drop table if exists user_types;

---------------- core tables -------------
drop table if exists class_registers;
drop table if exists sections;
drop table if exists seasons;
drop table if exists guardians;
drop table if exists students;
drop table if exists user_roles;
drop table if exists levels;
drop table if exists programs;
drop table if exists departments;
drop table if exists permissions;
drop table if exists users;
drop table if exists roles;
drop table if exists institutes;
drop table if exists trusts;
drop table if exists trustees;
drop table if exists admission_quotas;

---------- utility tables -------------
drop table if exists documents;
drop table if exists tbas;

----------------- tables -------------------
CREATE TABLE trusts (
    trust_id BIGSERIAL PRIMARY KEY,
    name character varying NOT NULL,
    email character varying NOT NULL,
    address_line1 character varying NOT NULL,
    address_line2 character varying NOT NULL,
    city character varying NOT NULL,
    state character varying NOT NULL,
    pincode character varying NOT NULL,
    country int NOT NULL,
    govt_code character varying DEFAULT '' NOT NULL ,
    phone_number character varying NOT NULL,
    account_status character varying NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);


CREATE TABLE institutes (
    institute_id BIGSERIAL PRIMARY KEY,
    trust_id bigint NOT NULL,
    name character varying NOT NULL,
    institute_type character varying NOT NULL, 
    address_line1 character varying NOT NULL,
    address_line2 character varying NOT NULL,
    city character varying NOT NULL,
    state character varying NOT NULL,
    pincode character varying NOT NULL,
    country int NOT NULL,
    govt_code character varying DEFAULT ' ' NOT NULL, 
    phone_number character varying NOT NULL,
    email character varying NOT NULL,
    is_inactive boolean DEFAULT False NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);


CREATE TABLE departments (
    department_id BIGSERIAL PRIMARY KEY,
    institute_id bigint NOT NULL,
    name character varying NOT NULL,
    code character varying DEFAULT '' NOT NULL ,
    phone_number character varying DEFAULT '' NOT NULL,
    email character varying DEFAULT '' NOT NULL,
    address_line1 character varying DEFAULT '' NOT NULL,
    address_line2 character varying DEFAULT '' NOT NULL,
    city character varying DEFAULT '' NOT NULL,
    state character varying DEFAULT '' NOT NULL,
    pincode character varying DEFAULT '' NOT NULL,
    country int NOT NULL DEFAULT 00 NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE programs (
    program_id BIGSERIAL PRIMARY KEY,
    institute_id bigint NOT NULL,
    department_id bigint NOT NULL,
    name character varying NOT NULL,
    code character varying DEFAULT '' NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE levels (
    level_id BIGSERIAL PRIMARY KEY,
    institute_id bigint NOT NULL,
    program_id bigint NOT NULL,
    name character varying NOT NULL,
    code character varying  DEFAULT '' NOT NULL,
    level_seq integer NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE users(
    user_id BIGSERIAL PRIMARY KEY, -- Internal Key Never Exposed to the user
    institute_id bigint NOT NULL,
    trust_id bigint NOT NULL,
    user_type character varying NOT NULL, -- Trustee(TU), Staff(SU), Student(STU), Gaurdian(GU) --
    login_id character varying UNIQUE NOT NULL, -- User Created Login ID
    password character varying NOT NULL,
    login_enabled boolean DEFAULT False NOT NULL,
    previous_login_at timestamp without time zone,
    current_login_at timestamp without time zone,
    reset_password_count bigint DEFAULT 0 NOT NULL,
    reset_password_sent_at character varying,
    current_login_ip character varying DEFAULT ' ' NOT NULL,
    previous_login_ip character varying DEFAULT ' ' NOT NULL,
    login_count bigint DEFAULT 0 NOT NULL,
    confirmation_token character varying DEFAULT ' ' NOT NULL,
    login_token character varying DEFAULT ' ' NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);


CREATE TABLE roles (
    role_id BIGSERIAL PRIMARY KEY, 
    trust_id bigint  NOT NULL,
    institutes_id bigint  NOT NULL,
    name character varying NOT NULL, 
    code character varying DEFAULT ' ' NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);
-- permissions have been taken out of reltional model, and put into a json
-- CREATE TABLE permissions (
--      institute_id bigint NOT NULL,
--      role_id bigint NOT NULL,
--      institutes_id bigint NOT NULL,
--      department_id bigint NOT NULL, 
--      permitted_screen json[] NOT NULL,
--      created_at timestamp without time zone NOT NULL,
--      updated_at timestamp without time zone NOT NULL
-- );

CREATE TABLE user_roles (
     user_id bigint NOT NULL,
     role_id bigint NOT NULL,
     institute_id bigint NOT NULL
);

CREATE TABLE trustees (
  turstee_id bigint NOT NUll,
  trust_id bigint NOT NUll,
  name character varying NOT NULL,
  email character varying NOT NULL,
  phone_number character varying DEFAULT '' NOT NULL,
  designation character varying DEFAULT '' NOT NULL,
  created_at timestamp without time zone NOT NULL,
  updated_at timestamp without time zone NOT NULL
);

CREATE TABLE students (student_id bigint NOT NUll,
  institute_id bigint NOT NULL,
  department_id bigint NOT NULL,
  program_id bigint NOT NULL,
  level_id bigint DEFAULT 0  NOT NULL,
  section_id bigint DEFAULT 0  NOT NULL,
  temp_usn character varying NOT NULL,
  usn character varying NOT NULL,
  name  character varying NOT NULL,
  present_address_line1  character varying NOT NULL,
  present_address_line2  character varying NOT NULL,
  present_city  character varying NOT NULL,
  present_state  character varying NOT NULL,
  present_pincode  character varying NOT NULL,
  present_country  character varying NOT NULL,
  address_line1  character varying NOT NULL,
  address_line2  character varying NOT NULL,
  city  character varying NOT NULL,
  state  character varying NOT NULL,
  pincode  character varying NOT NULL,
  country  character varying NOT NULL,
  phone_number  character varying  DEFAULT ' ' NOT NULL,
  email  character varying  DEFAULT ' ' NOT NULL,
  gender  character varying NOT NULL,
  admission_quota  character varying DEFAULT ' ' NOT NULL,
  admitted_level character varying NOT NULL,
  admission_date date NOT NULL,
  blood_group character varying NOT NULL,
  religion character varying NOT NULL,
  caste character varying NOT NULL,
  nationality character varying NOT NULL,
  category character varying NOT NULL,
  personal_id character varying NOT NULL,
  date_of_birth date NOT NULL,
  place_of_birth character varying NOT NULL,
  domicile_state character varying  DEFAULT ' ' NOT NULL,
  previous_board character varying  DEFAULT ' ' NOT NULL,
  previous_class character varying DEFAULT ' ' NOT NULL,
  previous_institute character varying DEFAULT ' ' NOT NULL,
  qualifying_exam_rank character varying DEFAULT 0 NOT NULL,
  created_at timestamp without time zone NOT NULL,
  updated_at timestamp without time zone NOT NULL
);

CREATE TABLE guardians (
    guardian_id bigint NOT NULL,
    institute_id bigint NOT NULL,
    student_id bigint NOT NULL,
    relation_type character varying NOT NULL,  -- Father, Mother , Gaurdian etc.
    occupation character varying  DEFAULT ' ' NOT NULL, 
    annual_salary bigint default 0 NOT NULL,
    qualification character varying DEFAULT ' ' NOT NULL,
    name character varying NOT NULL,
    address_line1 character varying NOT NULL,
    address_line2 character varying NOT NULL,
    city character varying NOT NULL,
    state character varying NOT NULL,
    pincode character varying NOT NULL,
    country character varying NOT NULL,
    phone_number character varying NOT NULL,
    email character varying  DEFAULT ' ' NOT NULL,
    gender character varying NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE seasons (
    season_id BIGSERIAL PRIMARY KEY,
    institute_id bigint NOT NULL,
    name character varying NOT NULL,
    code character varying  DEFAULT ' ' NOT NULL,
    course_reg_start_date timestamp without time zone NOT NULL,
    course_reg_end_date timestamp without time zone NOT NULL,
    season_start_date timestamp without time zone NOT NULL,
    season_end_date timestamp without time zone NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);


CREATE TABLE sections (
    section_id BIGSERIAL PRIMARY KEY,
    institute_id bigint NOT NULL,
    level_id bigint NOT NULL,
    season_id bigint NOT NULL,
    name character varying NOT NULL,
    section_desc character varying NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);

CREATE TABLE class_registers (
    institute_id bigint NOT NULL,
    section_id bigint NOT NULL,
    student_id bigint NOT NULL,
    created_at timestamp without time zone NOT NULL,
    updated_at timestamp without time zone NOT NULL
);


-- CREATE TABLE documents (
--     document_id BIGSERIAL PRIMARY KEY,
--     institute_id bigint NOT NULL,
--     user_id bigint not null,
--     document_name character varying  NOT NULL,
--     document_type character varying NOT NULL,
--     document_location character varying NOT NULL,
--     date_submitted  timestamp without time zone NOT NULL,
--     created_at timestamp without time zone NOT NULL,
--     updated_at timestamp without time zone NOT NULL
-- );


-- CREATE TABLE tbas (
--     tba_id SERIAL PRIMARY KEY,
--     institute_id bigint NOT NULL,
--     record_id character varying NOT NULL,
--     record_primary_key character varying NOT NULL,
--     record_type character varying NOT NULL,
--     action character varying NOT NULL,
--     params json NOT NULL,
--     created_at timestamp without time zone NOT NULL,
--     updated_at timestamp without time zone NOT NULL
-- );
-- Master Tables -------------------------------------------------------

CREATE TABLE castes (
    caste_id BIGSERIAL PRIMARY KEY NOT NULL,
    caste_name character varying NOT NULL 
);

CREATE TABLE categories (
    category_id BIGSERIAL PRIMARY KEY NOT NULL,
    category_name character varying NOT NULL,
    category_code character varying NOT NULL,
    caste_id bigint NOT NULL
);

CREATE TABLE states (
    state_id BIGSERIAL PRIMARY KEY NOT NULL,
    code character varying NOT NULL UNIQUE,
    name character varying NOT NULL
);

CREATE TABLE countries (
    country_id BIGSERIAL PRIMARY KEY NOT NULL,
    code character varying NOT NULL UNIQUE,
    name character varying NOT NULL
);

CREATE TABLE relation_types  (
    relation_type_id BIGSERIAL PRIMARY KEY NOT NULL,
    code character varying NOT NULL UNIQUE,
    name character varying NOT NULL
);

CREATE TABLE domicile_states (
    domicile_state_id BIGSERIAL PRIMARY KEY NOT NULL,
    code character varying NOT NULL UNIQUE,
    name character varying NOT NULL
);

CREATE TABLE admission_quotas (
    admission_quota_id BIGSERIAL PRIMARY KEY NOT NULL,
    code character varying NOT NULL UNIQUE,
    name character varying NOT NULL
);

CREATE TABLE religions (
    religion_id BIGSERIAL PRIMARY KEY NOT NULL,
    code character varying NOT NULL UNIQUE,
    name character varying NOT NULL
);

CREATE TABLE institute_types (
    institute_type_id BIGSERIAL PRIMARY KEY NOT NULL,
    code character varying NOT NULL UNIQUE,
    name character varying NOT NULL
);

CREATE TABLE user_types (
    user_type_id BIGSERIAL PRIMARY KEY NOT NULL,
    code character varying NOT NULL UNIQUE,
    name character varying NOT NULL
);



-- Views -------------------------------------------------------

CREATE VIEW class_details AS 
SELECT 
    a.section_id, 
    a.name AS section_name, 
    a.section_desc,
    
    b.name AS level_name, 
    b.level_id, b.level_seq, 
    
    c.name as program_name, 
    c.program_id,
    c.department_id department_id,
    
    d.name AS department_name, 
    e.season_id,
    
    e.name AS season_name

    FROM sections AS a 
    inner join levels as b on b.level_id = a.level_id
    inner join programs as c on c.program_id = b.program_id
    inner join departments as d on d.department_id = c.department_id
    
    inner join seasons as e on e.season_id = a.season_id
;

DROP VIEW if exists student_details;

CREATE VIEW student_details AS
SELECT 
    a.student_id, 
    a.institute_id,
    a.name,
    a.temp_usn,
    a.usn,
    a.present_address_line1,
    a.present_address_line2,
    a.present_city,
    a.present_state,
    a.present_pincode,
    a.present_country, 
    a.address_line1,
    a.address_line2,
    a.city,
    a.state,
    a.pincode,
    a.country,
    a.phone_number,
    a.email,
    a.gender,
    a.admission_quota,
    a.admitted_level,
    a.blood_group,
    a.religion,
    a.caste,
    a.nationality,
    a.category,
    a.personal_id,
    a.date_of_birth,
    a.place_of_birth,
    a.domicile_state,
    a.previous_board, 
    a.previous_class, 
    a.previous_institute, 
    a.qualifying_exam_rank,
    a.admission_date,
    
    b.name as department_name, 
    c.name as program_name, 
 
    -- section may be 0 in which case we may not get a match. avoid nulls --
    COALESCE(d.name, 'NOT APPLICABLE') AS level_name,
    COALESCE(e.name, 'NOT REGISTERED')  as section_name
    
FROM students AS a
    left join departments as b on b.department_id = a.department_id
    left join programs as c on c.program_id = a.program_id
    left join levels as d on d.level_id = a.level_id
   left join sections as e on  e.section_id = a.section_id 
 ;

 


-- Indices -------------------------------------------------------
--CREATE INDEX index_departments_on_institute_id ON departments(institute_id int8_ops);
--CREATE INDEX index_institutes_on_trust_id ON institutes(trust_id int8_ops);
--CREATE INDEX index_programs_on_department_id ON programs(department_id int8_ops);
--CREATE INDEX index_sections_on_level_id ON sections(level_id int8_ops);
--CREATE INDEX index_gaurdians_on_student_id ON guardians(guardian_id int8_ops);
--CREATE INDEX index_document_user_Id ON documents(user_id int8_ops);
--CREATE INDEX index_tbas_on_institute_id ON institutes(institute_id int8_ops);



-- Master Indices -------------------------------------------------------
CREATE INDEX index_categories_on_caster_id ON categories(caste_id int8_ops);

