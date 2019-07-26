-- REVATURE TITANIUM --

/*
        =====    USER ROLES TABLE    =====
*/

DROP TABLE users_roles CASCADE CONSTRAINTS;
CREATE TABLE users_roles (
    users_role_id NUMBER(6),
    users_role VARCHAR2(50),
    CONSTRAINT users_roles_pk PRIMARY KEY(users_role_id)
);
/

/*
        =====    USER ROLE DATA    =====
*/
INSERT INTO users_roles VALUES (1, 'admin');
INSERT INTO users_roles VALUES (2, 'user');
/

/*
        =====    USERS DATA TABLE    =====
*/
DROP TABLE users_data CASCADE CONSTRAINTS;
CREATE TABLE users_data (
    user_id NUMBER(6),
    username VARCHAR2(100) UNIQUE NOT NULL,
    user_password VARCHAR2(100) NOT NULL,
    first_name VARCHAR2(100),
    last_name VARCHAR2(100),
    user_email VARCHAR2(100) UNIQUE NOT NULL,
    user_role_id NUMBER(6),
    CONSTRAINT users_data_pk PRIMARY KEY (user_id),
    
    CONSTRAINT users_roles_fk FOREIGN KEY (user_role_id) 
    REFERENCES users_roles (users_role_id)
);
/

/*
        =====    USER DATA :: SEQUENCE & TRIGGER    =====
*/
DROP SEQUENCE users_id_seq;
CREATE SEQUENCE users_id_seq
    START WITH 100
    INCREMENT BY 1;
/

CREATE OR REPLACE TRIGGER users_id_seq_trigger
BEFORE INSERT ON users_data
FOR EACH ROW 
BEGIN
    IF :NEW.user_id IS NULL THEN
    SELECT users_id_seq.NEXTVAL INTO :NEW.user_id FROM dual;
    END IF;
END;
/

/*
        =====    SUBJECT TYPES TABLE    =====
*/

DROP TABLE subject_types CASCADE CONSTRAINTS;
CREATE TABLE subject_types (
    subject_type_id NUMBER(6),
    subject_type VARCHAR2(50),
    CONSTRAINT subject_type_pk PRIMARY KEY (subject_type_id)
);
/

/*
        =====    SUBJECT TYPES DATA    =====
*/
INSERT INTO subject_types VALUES (1, 'Java');
INSERT INTO subject_types VALUES (2, 'SQL');
INSERT INTO subject_types VALUES (3, 'HTML');
INSERT INTO subject_types VALUES (4, 'CSS');
INSERT INTO subject_types VALUES (5, 'JavaScript');
INSERT INTO subject_types VALUES (6, 'Bootstrap');
INSERT INTO subject_types VALUES (7, 'Angular');
INSERT INTO subject_types VALUES (8, 'Testing');
INSERT INTO subject_types VALUES (9, 'DevOps');
/

/*
        =====    USER METRICS TABLE    =====
*/

DROP TABLE users_metrics CASCADE CONSTRAINTS;
CREATE TABLE users_metrics (
    metrics_id NUMBER(6),
    users_id NUMBER(6),
    subject_id NUMBER(6),
    user_performance NUMBER(6),
    CONSTRAINT users_metrics_pk PRIMARY KEY(metrics_id),

    CONSTRAINT metrics_users_fk FOREIGN KEY (users_id)
    REFERENCES users_data (user_id),

    CONSTRAINT metrics_subject_fk FOREIGN KEY (subject_id)
    REFERENCES subject_types (subject_type_id)
);
/

/*
        =====    USER METRICS :: SEQUENCE & TRIGGER    =====
*/
DROP SEQUENCE metrics_id_seq;
CREATE SEQUENCE metrics_id_seq
    START WITH 100
    INCREMENT BY 1;
/

CREATE OR REPLACE TRIGGER metrics_id_seq_trigger
BEFORE INSERT ON users_metrics
FOR EACH ROW 
BEGIN
    IF :NEW.metrics_id IS NULL THEN
    SELECT metrics_id_seq.NEXTVAL INTO :NEW.metrics_id FROM dual;
    END IF;
END;
/

/*
        =====    SUBJECT QUESTIONS TABLE    =====
*/

DROP TABLE subjects_questions CASCADE CONSTRAINTS;
CREATE TABLE subjects_questions (
    question_id NUMBER(6),
    subject_id NUMBER(6),
    question VARCHAR2(500),
    answer VARCHAR2(500),
    red_herring_one VARCHAR2(500),
    red_herring_two VARCHAR2(500),
    red_herring_three VARCHAR2(500),
    red_herring_four VARCHAR2(500),
    red_herring_five VARCHAR2(500),
    red_herring_six VARCHAR2(500),
    CONSTRAINT subjects_questions_pk PRIMARY KEY(question_id),

    CONSTRAINT questions_subject_fk FOREIGN KEY (subject_id)
    REFERENCES subject_types (subject_type_id)
);
/

/*
        =====    SUBJECT QUESTIONS :: SEQUENCE & TRIGGER    =====
*/
DROP SEQUENCE questions_id_seq;
CREATE SEQUENCE questions_id_seq
    START WITH 1
    INCREMENT BY 1;
/

CREATE OR REPLACE TRIGGER questions_id_seq_trigger
BEFORE INSERT ON subjects_questions
FOR EACH ROW 
BEGIN
    IF :NEW.question_id IS NULL THEN
    SELECT questions_id_seq.NEXTVAL INTO :NEW.question_id FROM dual;
    END IF;
END;
/
