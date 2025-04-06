package DesignPatterns.CreationalDesinPatterns.FactoryPattern.FactoryMethodPattern;

public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
    
}

//this is the concrete creator class which implements the creator interface(VehicleFactory) of the factory method pattern
//this class is responsible for creating the product object(Car) of the factory method pattern

