DROP DATABASE IF EXISTS hackathon;
CREATE DATABASE hackathon;
USE hackathon;

DROP table IF EXISTS user_roles;
DROP table IF EXISTS roles;
DROP table IF EXISTS users;

CREATE TABLE roles(
	id_role INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(20) DEFAULT NULL
);

CREATE TABLE users(
	id_user INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(50) UNIQUE NOT NULL,
    pass VARCHAR(250) NOT NULL,
    username VARCHAR(50) UNIQUE NOT NULL,
    id_role INT,
    FOREIGN KEY (id_role) REFERENCES roles(id_role)
);

INSERT INTO roles(title) VALUES('USER');
INSERT INTO roles(title) VALUES('ADMIN');

INSERT INTO users(email, pass, username, id_role) VALUES ('user@email.com', 'userpass', 'user', 1);
INSERT INTO users(email, pass, username, id_role) VALUES ('admin@email.com', 'adminpass', 'admin', 2);