-- trigger
DELIMITER $$
CREATE TRIGGER store_history BEFORE UPDATE ON employees
FOR EACH ROW
    BEGIN
        INSERT INTO employees_history
        VALUES (new_id_employees , NOW(),
        old_first_name , old_last_name,
        new_first_name , new_last_name);
    END $$

-- use trigger
UPDATE employees
SET first_name ='Lucy'
WHERE first_name='Kate';