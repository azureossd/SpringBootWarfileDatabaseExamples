-- Create the table

CREATE TABLE tasks(
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    completed BOOLEAN NOT NULL DEFAULT false
);