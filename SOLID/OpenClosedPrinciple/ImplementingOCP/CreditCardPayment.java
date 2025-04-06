package SOLID.OpenClosedPrinciple.ImplementingOCP;

public class CreditCardPayment implements Payment {
    public void pay(int amount){
        System.out.println("Processing the Payment of "+amount+" Through CreditCard");
    }
}
