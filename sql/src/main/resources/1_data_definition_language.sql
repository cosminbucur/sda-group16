-- create schema
CREATE SCHEMA `sql_tutorial`;

-- create departments table
CREATE TABLE `sql_tutorial`.`departments` (
  `id_departments` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id_departments`));

-- create employees table
CREATE TABLE sql_tutorial.employees (
    id_employees INT UNSIGNED AUTO_INCREMENT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    `id_departments` INT NOT NULL,
    PRIMARY KEY (`id_employees`),
    INDEX `fk_employees_departments_idx` (`id_departments` ASC) VISIBLE,
    CONSTRAINT `fk_employees_departments`
    FOREIGN KEY (`id_departments`)
    REFERENCES `sql_tutorial`.`departments` (`id_departments`)
);

-- create persons table
CREATE TABLE `sql_tutorial`.`persons` (
  `id` INT NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NOT NULL,
  `birth_date` DATE NOT NULL,
  PRIMARY KEY (`id`));

-- add column
ALTER TABLE employees
ADD COLUMN salary INT;

-- remove column
ALTER TABLE employees
DROP COLUMN salary;
