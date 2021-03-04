INSERT INTO car (make, model, year) VALUES ('Ford', 'Mustang', 1998);
INSERT INTO car (make, model, year) VALUES ('Acura', 'ILX', 2015);
INSERT INTO car (make, model, year) VALUES ('Honda', 'CRV', 2018);

REPLACE INTO users (user_id, user_name, email, password, first_name, last_name, admin)
VALUES (1, 'user', 'user@acme.com',
        '$2y$10$A50PPo/tm3skv9iguM4UpOJg3ZUulV0XMB3iuGpx7po4k9OcFrREO',
        'Program', 'User', FALSE);
REPLACE INTO users (user_id, user_name, email, password, first_name, last_name, admin)
VALUES (2, 'admin', 'admin@acme.com',
        '$2y$10$A50PPo/tm3skv9iguM4UpOJg3ZUulV0XMB3iuGpx7po4k9OcFrREO',
        'Program', 'Admin', TRUE);
