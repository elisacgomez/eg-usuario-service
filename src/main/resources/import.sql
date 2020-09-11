INSERT INTO usuarios (username, password, nombre, apellido, enabled, email) VALUES('ecgv', '12345678', 'Elisa', 'Gomez', 1, 'elisa.y3@gmail.com');
INSERT INTO usuarios (username, password, nombre, apellido, enabled, email) VALUES('elisa', '12345679', 'Carolina', 'Vivas', 1, 'elisa.c.gomezv@gmail.com');

INSERT INTO roles (nombre) VALUES('ROLE_USER');
INSERT INTO roles (nombre) VALUES('ROLE_ADMIN');

INSERT INTO usuario_to_roles (usuario_id, role_id) VALUES(1,1);
INSERT INTO usuario_to_roles (usuario_id, role_id) VALUES(2,2);
INSERT INTO usuario_to_roles (usuario_id, role_id) VALUES(2,1);