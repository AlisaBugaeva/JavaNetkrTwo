package com.mycompany.chapter3;

public class Employee implements Measurable {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName(){
        return firstName+" "+ lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(){
        return salary*12;
    }

    public int raiseSalary(int percent){
        salary+= (int)(salary*percent/100);
        return salary;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "id=" + id +
                ", name=" + firstName +
                " " + lastName +
                ", salary=" + salary +
                ']';
    }


    public double getMeasure()
    {
        return salary;
    }

    public static double average(Measurable[] objects) {
        double sum = 0;
        for (int i = 0; i< objects.length;i++) {
            sum = sum + objects[i].getMeasure();
        }
        if (objects.length > 0) {
            return sum / objects.length;
        }
        else return 0;
    }

    public static Measurable largest(Measurable[] objects){
        for(int i = 0; i< objects.length-1;i++){
            for (int j = objects.length - 1; j > i; j--){
                if (objects[j - 1].getMeasure() > objects[j].getMeasure()) {
                    Measurable tmp = objects[j - 1];
                    objects[j - 1] = objects[j];
                    objects[j] = tmp;
                }
            }
        }

        return objects[objects.length-1];


    }
}
