package it.morfoza.company;

/**
 * Created by Wojt on 2016-07-29.
 */
public class Employee {


    private String firstname;
    private String lastname;
    private String position;
    private double salary;
    private boolean hardworking;

    public String toString() {
        return "Name :" + firstname + ", " + lastname + ", salary :" + salary;
    }

    public double getSalary() {
        return salary;
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public void giveRise(int percent) {
        salary += salary * percent / 100;
    }


}


