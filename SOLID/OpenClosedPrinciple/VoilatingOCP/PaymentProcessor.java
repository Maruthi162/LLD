package SOLID.OpenClosedPrinciple.VoilatingOCP;

public class PaymentProcessor {

    public static void main(String[] args) {
        String paymentOption = "UPI";

        if(paymentOption.equals("PayPal")){
            PayPal payPal = new PayPal();
            payPal.pay(1000);
        }
        else if(paymentOption.equals("Credit Card")){
            CreditCard creditCard = new CreditCard();
            creditCard.pay(1000);
        }
        else if(paymentOption.equals("UPI")){
            UPI upi = new UPI();
            upi.pay(1000);
        }
    }
}

/*
 * Here OCP has been voilated since it is not closed for modification. 
 * whenever we need to add new payment option we need to modify the existing code which might introduce lot of bugs.
 */
