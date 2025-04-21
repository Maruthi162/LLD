package CaseStudies.ParkingLotSystem.Vehicle;

import CaseStudies.ParkingLotSystem.Enums.VehicleType;

public class Car extends Vehicle {
    //private Payment payment;

    public Car(String licensePlate, String color,  VehicleType vehicleType, String ownerName, String ownerContact) {
        super(licensePlate, color, vehicleType, ownerName, ownerContact);
    }

    @Override
    public void displayInfo() {
        System.out.println("Car License Plate: " + getLicensePlate());
        System.out.println("Car Color: " + getColor());
        System.out.println("Car Type: " + getVehicleType());
        System.out.println("Owner Name: " + getOwnerName());
        System.out.println("Owner Contact: " + getOwnerContact());
    }

   @Override
   public void park(){
        System.out.println("Parking the Car with License Plate: " + getLicensePlate());
        // Logic to park the car in the parking lot
    }
    @Override
    public void unpark(){
        System.out.println("Unparking the Car with License Plate: " + getLicensePlate());
        // Logic to unpark the car from the parking lot
   }


}
