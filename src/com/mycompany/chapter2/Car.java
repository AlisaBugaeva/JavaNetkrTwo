package com.mycompany.chapter2;

public class Car {
    private double distance;
    private double fuel;
    private double fuelEfficiency;

    public Car(double fuelEfficiency) {
        this.fuelEfficiency = fuelEfficiency;
    }

    public Car(double distance, int fuel, double fuelEfficiency) {
        this.distance = distance;
        this.fuel = fuel;
        this.fuelEfficiency = fuelEfficiency;
    }

    public void drive(double dx){
        if(dx/this.fuelEfficiency<= this.fuel){
            this.distance+=dx;
            this.fuel-=dx/this.fuelEfficiency;
        }
        else{
            System.out.println((int)((dx/this.fuelEfficiency)-this.fuel)+1);
            this.addGallons((int)((dx/this.fuelEfficiency)-this.fuel)+1);
            System.out.println(fuel);
            this.distance+=dx;
            this.fuel-=dx/this.fuelEfficiency;

        }
    }

    public double addGallons(int f){
        this.fuel+=f;
        return fuel;
    }

    public double getCurrentDistance(){
        return distance;
    }

    public double getFuelLevel(){
        return fuel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "distance=" + distance +
                ", fuel=" + fuel +
                ", fuelEfficiency=" + fuelEfficiency +
                '}';
    }
}
