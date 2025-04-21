package CaseStudies.ParkingLotSystem.ParkingLot;

import java.util.*;

import CaseStudies.ParkingLotSystem.Enums.ParkingSpotType;
import CaseStudies.ParkingLotSystem.Enums.VehicleType;
import CaseStudies.ParkingLotSystem.ParkingFloor.ParkingFloor;
import CaseStudies.ParkingLotSystem.ParkingSpot.ParkingSpot;

public class ParkingLot {
    private List<ParkingFloor> parkingFloors;
    //global instance of ParkingLot
    private static ParkingLot instance;
    private int totalFloors;
    
    //privatte constructor to prevent instantiation from outside
    // Singleton pattern to ensure only one instance of ParkingLot exists
    private ParkingLot() {
        this.parkingFloors = new ArrayList<>();
    }

    
    public static ParkingLot getInstance() {
        if (instance == null) {
            synchronized (ParkingLot.class) {
                if (instance == null) { // Double-checked locking to ensure thread safety
                    instance = new ParkingLot();
                }
            }
        }
        return instance;
    }


    public void initializeParkingFloors(int totalFloors) {
        this.totalFloors = totalFloors;
        for (int i = 0; i < totalFloors; i++) {
            parkingFloors.add(new ParkingFloor(i + 1, 20, 30, 10, 10, 10, 10)); // Example values for each floor
        }
    }

    public List<ParkingFloor> getParkingFloors() {
        return parkingFloors;
    }
    public void setParkingFloors(List<ParkingFloor> parkingFloors) {
        this.parkingFloors = parkingFloors;
    }
    public int getTotalFloors() {
        return totalFloors;
    }
    public void setTotalFloors(int totalFloors) {
        this.totalFloors = totalFloors;
    }
    
    public ParkingSpot getAvailableSpot(VehicleType vehicleType) {
        for (ParkingFloor floor : parkingFloors) {
            switch (vehicleType) {
                case CAR:
                    return floor.getAvailableSpot(ParkingSpotType.COMPACT); // Assuming compact spots for cars
                case BIKE:
                    return floor.getAvailableSpot(ParkingSpotType.MOTORCYCLE); // Assuming motorcycle spots for bikes
                case TRUCK:
                    return floor.getAvailableSpot(ParkingSpotType.LARGE); // Assuming large spots for trucks
                case BUS:
                    return floor.getAvailableSpot(ParkingSpotType.STANDARD); // Assuming standard spots for buses
                case VAN:
                    return floor.getAvailableSpot(ParkingSpotType.STANDARD); // Assuming standard spots for vans
                default:
                    break; // For other vehicle types, no specific handling
            }
              
        }
        return null; // No available spot found
    }
}
