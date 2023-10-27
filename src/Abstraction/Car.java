package Abstraction;

public class Car extends Vehicle{
    private int numDoors;
    private int numWindows;
    public Car(int numDoors, int numWindows, double speed, String owner, int numWheels){
        this.numDoors = numDoors;
        this.numWindows = numWindows;
        this.speed = speed;
        this.owner = owner;
        this.numWheels = numWheels;
    }

    public void accelerate(double speed){
        this.speed += speed;
    }

    public void brake(double speed){
        this.speed -= speed;
    }
}
