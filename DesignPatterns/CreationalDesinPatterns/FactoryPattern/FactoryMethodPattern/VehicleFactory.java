package DesignPatterns.CreationalDesinPatterns.FactoryPattern.FactoryMethodPattern;

public interface VehicleFactory {
    public Vehicle createVehicle();
}

//this is the Creator interface which is implemented by the concrete creators(CarFactory, BikeFactory) of the factory method pattern
