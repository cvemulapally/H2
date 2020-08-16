/* naming this file as schema.sql is not inserting data into H2 database*/
DROP TABLE IF EXISTS person;

CREATE TABLE person (
  id VARCHAR(250)  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL
);

INSERT INTO person (id, first_name, last_name) VALUES
  ('1', 'Akhila', 'Vardha'),
  ('2', 'Chaitanya', 'Vemulapally'),
  ('3', 'Rishvik', 'Vemulapally');
