INSERT INTO sql_tutorial.departments
    (id_departments ,name)
VALUES
    (1, 'SALES'),
    (2, 'IT'),
    (3, 'HR');

INSERT INTO employees
    (first_name, last_name, id_departments)
VALUES
    (' John',' Smith', 1),
    (' John',' Cage', 2),
    (' Jadine',' Mcclain', 3),
    (' Ibraheem',' Mcfadden', 1),
    (' Kade',' Christie', 2);

INSERT INTO sql_tutorial.persons
    (id, first_name, last_name, birth_date)
VALUES
    (1, 'Michael', 'Harding', '1937-07-25'),
    (2, 'Ariana', 'Fox', '1992-09-30'),
    (3, 'Madelyn', 'Flynn', '1953-03-05'),
    (4, 'Fynley', 'Dodd', '1973-03-27'),
    (5, 'Aliza', 'Wyatt', '1969-02-14'),
    (6, 'Michael', 'Doss', '1964-12-11'),
    (7, 'John', 'Unknown', NULL);

-- insert
INSERT INTO sql_tutorial.employees
    (first_name, last_name, id_departments)
    SELECT
        CONCAT (first_name,'-duplicate'),
        CONCAT (last_name, '-duplicate'),
        id_departments
    FROM
        sql_tutorial.employees;

-- update
UPDATE
    sql_tutorial.employees
SET
    first_name = 'alex'
WHERE
    id_employees = 3;

-- delete
DELETE FROM
    sql_tutorial.employees
WHERE
    id_employees = 6;