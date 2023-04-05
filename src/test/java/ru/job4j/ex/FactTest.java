package ru.job4j.ex;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FactTest {

    @Test
    public void whenException() {
        Fact fact = new Fact();
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> {
                    fact.calc(-10);
                });
        assertThat(exception.getMessage()).isEqualTo("N could not be less than 0");
    }

    @Test
    public void when3Then6() {
        Fact fact = new Fact();
        int result = fact.calc(3);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when4Then24() {
        Fact fact = new Fact();
        int result = fact.calc(4);
        int expected = 24;
        assertThat(result).isEqualTo(expected);
    }
}