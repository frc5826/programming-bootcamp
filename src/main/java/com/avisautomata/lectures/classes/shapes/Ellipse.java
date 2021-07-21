package com.avisautomata.lectures.classes.shapes;

public class Ellipse extends Shape {

    private double majorRadius;
    private double minorRadius;

    public Ellipse(double majorRadius, double minorRadius){
        super(0);
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getArea(){
        return Math.PI * this.majorRadius * this.minorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }
}
