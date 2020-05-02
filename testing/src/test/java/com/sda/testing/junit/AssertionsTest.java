package com.sda.testing.junit;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class AssertionsTest {

    @Test
    public void assertionTest() {
        boolean condition = 5 > 2;
        int[] array1 = {1, 2};
        int[] array2 = {1, 2};
        String nullString = null;
        String realString = "";

        assertEquals(64, 2 * 32);
        assertNotEquals("values are not equal", 1, 2);
        assertTrue(condition);
        assertArrayEquals(array1, array2);
        assertNull(nullString);
        assertNotNull(realString);
    }
}
