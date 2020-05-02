package com.sda.testing.assertj;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertJTest {

    @Test
    public void assertJTest() {
        // given
        String text = "abc";
        String[] stringArray = {"abc", "cde", "efg"};

        // then
        assertThat(text).isEqualTo("abc");

        assertThat(stringArray)
            .hasSize(3)
            .contains("cde")
            .contains("ddsdas")
            .doesNotContain("xyz");
    }
}
