package com.avisautomata.lectures.classes.shapes;

public abstract class Shape {

    private int edges;

    public Shape(int edges){
        this.edges = edges;
    }

    public abstract double getArea();

    public int getEdges() {
        return edges;
    }
}
