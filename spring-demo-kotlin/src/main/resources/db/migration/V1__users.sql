DROP SEQUENCE taskmanager.hibernate_sequence;

ALTER TABLE task DROP CONSTRAINT memo_pkey;

ALTER TABLE task ALTER COLUMN id TYPE uuid USING gen_random_uuid();

ALTER TABLE task ADD CONSTRAINT task_pkey
                     PRIMARY KEY (id);

CREATE TABLE taskmanager.hero (
	id uuid NOT NULL,
	nickname varchar(31) UNIQUE NOT NULL,
	experience int8 NOT NULL,
	CONSTRAINT hero_pkey PRIMARY KEY (id)
);
