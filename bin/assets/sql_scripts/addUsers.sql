insert into users (user_type, login_id, email, encrypted_password, last_login_at, created_at, updated_at) values ('admin', 'admin', 'admin@cognitron.in', '$2a$10$DPauh9YEwWVjmq3Wkcy2..GGYGWLVKC4RAowMJS9f3naH3zhrswjK', '2019-09-11', '2019-09-11', '2019-09-11')
insert into users (user_type, login_id, email, encrypted_password, last_login_at, created_at, updated_at) values ('student', 'student', 'student@cognitron.in', '$2a$10$bHcj7RGCKvBHRhgS.1aFD.DDIADWwkuNbZZdI6.2YS7eCnLJK4n/e', '2019-09-11', '2019-09-11', '2019-09-11')
insert into users (user_type, login_id, email, encrypted_password, last_login_at, created_at, updated_at) values ('guardian', 'guardian', 'guardian@cognitron.in', '$2a$10$hp0AQN0gmzG4Y4ClhPuJq.tCYZYyPgOUie69CyGA9Hq9OJbrYu5IO', '2019-09-11', '2019-09-11', '2019-09-11')
insert into users (user_type, login_id, email, encrypted_password, last_login_at, created_at, updated_at) values ('staff', 'staff', 'staff@cognitron.in', '$2a$10$jpTuiMB4/53tILN4E1E7/uMdudfqyHgvuUr.Su.PDBIQQkfh1n9qi', '2019-09-11', '2019-09-11', '2019-09-11')
insert into users (user_type, login_id, email, encrypted_password, last_login_at, created_at, updated_at) values ('teacher', 'teacher', 'teacher@cognitron.in', '$2a$10$HRqzAuJpuwiuUI1dq0wo3.47FfWxpq6WvDXyPIEFnrJ/HSuQN2W7m', '2019-09-11', '2019-09-11', '2019-09-11')
insert into users (user_type, login_id, email, encrypted_password, last_login_at, created_at, updated_at) values ('trustee', 'trustee', 'trustee@cognitron.in', '$2a$10$xG3knr6fhSXzWLjHHwAjDOs3Yj8tPvwkjoezI137QMVRVxLvL22q2', '2019-09-11', '2019-09-11', '2019-09-11')

-- trust
INSERT INTO trusts(name, address_line1, address_line2, city, state, pincode, country, phone_number, email, govt_code, account_status, created_at, updated_at) 
values ('Test Trust 1', 'LIne 1 of Trust 1', 'line2 of Trust 1', 'Mysore', 'KA', '1234567', 91, '26716539', 'trust1@trust.in', 'govt-trust1-code', 'active', CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP );

-- institutes
INSERT INTO institutes(trust_id, name, address_line1, address_line2, city, state, pincode, country, phone_number, email, created_at, updated_at) 
values (1, 'Inst 2', 'Inst2 address line 1', 'Inst2 address Line 2', 'Int2 City', 'KA', 'Inst2 Pin Code', 91, 'Inst2 Phone', 'inst2@Inst2.in',  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP );

INSERT INTO institutes(trust_id, name, address_line1, address_line2, city, state, pincode, country, phone_number, email, created_at, updated_at) 
values (1, 'Inst 3', 'Inst3 address line 1', 'Inst3 address Line 2', 'Inst3 City', 'KA', 'Inst3 Pin Code', 91, 'Inst3 Phone', 'inst3@Inst3.in',  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP );

INSERT INTO institutes(trust_id, name, address_line1, address_line2, city, state, pincode, country, phone_number, email, created_at, updated_at) 
values (1, 'Inst 4', 'Inst4 address line 1', 'Inst4 address Line 2', 'Inst4 City', 'KA', 'Inst4 Pin Code', 91, 'Inst4 Phone', 'inst4@Inst4.in',  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP );

INSERT INTO institutes(trust_id, name, address_line1, address_line2, city, state, pincode, country, phone_number, email, created_at, updated_at) 
values (1, 'Inst 5', 'Inst5 address line 1', 'Inst5 address Line 2', 'Inst5 City', 'KA', 'Inst5 Pin Code', 91, 'Inst5 Phone', 'inst1@Inst5.in',  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP );

--users
INSERT INTO users(trust_id, institute_id, user_type, login_id, email, encrypted_password, active, login_enabled, last_login_at, created_at, updated_at)
values (1, 0, 'admin', 'admin', 'admin@admin.in', '$2a$10$DPauh9YEwWVjmq3Wkcy2..GGYGWLVKC4RAowMJS9f3naH3zhrswjK', true, true, CURRENT_TIMESTAMP,  CURRENT_TIMESTAMP ,  CURRENT_TIMESTAMP );

