package com.thoughtworks.tutorial.shape;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class CircleTest {

    private Circle circle;

    @Before
    public void setUp() {
        int radio = 5;
        circle = new Circle(radio);
    }

    @Test
    public void shouldReturnArea() {
        double area = circle.calculateArea();

        assertEquals(78.54, area, 0.01);
    }

    @Test
    public void shouldReturnPerimeter() {
        double perimeter = circle.calculatePerimeter();

        assertEquals(31.42, perimeter, 0.01);
    }

    @Test
    public void shouldImplementInterface() {
        assertThat(circle, instanceOf(Shape.class));
    }

}
