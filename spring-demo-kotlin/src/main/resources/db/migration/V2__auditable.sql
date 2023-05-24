UPDATE taskmanager.hero SET experience = 0 WHERE experience IS NULL;
ALTER TABLE taskmanager.task
    ADD COLUMN created_at timestamp NOT NULL DEFAULT now(),
    ALTER COLUMN created_at SET DEFAULT NULL,
    ADD COLUMN updated_at timestamp NULL;
ALTER TABLE taskmanager.hero
    ADD COLUMN created_at timestamp NOT NULL DEFAULT now(),
    ALTER COLUMN created_at SET DEFAULT NULL,
    ADD COLUMN updated_at timestamp NULL,
    ALTER COLUMN experience SET NOT NULL;