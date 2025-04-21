package CaseStudies.ParkingLotSystem.Ticket;

import java.time.LocalDateTime;

import CaseStudies.ParkingLotSystem.Enums.VehicleType;
import CaseStudies.ParkingLotSystem.ParkingLot.ParkingLot;
import CaseStudies.ParkingLotSystem.ParkingSpot.ParkingSpot;
import CaseStudies.ParkingLotSystem.Vehicle.VehicleFactory;
import CaseStudies.ParkingLotSystem.Vehicle.Vehicle;

public class Entrance {
    private String entranceId; // Unique identifier for the entrance

    private Ticket ticket; // Reference to the ticket associated with the entrance
    private boolean isOpen; // Status of the entrance (open/closed)
    private ParkingLot parkingLot; // Reference to the parking lot associated with the entrance

    public Entrance(String entranceId) {
        this.entranceId = entranceId;
        this.isOpen = true; // Default to open
        this.parkingLot = ParkingLot.getInstance(); // Assuming a single instance of ParkingLot
    }

    public Ticket generateTicket(Vehicle vehicle) {
       
        ParkingSpot assignedSpot = parkingLot.getAvailableSpot(vehicle.getVehicleType()); // Get an available parking spot for the vehicle type
        if (assignedSpot != null) {
            ticket = new Ticket(LocalDateTime.now(), vehicle); // Initialize the ticket
            ticket.setVehicle(vehicle); // Set the vehicle in the ticket
            return ticket; // Return the generated ticket
        } else {
            System.out.println("No available parking spots for the vehicle type.");
        }
        return null; // Return null if no available spot is found
        
    }

    public void openEntrance(VehicleType vehicleType, String licensePlate, String color, String ownerName, String ownerContact) {
        Vehicle vehicle = VehicleFactory.createVehicle(vehicleType, licensePlate, color, ownerName, ownerContact);
        generateTicket(vehicle); // Generate a ticket for the vehicle
        System.out.println("Ticket generated for vehicle: " + licensePlate + " at entrance: " + entranceId);

        isOpen = true; // Set entrance status to open
    }

    public void closeEntrance() {
        if(isOpen == false) {
            System.out.println("Entrance " + entranceId + " is already closed.");
            return; // Exit if the entrance is already closed
        }
        setOpen(false); // Set entrance status to closed
        System.out.println("Entrance " + entranceId + " is now closed.");
    }

    //getters and setters
    public String getEntranceId() {
        return entranceId;
    }
    public void setEntranceId(String entranceId) {
        this.entranceId = entranceId;
    }
    public Ticket getTicket() {
        return ticket;
    }
    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }

}
