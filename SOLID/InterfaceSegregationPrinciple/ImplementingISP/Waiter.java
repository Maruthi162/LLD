package SOLID.InterfaceSegregationPrinciple.ImplementingISP;

public class Waiter implements ServeFood, ManageRooms {

    public void serveFood() {
        System.out.println("Food served");
    }
    public void manageBooking() {
        System.out.println("Booking Rooms fpr clients");
    }
    
}
