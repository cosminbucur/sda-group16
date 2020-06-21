USE `sql_tutorial`;
DROP procedure IF EXISTS `insert_employee`;

--
-- DELIMITER is used so that you can use multiple statements ending in ;
DELIMITER $$
USE `sql_tutorial`$$
CREATE PROCEDURE `insert_employee`(
p_first_name VARCHAR(45),
p_last_name VARCHAR(45),
p_department_id INT)
BEGIN
    INSERT INTO employees
    (first_name , last_name , id_departments)
    VALUES
    (p_first_name , p_last_name , p_department_id);
END$$

DELIMITER ;

-- call procedure
CALL insert_employee('Kate', 'Joseph', 3);