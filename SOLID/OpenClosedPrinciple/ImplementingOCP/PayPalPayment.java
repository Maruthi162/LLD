package SOLID.OpenClosedPrinciple.ImplementingOCP;

public class PayPalPayment implements Payment {
    public void pay(int amount){
        System.out.println("processing payment of "+amount+" through PayPal");
    }
}
