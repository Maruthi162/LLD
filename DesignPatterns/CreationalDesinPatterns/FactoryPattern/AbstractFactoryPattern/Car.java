package DesignPatterns.CreationalDesinPatterns.FactoryPattern.AbstractFactoryPattern;

// Concrete Product: Car
// This class implements the Vehicle interface and provides the behavior for a car.
public class Car implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving the Car");
    }
}
