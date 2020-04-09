REPLACE INTO car  VALUES (1, 'Ford', 'Mustang', 1998);
REPLACE INTO car  VALUES (2, 'Acura', 'ILX', 2015);
REPLACE INTO car  VALUES (3, 'Honda', 'CRV', 2018);

REPLACE INTO roles VALUES (1,'USER');
REPLACE INTO roles VALUES (2,'ADMIN');

REPLACE INTO meetings VALUES (1,'Department');
REPLACE INTO meetings VALUES (2,'Division');

REPLACE INTO users (user_id, user_name, email, password, first_name, last_name, active)
VALUES (1, 'user', 'user@acme.com',
        '$2y$10$A50PPo/tm3skv9iguM4UpOJg3ZUulV0XMB3iuGpx7po4k9OcFrREO',
        'Program', 'User', TRUE);
REPLACE INTO users (user_id, user_name, email, password, first_name, last_name, active)
VALUES (2, 'admin', 'admin@acme.com',
        '$2y$10$A50PPo/tm3skv9iguM4UpOJg3ZUulV0XMB3iuGpx7po4k9OcFrREO',
        'Program', 'Admin', TRUE);

REPLACE INTO user_role (user_id, role_id) VALUES (1,1);
REPLACE INTO user_role (user_id, role_id) VALUES (2,2);
