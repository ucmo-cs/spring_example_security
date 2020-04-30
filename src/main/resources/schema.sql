DROP TABLE IF EXISTS car;
CREATE TABLE car (
  id     SERIAL PRIMARY KEY,
  make   VARCHAR(50) NOT NULL,
  model  VARCHAR(50) NOT NULL,
  year   INT         NOT NULL
);

DROP TABLE IF EXISTS user;
CREATE TABLE user (
  user_id       SERIAL PRIMARY KEY,
  user_name     VARCHAR(50) NOT NULL,
  email         VARCHAR(50) NOT NULL,
  password      VARCHAR(50) NOT NULL,
  first_name    VARCHAR(50) NOT NULL,
  last_name     VARCHAR(50) NOT NULL,
  active        BOOLEAN NOT NULL
);

DROP TABLE IF EXISTS role;
CREATE TABLE role (
  role_id   SERIAL PRIMARY KEY,
  role      VARCHAR(50) NOT NULL
);
