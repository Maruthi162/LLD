package DesignPatterns.CreationalDesinPatterns.FactoryPattern.SimpleFactory;

public class VehicleFactory {
    public Vehicle getVehicle(String vehicleType) {
        if (vehicleType == null) {
            return null;
        }
        if (vehicleType.equalsIgnoreCase("CAR")) {
            return new Car();
        } else if (vehicleType.equalsIgnoreCase("BIKE")) {
            return new Bike();
        }
        return null;
    }
}


//Here we are voilating the OCP because if we want to add a new vehicle type 
//then we have to modify the VehicleFactory class.
//So, we can use Factory Method Pattern to solve this problem.
//We will see the Factory Method Pattern in the next example.
//The Factory Method Pattern is an extension of the Simple Factory Pattern.
//The Factory Method Pattern is also known as Virtual Constructor.
//The Factory Method Pattern is a creational design pattern that provides an interface for creating objects in a superclass, 
//but allows subclasses to alter the type of objects that will be created.