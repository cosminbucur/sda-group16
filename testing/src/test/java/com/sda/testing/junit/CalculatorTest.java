package com.sda.testing.junit;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.add(5, 3);

        // then
        assert result == 8;
    }

    @Test
    public void testSub() {
        // given
        Calculator calculator = new Calculator();

        // when
        int result = calculator.subtract(5, 3);

        // then
        assert result == 2;
    }
}
