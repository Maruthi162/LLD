package DesignPatterns.CreationalDesinPatterns.FactoryPattern.AbstractFactoryPattern;

// Concrete Factory: CarFactory
// This class implements the VehicleFactory interface to create Car and CarEngine objects.
public class CarFactory implements VehicleFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car(); // Creates a Car object
    }

    @Override
    public Engine createEngine() {
        return new CarEngine(); // Creates a CarEngine object
    }
}
