package CaseStudies.ParkingLotSystem;

import CaseStudies.ParkingLotSystem.Enums.VehicleType;
import CaseStudies.ParkingLotSystem.ParkingFloor.ParkingFloor;
import CaseStudies.ParkingLotSystem.ParkingLot.ParkingLot;
import CaseStudies.ParkingLotSystem.ParkingSpot.ParkingSpot;
import CaseStudies.ParkingLotSystem.Ticket.Entrance;
import CaseStudies.ParkingLotSystem.Ticket.Ticket;
import CaseStudies.ParkingLotSystem.Ticket.Exit;
import CaseStudies.ParkingLotSystem.Enums.PaymentType;



public class Client {
    public static void main(String[] args) {
         // Initialize the parking lot
        ParkingLot parkingLot = ParkingLot.getInstance();
        parkingLot.initializeParkingFloors(3); // Create 3 parking floors

        // Initialize display boards for each floor
        for (ParkingFloor floor : parkingLot.getParkingFloors()) {
            floor.initializeDisplayBoard();
        }

        // Create an entrance and generate a ticket
        Entrance entrance = new Entrance("Entrance1");
        System.out.println("======================== TICKET GENERATION AND SPOT ASSIGNMENT ========================");
        System.out.println();
        entrance.openEntrance(VehicleType.CAR, "AP0243521", "black", "Maruthi", "6309840068");
        Ticket ticket = entrance.getTicket();

        if (ticket != null) {
            System.out.println("Ticket generated successfully!");
            ticket.showTicketDetails(); // Display ticket details
        } else {
            System.out.println("Failed to generate ticket.");
        }
        ParkingSpot assignedSpot = ticket.getParkingSpot(); // Get the assigned parking spot from the ticket
        System.out.println();
        System.out.println("======================== ASSIGNED PARKING SPOT ========================");
        if (assignedSpot != null) {
            System.out.println("Assigned parking spot ID: " + assignedSpot.getSpotId() + " on floor: " + assignedSpot.getFloorId());
        } else {
            System.out.println("No available parking spots for the vehicle type.");
        }

        // Simulate vehicle parking
        System.out.println();
        System.out.println("======================== PARKING VEHICLE ========================");
        assignedSpot.parkVehicle(ticket.getVehicle()); // Park the vehicle in the assigned spot
        System.out.println("Vehicle parked successfully!");
        System.out.println("Vehicle " + ticket.getVehicle().getLicensePlate() + " is parked in spot ID: " + assignedSpot.getSpotId() + " on floor: " + assignedSpot.getFloorId());

        // Simulate vehicle exit
        entrance.closeEntrance(); // Close the entrance after vehicle exit
        System.out.println();
        System.out.println("======================== EXITING VEHICLE ========================");
        Exit exit = new Exit("Exit1");
        exit.processExit(ticket, PaymentType.CREDIT_CARD); // Process the exit and payment

        
        
    
    }
}
