package com.mycompany.chapter4;

import com.mycompany.chapter2.Point;

public class Line extends Shape implements Cloneable {
    private Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        double xc = p.getX()+(to.getX()-p.getX())/2;
        double yc = p.getY()+ (to.getX()- p.getX())/2;
        Point centre = new Point(xc,yc);
        return centre;
    }

    @Override
    public String toString() {
        return "Line{" +
                "from=" + p +
                ", to=" + to +
                '}';
    }
}
