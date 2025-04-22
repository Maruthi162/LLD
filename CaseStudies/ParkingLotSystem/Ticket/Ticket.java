package CaseStudies.ParkingLotSystem.Ticket;

import java.time.LocalDateTime;

import CaseStudies.ParkingLotSystem.ParkingLot.ParkingLot;
import CaseStudies.ParkingLotSystem.ParkingSpot.ParkingSpot;
import CaseStudies.ParkingLotSystem.Vehicle.Vehicle;

public class Ticket {
    private String ticketId;
    private LocalDateTime entryDateTime;
    private LocalDateTime exitDateTime;
    private Vehicle vehicle;
    private LocalDateTime SpentTime;
    private double ratePerHour; // Rate per hour for parking
    private double amountDue;
    private boolean isPaid; // Default to unpaid
    private ParkingSpot parkingSpot; // ID of the assigned parking spot
    private ParkingLot parkingLot; // Reference to the ParkingLot

    public Ticket( LocalDateTime entryDateTime, Vehicle vehicle) {
        this.ticketId = vehicle.getLicensePlate();
        this.entryDateTime = entryDateTime;
        this.vehicle = vehicle;
        this.isPaid = false; // Default to unpaid
        this.parkingLot = ParkingLot.getInstance(); // Assuming a single instance of ParkingLot
        assignParkingSpot(); // Assign a parking spot when the ticket is created
        calRatePerHour(); // Calculate rate per hour based on vehicle type
    }


    public void assignParkingSpot(){
        ParkingSpot assignedSpot = parkingLot.getAvailableSpot(vehicle.getVehicleType());
        if (assignedSpot != null) {
            this.parkingSpot = assignedSpot; // Assign the parking spot ID to the ticket
            assignedSpot.setOccupied(true); // Mark the spot as occupied
            System.out.println("Assigned parking floor: "+ assignedSpot.getFloorId()+" spot ID: " + assignedSpot.getSpotId() + " for vehicle: " + vehicle.getLicensePlate());
        } else {
            System.out.println("No available parking spots for vehicle type: " + vehicle.getVehicleType());
        }
    }

    public void calculateSpentTime() {
        if (exitDateTime != null) {
            this.SpentTime = exitDateTime.minusHours(entryDateTime.getHour()).minusMinutes(entryDateTime.getMinute());
        } else {
            System.out.println("Exit time not set yet.");
        }
    }
    public void calRatePerHour(){
        switch(vehicle.getVehicleType()){
            case CAR:
                setRatePerHour(10.0); // Example rate for cars
            case BIKE:
                setRatePerHour(5.0);// Example rate for bikes
            case TRUCK:
                setRatePerHour(15); // Example rate for trucks
            default:
                setRatePerHour(0.0);; // Default rate if vehicle type is unknown
        }
    }
    public double calculateAmountDue() {

        calculateSpentTime(); // Ensure spent time is calculated before calculating amount due
        if (SpentTime != null) {
            long hours = SpentTime.getHour();
            long minutes = SpentTime.getMinute();
            double totalHours = hours + (minutes / 60.0);
            this.amountDue = totalHours * ratePerHour;
            return amountDue; // Return the calculated amount due
        } else {
            System.out.println("Spent time not calculated yet.");
        }
        return 0.0; // Return 0 if spent time is not calculated
    }

    public void showTicketDetails() {
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Entry Date and Time: " + entryDateTime);
        System.out.println("Exit Date and Time: " + exitDateTime);
        System.out.println("Vehicle: " + vehicle.getLicensePlate());
        System.out.println("Spent Time: " + SpentTime);
        System.out.println("Amount Due: " + amountDue);
        System.out.println("Paid: " + isPaid);
        System.out.println("Parking Spot ID: " + parkingSpot.getSpotId());
    }

    //Getters and Setters
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public LocalDateTime getEntryDateTime() {
        return entryDateTime;
    }
    public void setEntryDateTime(LocalDateTime entryDateTime) {
        this.entryDateTime = entryDateTime;
    }
    public LocalDateTime getExitDateTime() {
        return exitDateTime;
    }
    public void setExitDateTime(LocalDateTime exitDateTime) {
        this.exitDateTime = exitDateTime;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public LocalDateTime getSpentTime() {
        return SpentTime;
    }
    public void setSpentTime(LocalDateTime spentTime) {
        SpentTime = spentTime;
    }
    public double getAmountDue() {
        return amountDue;
    }
    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }
    public boolean isPaid() {
        return isPaid;
    }
    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
   public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
    
    public ParkingLot getParkingLot() {
        return parkingLot;
    }
    public double getRatePerHour() {
        return ratePerHour;
    }  
    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    
}
