package ru.job4j.opp;

import junit.framework.TestCase;

import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

public class PointTest extends TestCase {

    public void testDistance3d() {
        Point point1 = new Point(2, 5, 2);
        Point point2 = new Point(1, 2, 3);
        double result = point1.distance3d(point2);
        assertThat(result, closeTo(3.31, 0.01));
    }
}