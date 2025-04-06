package SOLID.InterfaceSegregationPrinciple.VoilationOfISP;

public class Cleaner implements HotelStaff {

    public void cleanRoom() {
        System.out.println("Room is cleaned.");
    }
    
    public void serveFood() {
        // This method is not applicable for Cleaner.
    }

    public void coockFood() {
        // This method is not applicable for Cleaner.
    }

    public void manageBooking() {
        // This method is not applicable for Cleaner.
    }
    
}

/*
    This is voilating the ISP (Interface Segregation Principle )
    since Cheff class is forced to implement cookFood, ServeFood and ManageBooking methods 
    even though Cheff is not responsible for that
    
    tip: avoid fat interfaces

*/
