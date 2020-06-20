-- count
SELECT
    COUNT(*) AS 'persons count'
FROM
    sql_tutorial.persons;

-- max
SELECT
    MAX(first_name) AS 'alphabetically max first name'
FROM
    sql_tutorial.persons;

-- average
SELECT
    AVG(birth_date) AS 'average birth date'
FROM
    sql_tutorial.persons;