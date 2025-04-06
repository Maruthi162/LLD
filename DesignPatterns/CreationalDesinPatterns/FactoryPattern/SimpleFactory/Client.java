package DesignPatterns.CreationalDesinPatterns.FactoryPattern.SimpleFactory;

public class Client {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle car = vehicleFactory.getVehicle("CAR");
        car.drive();
        Vehicle bike = vehicleFactory.getVehicle("BIKE");
        bike.drive();
    }
}

//this is the client class which uses the factory class to get the object of the product class

