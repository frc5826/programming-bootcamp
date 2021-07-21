package com.avisautomata.lectures.classes.shapes;

public class Rectangle extends Polygon {

    private double a;
    private double b;

    public Rectangle(double lengthA, double lengthB) {
        super(4);
        this.a = lengthA;
        this.b = lengthB;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
