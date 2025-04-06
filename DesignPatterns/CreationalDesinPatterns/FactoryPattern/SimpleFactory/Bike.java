package DesignPatterns.CreationalDesinPatterns.FactoryPattern.SimpleFactory;

public class Bike implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving the Bike");
    }
    
}

//this is a product class which implements the product interface Vehicle
//this is the concrete product class
//this is the class whose object will be created by the factory class
