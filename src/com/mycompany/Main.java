package com.mycompany;

import com.mycompany.chapter2.Car;
import com.mycompany.chapter2.Point;
import com.mycompany.chapter3.Employee;
import com.mycompany.chapter4.Circle;
import com.mycompany.chapter4.Line;
import com.mycompany.chapter4.Rectangle;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Point p = new Point(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);

        Car c1= new Car(3);
        c1.drive(10);
        System.out.println(c1);
        c1.drive(1.5);
        System.out.println(c1);
        System.out.println("------------------------------");

        Employee e1 = new Employee(1,"Tom", "Rock", 2000 );
        Employee e2 = new Employee(2,"Alice", "Bugaeva", 5000 );
        Employee e3 = new Employee(3,"Rob", "Bin", 3500 );
        Employee e4 = new Employee(4,"Kate", "Boo", 2500 );

        Employee[] mas = new Employee[]{e1,e2,e3,e4};
        System.out.println(Employee.average(mas));

        Employee largest =(Employee) Employee.largest(mas);
        System.out.println(largest.getFirstName()+" " + largest.getLastName());
        System.out.println("------------------------------");

        Point p1 = new Point(0,0);
        Point p2 = new Point(2,0);
        Circle circle1 = new Circle(p2,1.5);
        Rectangle r1 = new Rectangle(p1,2,2);
        System.out.println(r1.getCenter());
        Line l1 = new Line(p1,p2);
        System.out.println(l1.getCenter());
        System.out.println(circle1);
        Rectangle r2 = (Rectangle) r1.clone();
        System.out.println(r2);
        Circle circle2 = (Circle) circle1.clone();
        System.out.println(circle2);
        circle1.moveBy(1,3);
        System.out.println(circle1);
        System.out.println(circle2);
        circle1.moveBy(1,1);
        System.out.println(circle1);






    }
}
