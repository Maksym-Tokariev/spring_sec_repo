# --Table: users
CREATE TABLE users (
                       id SERIAL NOT NULL PRIMARY KEY,
                       username VARCHAR(255) NOT NULL,
                       password VARCHAR(255) NOT NULL
);

# --Table: roles
CREATE TABLE roles (
                       id SERIAL NOT NULL PRIMARY KEY,
                       name VARCHAR(100) NOT NULL
);

# --Table fo mapping user and roles: user_roles
CREATE TABLE user_roles (
                            user_id INT NOT NULL,
                            role_id INT NOT NULL,

                            FOREIGN KEY (user_id) REFERENCES users (id),
                            FOREIGN KEY (role_id) REFERENCES roles (id),

                            UNIQUE (user_id, role_id)
);

# --Insert data

INSERT INTO users VALUES (1,'maks', '123');
INSERT INTO roles VALUES (1, 'ROLE_USER');
INSERT INTO roles VALUES (2, 'ROLE_ADMIN');
INSERT INTO user_roles VALUES (1,2);