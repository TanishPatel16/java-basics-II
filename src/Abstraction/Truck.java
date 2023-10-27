package Abstraction;

public class Truck extends Vehicle {
    private int numAxles;
    private double loadCap;
    public Truck(int numAxles, double loadCap, double speed, String owner, int numWheels){
        this.numAxles = numAxles;
        this.loadCap = loadCap;
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
