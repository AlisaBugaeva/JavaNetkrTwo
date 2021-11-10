package com.mycompany.chapter4;

import com.mycompany.chapter2.Point;

public class Rectangle extends Shape implements Cloneable {
    private double width;
    private double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        double xc = p.getX()+width/2;
        double yc = p.getY()+height/2;
        Point centre = new Point(xc,yc);
        return centre;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", topLeft=" + p +
                '}';
    }
}
