package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class PointTest {

    @Test
    void distance3dWhen111113Then1() {
        Point a = new Point(1, 1, 1);
        Point b = new Point(1, 1, 2);
        double rls = a.distance3d(b);
        double expected = 1D;
        assertThat(rls).isCloseTo(expected, offset(0.001));
    }

    @Test
    void distance3dWhen711111Then6() {
        Point a = new Point(7, 1, 1);
        Point b = new Point(1, 1, 1);
        double rls = a.distance3d(b);
        double expected = 6D;
        assertThat(rls).isCloseTo(expected, offset(0.001));
    }

    @Test
    void distance3dWhen777222Then8Mod66() {
        Point a = new Point(7, 7, 7);
        Point b = new Point(2, 2, 2);
        double rls = a.distance3d(b);
        double expected = 8.66D;
        assertThat(rls).isCloseTo(expected, offset(0.001));
    }
}