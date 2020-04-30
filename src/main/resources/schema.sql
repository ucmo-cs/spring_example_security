DROP TABLE IF EXISTS car;
CREATE TABLE car (
  id     SERIAL PRIMARY KEY,
  make   VARCHAR(50) NOT NULL,
  model  VARCHAR(50) NOT NULL,
  year   INT         NOT NULL
);

DROP TABLE IF EXISTS users cascade;
CREATE TABLE users (
  user_id       SERIAL PRIMARY KEY,
  user_name     VARCHAR(50) NOT NULL,
  email         VARCHAR(50) NOT NULL,
  password      VARCHAR(100) NOT NULL,
  first_name    VARCHAR(50) NOT NULL,
  last_name     VARCHAR(50) NOT NULL,
  active        BOOLEAN NOT NULL
);

DROP TABLE IF EXISTS roles cascade;
CREATE TABLE roles (
  role_id   SERIAL PRIMARY KEY,
  role      VARCHAR(50) NOT NULL
);

DROP TABLE IF EXISTS user_role;
CREATE TABLE user_role (
  user_id   INTEGER,
  role_id   INTEGER,
  FOREIGN KEY (user_id) references users(user_id),
  FOREIGN KEY (role_id) references roles(role_id)
);

