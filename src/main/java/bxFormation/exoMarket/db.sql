CREATE DATABASE markets;
use markets;
CREATE TABLE market(
                       marker_id INT PRIMARY KEY,
                       name VARCHAR(255),
                       street VARCHAR(255),
                       city VARCHAR(255),
                       number INT
);
CREATE TABLE aisle(
                      aisle_id INT PRIMARY KEY,
                      type VARCHAR(255)
);
CREATE TABLE product(
                        product_id INT PRIMARY KEY,
                        name VARCHAR(255),
                        brand VARCHAR(255),
                        price DECIMAL(6,2)
);
CREATE TABLE director(
                         director_id INT PRIMARY KEY,
                         firs_name VARCHAR(255),
                         last_name VARCHAR(255),
                         salary DECIMAL(8,2)
);

