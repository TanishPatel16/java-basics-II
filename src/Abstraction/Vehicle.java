package Abstraction;

public abstract class Vehicle {
    public double speed;
    public String owner;
    public int numWheels;

    abstract void accelerate(double speed);
    abstract void brake(double speed);
}
