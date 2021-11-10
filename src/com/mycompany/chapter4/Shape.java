package com.mycompany.chapter4;

import com.mycompany.chapter2.Point;

public abstract class Shape implements Cloneable {
    protected Point p;

    public Shape(Point p) {
        this.p = p;
    }

    public void moveBy(double dx, double dy){
        p.translate(dx, dy);
    }

    abstract public Point getCenter();

    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
