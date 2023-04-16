drop table notes;
CREATE TABLE IF NOT EXISTS notes (id BIGINT PRIMARY KEY auto_increment , todo VARCHAR(255), fait BOOLEAN, important BOOLEAN, date_creation DATE DEFAULT NOW());

INSERT INTO notes (todo, fait, important) VALUES ('Ceci un test', false, false);
INSERT INTO notes (todo, fait, important) VALUES ('Deuxième test', false, false);
INSERT INTO notes (todo, fait, important) VALUES ('Doit faire les courses', false, true);