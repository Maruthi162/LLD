package CaseStudies.ParkingLotSystem.Vehicle;

import CaseStudies.ParkingLotSystem.Enums.VehicleType;

public class VehicleFactory {
    public static Vehicle createVehicle(VehicleType vehicleType, String licensePlate, String color, String ownerName, String ownerContact) {
        
        switch (vehicleType) {
            case CAR:
                return new Car(licensePlate, color, vehicleType, ownerName, ownerContact);
            case BIKE:
                return new Bike(licensePlate, color, vehicleType, ownerName, ownerContact);
            case TRUCK:
                return new Truck(licensePlate, color, vehicleType, ownerName, ownerContact);
            default:
                throw new IllegalArgumentException("Invalid vehicle type: " + vehicleType);
        }        
    }
}
