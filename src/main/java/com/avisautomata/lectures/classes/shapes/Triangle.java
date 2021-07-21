package com.avisautomata.lectures.classes.shapes;

public class Triangle extends Polygon {

    private double a;
    private double b;
    private double c;

    public Triangle(double lengthA, double lengthB, double lengthC) {
        super(3);
        this.a = lengthA;
        this.b = lengthB;
        this.c = lengthC;
    }

    @Override
    public double getArea() {
        double p = (a + b + c);
        double j = p * (p - a) * (p - b) * (p - c);
        return Math.sqrt(j);
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
