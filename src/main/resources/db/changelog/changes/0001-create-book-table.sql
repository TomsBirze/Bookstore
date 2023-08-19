--liquibase formatted sql

--changeset toms:1

CREATE TABLE book (
                      id SERIAL PRIMARY KEY,
                      title VARCHAR(100)
);