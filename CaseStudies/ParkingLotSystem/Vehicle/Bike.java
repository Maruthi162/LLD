package CaseStudies.ParkingLotSystem.Vehicle;

import CaseStudies.ParkingLotSystem.Enums.VehicleType;

public class Bike extends Vehicle{

    public Bike(String licensePlate, String color, VehicleType vehicleType, String ownerName, String ownerContact) {
        super(licensePlate, color, vehicleType, ownerName, ownerContact);
    }
    @Override
    public void displayInfo() {
        System.out.println("Bike License Plate: " + getLicensePlate());
        System.out.println("Bike Color: " + getColor());
        System.out.println("Bike Type: " + getVehicleType());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Owner Contact: " + getOwnerContact());
    }
    @Override
    public void park() {
        System.out.println("Parking the Bike with License Plate: " + getLicensePlate());
        // Logic to park the bike in the parking lot
    }
    @Override
    public void unpark() {
        System.out.println("Unparking the Bike with License Plate: " + getLicensePlate());
        // Logic to unpark the bike from the parking lot
    }
}
