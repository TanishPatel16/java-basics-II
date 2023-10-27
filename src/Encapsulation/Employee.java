package Encapsulation;

public class Employee extends Person{
    private double salary;
    public Employee(){

    }

    public String speak(){
        return "Name is: " + super.getFirstName() + " " + super.getLastName() + " and salary is: " + this.salary;
    }
}
