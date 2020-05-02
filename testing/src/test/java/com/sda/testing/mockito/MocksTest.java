package com.sda.testing.mockito;

import com.sda.testing.junit.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentMatchers;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class MocksTest {

    // mock option 2
    Calculator mock = Mockito.mock(Calculator.class);

    // mock option 1
    // instruct mockito that this is not a real object
    @Mock
    private Calculator mockCalculator;

    @Test
    public void whenAdd_thenReturnOk() {
        // given
        // anyInt() = matcher
        Mockito.when(mockCalculator.add(ArgumentMatchers.anyInt(), ArgumentMatchers.anyInt()))
            .thenReturn(6);
        // from now on the calculator.add(1, 3) returns 6

        // when
        int actual = mockCalculator.add(1, 3);

        // then
        assertEquals(6, actual);
    }
}
