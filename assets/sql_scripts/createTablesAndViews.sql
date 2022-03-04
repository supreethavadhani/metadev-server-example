CREATE TABLE customers( 
customer_id BIGSERIAL PRIMARY KEY,
  name character varying NOT NULL DEFAULT '',
  email character varying NOT NULL DEFAULT '',
  address_line1 character varying NOT NULL DEFAULT ''
);