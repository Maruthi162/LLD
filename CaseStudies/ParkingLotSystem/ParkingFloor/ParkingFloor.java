package CaseStudies.ParkingLotSystem.ParkingFloor;

import java.util.*;

import CaseStudies.ParkingLotSystem.DisplayBoard.DisplayBoard;
import CaseStudies.ParkingLotSystem.Enums.ParkingSpotType;
import CaseStudies.ParkingLotSystem.ParkingSpot.ParkingSpot;

public class ParkingFloor {
    private int floorNumber;
    private int compactSpots;
    private int standardSpots;
    private int handicappedSpots;
    private int electricSpots;
    private int motorcycleSpots;
    private int largeSpots;
    private int totalSpots;
    private int availableSpots;

    private List<ParkingSpot> parkingSpots;
    private DisplayBoard displayBoard; // Display board to show available parking spots

    public ParkingFloor(int floorNumber, int compactSpots, int standardSpots, int handicappedSpots, int electricSpots, int motorcycleSpots, int largeSpots) {
        this.floorNumber = floorNumber;
        this.totalSpots = compactSpots + standardSpots + handicappedSpots + electricSpots + motorcycleSpots + largeSpots;
        this.availableSpots = totalSpots; //initially all spots are available
        this.parkingSpots = new ArrayList<>(totalSpots);
        this.compactSpots = compactSpots;
        this.standardSpots = standardSpots;
        this.handicappedSpots = handicappedSpots;
        this.electricSpots = electricSpots;
        this.motorcycleSpots = motorcycleSpots;
        this.largeSpots = largeSpots;
        initializeParkingSpots(); // Initialize parking spots based on the provided counts
        this.displayBoard = null; // Initialize the display board with an empty map
    }
    public void initializeDisplayBoard() {
        if (displayBoard == null) {
            displayBoard = new DisplayBoard();
        }
    }

    public void initializeParkingSpots() {
        for (int i = 0; i < compactSpots; i++) {
            parkingSpots.add(new ParkingSpot( floorNumber, (i + 1), ParkingSpotType.COMPACT));
        }
        for (int i = 0; i < standardSpots; i++) {
            parkingSpots.add(new ParkingSpot(floorNumber,  (i + 1), ParkingSpotType.STANDARD));
        }
        for (int i = 0; i < handicappedSpots; i++) {
            parkingSpots.add(new ParkingSpot(floorNumber, (i + 1), ParkingSpotType.HANDICAPPED));
        }
        for (int i = 0; i < electricSpots; i++) {
            parkingSpots.add(new ParkingSpot( floorNumber, (i + 1), ParkingSpotType.ELECTRIC));
        }
        for (int i = 0; i < motorcycleSpots; i++) {
            parkingSpots.add(new ParkingSpot(floorNumber, (i + 1), ParkingSpotType.MOTORCYCLE));
        }
        for (int i = 0; i < largeSpots; i++) {
            parkingSpots.add(new ParkingSpot(floorNumber, (i + 1), ParkingSpotType.LARGE));
        }
    }
    
    public ParkingSpot getAvailableSpot(ParkingSpotType spotType) {
        for (ParkingSpot spot : parkingSpots) {
            if (!spot.isOccupied() && spot.getSpotType() == spotType) {
                return spot; // Return the first available spot found of the requested type
            }
        }
        return null; // No available spot found of the requested type
    }

    public void updateDisplayBoard() {
        displayBoard.initializeDisplayBoard(); // Update the display board with available parking spots
    }
    public void showAvailableSpots() {
        displayBoard.updateDisplay(); // Show the available parking spots on the display board
    }

    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public int getCompactSpots() {
        return compactSpots;
    }
    public void setCompactSpots(int compactSpots) {
        this.compactSpots = compactSpots;
    }
    public int getStandardSpots() {
        return standardSpots;
    }
    public void setStandardSpots(int standardSpots) {
        this.standardSpots = standardSpots;
    }
    public int getHandicappedSpots() {
        return handicappedSpots;
    }
    public void setHandicappedSpots(int handicappedSpots) {
        this.handicappedSpots = handicappedSpots;
    }
    public int getElectricSpots() {
        return electricSpots;
    }
    public void setElectricSpots(int electricSpots) {
        this.electricSpots = electricSpots;
    }
    public int getMotorcycleSpots() {
        return motorcycleSpots;
    }
    public void setMotorcycleSpots(int motorcycleSpots) {
        this.motorcycleSpots = motorcycleSpots;
    }
    public int getLargeSpots() {
        return largeSpots;
    }
    public void setLargeSpots(int largeSpots) {
        this.largeSpots = largeSpots;
    }
    public int getTotalSpots() {
        return totalSpots;
    }
    public int getAvailableSpots() {
        return availableSpots;
    }
    public void setAvailableSpots(int availableSpots) {
        this.availableSpots = availableSpots;
    }
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }




}
