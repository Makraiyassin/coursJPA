DROP DATABASE markets;
CREATE DATABASE markets;
use markets;
CREATE TABLE market(
                       market_id INT PRIMARY KEY,
                       name VARCHAR(255),
                       street VARCHAR(255),
                       city VARCHAR(255),
                       number INT,
                       director_id INT,
                       CONSTRAINT fk_director_id FOREIGN KEY (director_id) REFERENCES director(director_id)

);
CREATE TABLE aisle(
                      aisle_id INT PRIMARY KEY,
                      type VARCHAR(255),
                      market_id INT,
                      CONSTRAINT fk_market_id FOREIGN KEY (market_id) REFERENCES market(market_id)
);
CREATE TABLE product(
                        product_id INT PRIMARY KEY,
                        name VARCHAR(255),
                        brand VARCHAR(255),
                        price DECIMAL(6,2)
);
CREATE TABLE director(
                         director_id INT PRIMARY KEY,
                         first_name VARCHAR(255),
                         last_name VARCHAR(255),
                         salary DECIMAL(8,2),
                         market_id INT,
                         CONSTRAINT fk_market_id FOREIGN KEY (market_id) REFERENCES market(market_id)

);
