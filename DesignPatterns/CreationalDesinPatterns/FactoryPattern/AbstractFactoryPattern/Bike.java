package DesignPatterns.CreationalDesinPatterns.FactoryPattern.AbstractFactoryPattern;

// Concrete Product: Bike
// This class implements the Vehicle interface and provides the behavior for a bike.
public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving the Bike");
    }
    
}
