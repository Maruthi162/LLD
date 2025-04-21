package CaseStudies.ParkingLotSystem.DisplayBoard;
import java.util.Map;

import CaseStudies.ParkingLotSystem.Enums.ParkingSpotType;
import CaseStudies.ParkingLotSystem.ParkingFloor.ParkingFloor;
import CaseStudies.ParkingLotSystem.ParkingLot.ParkingLot;
import CaseStudies.ParkingLotSystem.ParkingSpot.ParkingSpot;
public class DisplayBoard {
    private Map<ParkingSpotType, Integer> availableSpots;
    private ParkingLot parkingLot;

    public DisplayBoard() {
        this.parkingLot = ParkingLot.getInstance(); // Get the singleton instance of ParkingLot
    }
    public void initializeDisplayBoard() {
        // Initialize the display board with available parking spots
        for(ParkingFloor floor : parkingLot.getParkingFloors()){
            for(ParkingSpot spot : floor.getParkingSpots()){
                if(!spot.isOccupied()){
                    availableSpots.put(spot.getSpotType(), availableSpots.get(spot.getSpotType()) + 1);
                }
            }
        }
    }
    public void updateDisplay() {
        System.out.println("Available Parking Spots:");
        // Display the available parking spots on the board
        for (Map.Entry<ParkingSpotType, Integer> entry : availableSpots.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " spots available");
        }
        
    }
}
