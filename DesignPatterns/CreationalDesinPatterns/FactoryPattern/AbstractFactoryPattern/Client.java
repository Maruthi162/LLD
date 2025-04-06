package DesignPatterns.CreationalDesinPatterns.FactoryPattern.AbstractFactoryPattern;

// Client Class
// This class demonstrates the use of the Abstract Factory Pattern to create families of related objects.
public class Client {
    public static void main(String[] args) {
        // Creating Car and Engine using CarFactory
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle(); // Create a Car
        Engine carEngine = carFactory.createEngine(); // Create a CarEngine

        // Using the Car and its Engine
        carEngine.start(); // Start the CarEngine
        car.drive();       // Drive the Car
        carEngine.stop();  // Stop the CarEngine

        // Creating Bike and Engine using BikeFactory
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle(); // Create a Bike
        Engine bikeEngine = bikeFactory.createEngine(); // Create a BikeEngine

        // Using the Bike and its Engine
        bikeEngine.start(); // Start the BikeEngine
        bike.drive();       // Drive the Bike
        bikeEngine.stop();  // Stop the BikeEngine
    }
}
