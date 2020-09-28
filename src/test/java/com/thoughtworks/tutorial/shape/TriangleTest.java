package com.thoughtworks.tutorial.shape;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {

    private Triangle triangle;

    @Before
    public void setUp(){
        double side = 3;
        triangle = new Triangle(side);
    }

    @Test
    public void shouldCalculateArea() {
        double expectedArea = 4.5;

        double area = triangle.calculateArea();

        assertEquals(area, expectedArea, 0.01);
    }

    @Test
    public void shouldCalculatePerimeter() {
        double expectedPerimeter = 9;

        double perimeter = triangle.calculatePerimeter();

        assertEquals(expectedPerimeter, perimeter, 0.01);
    }

    @Test
    public void shouldBeAnInstanceOfInterface() {
        assertThat(triangle, instanceOf(Shape.class));
    }
}
