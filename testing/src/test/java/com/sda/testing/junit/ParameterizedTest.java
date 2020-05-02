package com.sda.testing.junit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedTest {

    // first parameterized element
    @Parameterized.Parameter(0)
    public int argument1;

    // second parameterized element
    @Parameterized.Parameter(1)
    public int argument2;

    // third parameterized element
    @Parameterized.Parameter(2)
    public int expected;

    // create combinations
    @Parameterized.Parameters
    public static Collection<Integer[]> parameters() {
        return Arrays.asList(new Integer[][]{
//            { argument1, argument2, expected }
            {1, 1, 2},  // scenario 1
            {2, 4, 6},  // scenario 2
            {1, 6, 7},
            {4, 1, 5}
        });
    }

    // test add with multiple scenarios using BDD
    @Test
    public void givenTwoNumbers_whenSum_thenOk() {
        // given
        Calculator calculator = new Calculator();

        // when
        int actual = calculator.add(argument1, argument2);

        // then
        assertEquals(expected, actual);
    }

}
