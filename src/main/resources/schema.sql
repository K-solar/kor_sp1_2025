CREATE TABLE article (
    id INTEGER auto_increment primary key,
    title VARCHAR(128) NOT NULL,
    body VARCHAR(256) NOT NULL  UNIQUE

);
