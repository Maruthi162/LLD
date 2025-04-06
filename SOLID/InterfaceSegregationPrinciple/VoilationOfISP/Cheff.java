package SOLID.InterfaceSegregationPrinciple.VoilationOfISP;

public class Cheff implements HotelStaff {
    public void cleanRoom() {
        // Do Nothing
    }

    public void serveFood() {
        // Do Nothing
    }

    public void coockFood() {
        System.out.println("Cooking food");
    }

    public void manageBooking() {
        // Do Nothing
    }
}

/* This is voilating the ISP (Interface Segregation Principle )
    since Cheff class is forced to implement derveFood, CleanRoom and ManageBooking methods 
    even though Cheff is not responsible for that
    
    tip: avoid fat interfaces
    */