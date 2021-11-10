package com.mycompany.chapter2;

/*public final class Point {
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x=0;
        this.y=0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y){
        double tx = this.x+x;
        double ty = this.y+y;
        Point translatePoint = new Point(tx,ty);
        return translatePoint;
    }

    public Point scale(double n){
        double sx = this.x*n;
        double sy = this.y*n;
        Point scalePoint = new Point(sx,sy);
        return scalePoint;
    }

    @Override
    public String toString() {
        return "Point(" + x +
                "," + y +
                ')';
    }
}*/

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x=0;
        this.y=0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y){
        this.x+=x;
        this.y+=y;
        return this;
    }

    public Point scale(double n){
        this.x*=n;
        this.y*=n;
        return this;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ')';
    }
}
