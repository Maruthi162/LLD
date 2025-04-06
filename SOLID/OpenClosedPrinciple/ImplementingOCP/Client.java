package SOLID.OpenClosedPrinciple.ImplementingOCP;

public class Client {
    public static void main(String[] args) {
        //process payment Through credit card
        Payment payment1 = new CreditCardPayment();
        PaymentProcessor paymentProcessor1 = new PaymentProcessor();
        paymentProcessor1.processPayment(payment1, 1000);

        //process payment through PayPal
        Payment payment2 = new PayPalPayment();
        PaymentProcessor paymentProcessor2 = new PaymentProcessor();
        paymentProcessor2.processPayment(payment2, 1000);

        //process payment through UPI
        Payment payment3 = new UPIPayment();
        PaymentProcessor paymentProcessor3 = new PaymentProcessor();
        paymentProcessor3.processPayment(payment3, 10000);

    }
}

/*
 * Here we have ashere to the Open Closed Principle because whenever we want to add new payment method we don't need to modify the existing code
 * instead we just create a new class which implements the Payment interface and pass the object of the new class to payment processor .
 * 
 * it open for extension and closed for modification
 */
