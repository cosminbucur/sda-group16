-- SELECTS

-- basic select
SELECT
    *
FROM
    sql_tutorial.persons;

-- select particular columns
SELECT
    first_name, last_name
FROM
    sql_tutorial.persons;

-- select distinct entries
SELECT DISTINCT
    first_name
FROM
    sql_tutorial.persons;

-- where clause
SELECT
    first_name, last_name, birth_date
FROM
    sql_tutorial.persons
WHERE
    first_name = 'Michael';

-- select as
SELECT
    first_name AS name,
    last_name AS surname
FROM
    sql_tutorial.persons;

-- select not null
SELECT
    COUNT(birth_date) AS 'persons that have date of birthed filled'
FROM
    sql_tutorial.persons;

-- group by
SELECT
    first_name,
    COUNT(*) AS 'occurrences count'
FROM
    sql_tutorial.persons
GROUP BY
    first_name;

-- having
SELECT
    first_name AS 'we have two or more people with such name!'
FROM
    sql_tutorial.persons
GROUP BY
    first_name
HAVING
    COUNT(*) > 1;

-- JOINS

-- inner join
SELECT
    *
FROM
    sql_tutorial.employees
INNER JOIN
    sql_tutorial.departments ON
    employees.id_departments = departments.id_departments;

-- inner join (multiple tables)
SELECT
    employees.first_name,
    employees.last_name,
    departments.name AS 'department name'
FROM
    sql_tutorial.employees
INNER JOIN
    sql_tutorial.departments ON
    employees.id_departments = departments.id_departments;

-- inner join aliases
SELECT
    e.first_name, e.last_name, d.name AS 'department name'
FROM
    sql_tutorial.employees AS e
INNER JOIN
    sql_tutorial.departments AS d ON
    e.id_departments = d.id_departments;

--- inner join using
SELECT
    employees.first_name,
    employees.last_name,
    departments.name AS 'department name'
FROM
    sql_tutorial.employees
INNER JOIN
    sql_tutorial.departments USING (id_departments);

-- inner join (using equivalent)
SELECT
    *
FROM
    sql_tutorial.employees,
    sql_tutorial.departments
WHERE
    employees.id_departments = departments.id_departments;

-- left join
SELECT
    employees.first_name,
    employees.last_name,
    departments.name AS 'department name'
FROM
    sql_tutorial.employees
LEFT JOIN
    sql_tutorial.departments USING (id_departments);

-- cross join
SELECT
    *
FROM
    sql_tutorial.employees
CROSS JOIN
    sql_tutorial.departments;

-- cross join 2
SELECT
    *
FROM
    sql_tutorial.employees, sql_tutorial.departments;

-- union
SELECT
    first_name
FROM
    sql_tutorial.employees
UNION
    SELECT
        last_name
    FROM
        sql_tutorial.employees;

-- order by asc
SELECT
    *
FROM
    sql_tutorial.employees
ORDER BY
    last_name, first_name;

-- order by desc
SELECT
    *
FROM
    sql_tutorial.employees
ORDER BY
    last_name DESC;

-- limit
SELECT
    *
FROM
    sql_tutorial.employees
LIMIT 3;

-- limit 2
SELECT
    *
FROM
    sql_tutorial.employees
LIMIT 3 , 2;

-- case
SELECT
    CASE
        WHEN first_name LIKE 'M%' THEN 'name starts with M'
        WHEN first_name LIKE 'J%' THEN 'name starts with J'
        ELSE 'name does not start with M or J'
    END AS some_column_name
FROM
    sql_tutorial.persons;

-- exists
SELECT
    *
FROM
    sql_tutorial.employees
WHERE
    EXISTS(
		SELECT
            *
        FROM
            sql_tutorial.departments
        WHERE
            departments.id_departments = employees.id_departments
	);
