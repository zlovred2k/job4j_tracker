package ru.job4j.opp;

import org.junit.Test;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest {
    @Test
    public void testDistance3d() {
        Point point1 = new Point(2, 5, 2);
        Point point2 = new Point(1, 2, 3);
        double result = point1.distance3d(point2);
        assertThat(result, closeTo(3.31, 0.01));
    }

    @Test
    public void testDistanceWhen3F16() {
        Point point1 = new Point(2, 5);
        Point point2 = new Point(1, 2);
        double result = point1.distance(point2);
        assertThat(result, closeTo(3.16, 0.01));
    }

    @Test
    public void testDistanceWhen4F24() {
        Point point1 = new Point(4, 4);
        Point point2 = new Point(1, 1);
        double result = point1.distance(point2);
        assertThat(result, closeTo(4.24, 0.01));
    }

}