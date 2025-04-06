package SOLID.InterfaceSegregationPrinciple.VoilationOfISP;

public class Waiter implements HotelStaff {

    public void cleanRoom() {
        // Do nothing
    }

    public void serveFood() {
        System.out.println("Serving food to the customer");
    }

    public void coockFood() {
        // Do nothing
    }

    public void manageBooking() {
        // Do nothing
    }
    
}

/*
    This is voilating the ISP (Interface Segregation Principle )
    since Cheff class is forced to implement cookFood, CleanRoom and ManageBooking methods 
    even though Cheff is not responsible for that
    
    tip: avoid fat interfaces

*/
