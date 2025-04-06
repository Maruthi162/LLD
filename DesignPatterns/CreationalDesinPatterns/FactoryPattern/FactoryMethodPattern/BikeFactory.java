package DesignPatterns.CreationalDesinPatterns.FactoryPattern.FactoryMethodPattern;

public class BikeFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bike();
    }
    
}

//this is the concrete creator class which implements the creator interface(VehicleFactory) of the factory method pattern
//this class is responsible for creating the product object(Bike) of the factory method pattern

