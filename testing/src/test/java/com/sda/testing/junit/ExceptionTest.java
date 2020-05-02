package com.sda.testing.junit;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

public class ExceptionTest {

    // use TDD to implement division
    // corner case
    @Test(expected = ArithmeticException.class)
    public void shouldThrowExceptionWhenDividingBy0() {
        // given
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();

        // when
        calculator.divide(number, 0);

        // then
        // should throw exception
    }

    @Test
    public void shouldDivide() {
        // given
        Calculator calculator = new Calculator();
        int expected = 2;

        // when
        int actual = calculator.divide(4, 2);

        // then
        // should throw exception
        Assert.assertEquals(expected, actual);
    }
}
