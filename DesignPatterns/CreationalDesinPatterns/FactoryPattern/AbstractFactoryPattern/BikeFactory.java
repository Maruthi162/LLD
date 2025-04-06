package DesignPatterns.CreationalDesinPatterns.FactoryPattern.AbstractFactoryPattern;

// Concrete Factory: BikeFactory
// This class implements the VehicleFactory interface to create Bike and BikeEngine objects.

public class BikeFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Bike(); // Creates a Bike object
    }

    @Override
    public Engine createEngine() {
        return new BikeEngine(); // Creates a BikeEngine object
    }
}
