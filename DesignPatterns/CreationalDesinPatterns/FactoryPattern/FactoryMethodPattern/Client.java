package DesignPatterns.CreationalDesinPatterns.FactoryPattern.FactoryMethodPattern;

public class Client {
    
    public static void main(String[] args) {
        //create a Car from CarFactory
        VehicleFactory carFactory = new CarFactory();
        Vehicle car = carFactory.createVehicle();
        car.drive();

        //create a Bike from BikeFactory
        VehicleFactory bikeFactory = new BikeFactory();
        Vehicle bike = bikeFactory.createVehicle();
        bike.drive();
    }
}

//here we are creating the object of the factory class and then using the factory class to get the object of the product class
//now our code adhere to Open Closed principle as we can add new product classes without changing the client code
// if we want to add new type of vehicle then we need to add a new factory class and a new product class and that's it don't need to modify the existing code
//this is the advantage of Factory Method Pattern
