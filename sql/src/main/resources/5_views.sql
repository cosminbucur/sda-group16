-- view
CREATE VIEW sql_tutorial.employees_with_dept_name AS
    (SELECT
        employees.*, departments.name AS department_name
    FROM
        sql_tutorial.employees
            LEFT JOIN
        sql_tutorial.departments USING (id_departments));

-- select view
SELECT
	*
FROM
	employees_with_dept_name;