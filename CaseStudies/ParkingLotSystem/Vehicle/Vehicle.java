package CaseStudies.ParkingLotSystem.Vehicle;

import CaseStudies.ParkingLotSystem.Enums.VehicleType;
import CaseStudies.ParkingLotSystem.Ticket.Ticket;

public abstract class Vehicle {
    private String licensePlate;
    String color;
    private VehicleType vehicleType; // e.g., Car, Bike, Truck, etc.
    private String ownerName;
    private String ownerContact; // Contact information of the vehicle owner
    private Ticket ticket; // Reference to the ticket associated with the vehicle


    public Vehicle(String licensePlate, String color, VehicleType vehicleType, String ownerName, String ownerContact) {
        this.licensePlate = licensePlate;
        this.color = color;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
        this.ownerContact = ownerContact;
    }
    // Getters and Setters for the attributes
    public String getLicensePlate() {
        return licensePlate;
    }
    public String getColor() {
        return color;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public String getOwnerContact() {
        return ownerContact;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setOwnerContact(String ownerContact) {
        this.ownerContact = ownerContact;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }   

    /// Abstract methods to be implemented by subclasses
    public abstract void displayInfo(); // Abstract method to display vehicle information
    public abstract void park(); // Abstract method to park the vehicle
    public abstract void unpark(); // Abstract method to unpark the vehicle
    
}
