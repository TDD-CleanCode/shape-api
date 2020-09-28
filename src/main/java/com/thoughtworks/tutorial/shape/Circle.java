package com.thoughtworks.tutorial.shape;

public class Circle implements Shape{

    private final int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    @Override
    public double calculateArea() {
        return Math.pow(radio, 2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }

}
