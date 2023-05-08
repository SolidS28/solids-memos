CREATE SEQUENCE taskmanager.hibernate_sequence
	INCREMENT BY 1
	MINVALUE 1
	MAXVALUE 9223372036854775807
	START 1
	CACHE 1
	NO CYCLE;

CREATE TABLE taskmanager.task (
	id int8 NOT NULL,
	message varchar(255) NULL,
	url varchar(255) NULL,
	CONSTRAINT memo_pkey PRIMARY KEY (id)
);
