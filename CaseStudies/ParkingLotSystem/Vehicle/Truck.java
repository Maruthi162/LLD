package CaseStudies.ParkingLotSystem.Vehicle;

import CaseStudies.ParkingLotSystem.Enums.VehicleType;

public class Truck extends Vehicle {

    public Truck(String licensePlate, String color, VehicleType vehicleType, String ownerName, String ownerContact) {
        super(licensePlate, color, vehicleType, ownerName, ownerContact);
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck Info: ");
        System.out.println("License Plate: " + getLicensePlate());
        System.out.println("Color: " + getColor());
        System.out.println("Vehicle Type: " + getVehicleType());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Owner Contact: " + getOwnerContact());
    }

    @Override
    public void park() {
        // Logic to park the truck
        System.out.println("Truck parked.");
    }

    @Override
    public void unpark() {
        // Logic to unpark the truck
        System.out.println("Truck unparked.");
    }
    
}
