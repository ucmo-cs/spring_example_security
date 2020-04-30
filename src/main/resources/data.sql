INSERT INTO car (make, model, year) VALUES ('Ford', 'Mustang', 1998);
INSERT INTO car (make, model, year) VALUES ('Acura', 'ILX', 2015);
INSERT INTO car (make, model, year) VALUES ('Honda', 'CRV', 2018);

INSERT INTO roles VALUES (1,'USER');
INSERT INTO roles VALUES (2,'ADMIN');

INSERT INTO users (user_id, user_name, email, password, first_name, last_name, active)
VALUES (1, 'user', 'user@acme.com',
        '$2y$10$A50PPo/tm3skv9iguM4UpOJg3ZUulV0XMB3iuGpx7po4k9OcFrREO',
        'Program', 'User', TRUE);
INSERT INTO users (user_id, user_name, email, password, first_name, last_name, active)
VALUES (2, 'admin', 'admin@acme.com',
        '$2y$10$A50PPo/tm3skv9iguM4UpOJg3ZUulV0XMB3iuGpx7po4k9OcFrREO',
        'Program', 'Admin', TRUE);

INSERT INTO user_role (user_id, role_id) VALUES (1,1);
INSERT INTO user_role (user_id, role_id) VALUES (2,2);
