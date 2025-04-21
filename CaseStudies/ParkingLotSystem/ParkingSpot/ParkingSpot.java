package CaseStudies.ParkingLotSystem.ParkingSpot;

import CaseStudies.ParkingLotSystem.Enums.ParkingSpotType;
import CaseStudies.ParkingLotSystem.Enums.VehicleType;
import CaseStudies.ParkingLotSystem.Vehicle.Vehicle;


public class ParkingSpot {
    private int floorId; // ID of the floor where the parking spot is located
    private int spotId;
    private ParkingSpotType spotType; // e.g., Compact, Standard, Handicapped
    private boolean isOccupied;
    private String vehicleId; // ID of the vehicle parked in this spot, if any
    
    public ParkingSpot(int floorId, int spotId, ParkingSpotType spotType) {
        this.floorId = floorId; // ID of the floor where the parking spot is located
        this.spotId = spotId;
        this.spotType = spotType;
        this.isOccupied = false; // Initially, the spot is not occupied
        this.vehicleId = null; // No vehicle parked initially
    }

    public boolean canParkVehicle(VehicleType vehicleType) {
        // Logic to check if the vehicle can be parked in this spot based on its type and the spot type
        switch (spotType) {
            case COMPACT:
                return vehicleType == VehicleType.CAR || vehicleType == VehicleType.BIKE;
            case STANDARD:
                return vehicleType == VehicleType.CAR || vehicleType == VehicleType.TRUCK || vehicleType == VehicleType.BIKE;
            case HANDICAPPED:
                return vehicleType == VehicleType.CAR; // Assuming only cars can park in handicapped spots
            case ELECTRIC:
                return vehicleType == VehicleType.CAR; // Assuming only electric cars can park here
            case MOTORCYCLE:
                return vehicleType == VehicleType.BIKE; // Only motorcycles allowed
            case LARGE:
                return vehicleType == VehicleType.TRUCK; // Only trucks allowed
            default:
                return false; // Invalid spot type
        }
    }

    public void parkVehicle(Vehicle vehicle) {

        if (vehicle == null) {
            System.out.println("Invalid vehicle.");
            return;
        }
        if (isOccupied) {
            System.out.println("Parking spot is already occupied.");
            return;
        }
        if (!canParkVehicle(vehicle.getVehicleType())) {
            System.out.println("Vehicle type does not match the parking spot type.");
            return;
        }
        setVehicleId(vehicle.getLicensePlate()); // Set the vehicle ID to the parked vehicle's ID

        vehicle.park(); // Call the park method of the vehicle
        System.out.println("Vehicle parked in spot: " + spotId);
        this.isOccupied = true;

    }

    public void unparkVehicle(Vehicle vehicle) {
        if (vehicle == null) {
            System.out.println("Invalid vehicle.");
            return;
        }
        if (!isOccupied) {
            System.out.println("Parking spot is already empty.");
            return;
        }
        this.vehicleId = null; // Clear the vehicle ID
        vehicle.unpark(); // Call the unpark method of the vehicle
        System.out.println("Vehicle unparked from spot: " + spotId);
        this.isOccupied = false; // Mark the spot as empty
    }

    // Getters and Setters for the attributes
    public int getSpotId() {
        return spotId;
    }
    public void setSpotId(int spotId) {
        this.spotId = spotId;
    }
    public ParkingSpotType getSpotType() {
        return spotType;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public boolean isOccupied() {
        return isOccupied;
    }
    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }
    public int getFloorId() {
        return floorId;
    }
    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }


}
