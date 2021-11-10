package com.mycompany.chapter4;


import com.mycompany.chapter2.Point;

public class Circle extends Shape implements Cloneable {
    private double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", center=" + p +
                '}';
    }

    @Override
    public Point getCenter() {
        return p;
    }




}
