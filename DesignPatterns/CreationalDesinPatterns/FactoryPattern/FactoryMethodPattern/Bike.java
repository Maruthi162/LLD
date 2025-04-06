package DesignPatterns.CreationalDesinPatterns.FactoryPattern.FactoryMethodPattern;

public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving the Bike");
    }

}
//this is the product class which implements the product interface(Vehicle) of the factory method pattern
