package com.thoughtworks.tutorial.shape;

public class Triangle implements Shape{

    private double side;

    public Triangle(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side / 2;
    }

    public double calculatePerimeter() {
        return side * 3;
    }

}
