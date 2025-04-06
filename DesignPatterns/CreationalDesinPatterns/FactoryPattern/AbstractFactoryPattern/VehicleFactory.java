package DesignPatterns.CreationalDesinPatterns.FactoryPattern.AbstractFactoryPattern;

// Abstract Factory: VehicleFactory
// This interface declares methods for creating related products (Vehicle and Engine).
// These products are abstract, so the factories that implement this interface will create concrete products.
public interface VehicleFactory {
    public Vehicle createVehicle();
    public Engine createEngine();
}
