package SOLID.OpenClosedPrinciple.ImplementingOCP;

public class UPIPayment implements Payment {

    public void pay(int amount) {
        System.out.println("Processing the payment of " + amount + " through UPI");
    }
    
}
