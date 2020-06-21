-- function
DELIMITER $$
CREATE FUNCTION add_two_ints(
    a INT, -- parameter a of type int
    b INT -- parameter b of type int
) RETURNS INT -- function returns an int

DETERMINISTIC -- always produces the same result for the same input parameters
READS SQL DATA -- indicates that the routine contains statements that read data
BEGIN -- body of the function
    RETURN a + b;
END $$

-- use function:
SELECT add_two_ints(3, 5);

-- if else
DELIMITER $$
CREATE FUNCTION my_sign (a INT)
    RETURNS INT
BEGIN
    IF a > 0 THEN RETURN 1;
    ELSEIF a = 0 THEN RETURN 0;
    ELSE RETURN -1;
    END IF;
END $$

SELECT my_sign(2);

-- loop
DELIMITER $$
CREATE FUNCTION my_power (a INT , b INT)
    RETURNS INT
BEGIN
    DECLARE result INT DEFAULT 1;
    WHILE b > 0 DO -- while loop (with b > 0 condition)
        SET result = result * a; -- set variable's value
        SET b = b - 1;
    END WHILE;
RETURN result;
END $$

SELECT my_power(2, 5);