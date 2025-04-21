package CaseStudies.ParkingLotSystem;

import CaseStudies.ParkingLotSystem.Enums.VehicleType;
import CaseStudies.ParkingLotSystem.ParkingFloor.ParkingFloor;
import CaseStudies.ParkingLotSystem.ParkingLot.ParkingLot;
import CaseStudies.ParkingLotSystem.Ticket.Entrance;
import CaseStudies.ParkingLotSystem.Ticket.Ticket;



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
        entrance.openEntrance(VehicleType.CAR, "AP0243521", "black", "Maruthi", "6309840068");
        Ticket ticket = entrance.getTicket();

        if (ticket != null) {
            System.out.println("Ticket generated successfully!");
        } else {
            System.out.println("Failed to generate ticket.");
        }
    
    }
}
