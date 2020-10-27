package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(8, 5, 7);
        assertThat(result, is(8));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(8, 3, 9);
        assertThat(result, is(9));
    }

    @Test
    public void whenFirstSecondThirdEqual() {
        int result = MultiMax.max(6, 6, 6);
        assertThat(result, is(6));
    }
}