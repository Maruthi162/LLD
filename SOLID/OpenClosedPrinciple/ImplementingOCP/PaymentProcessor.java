package SOLID.OpenClosedPrinciple.ImplementingOCP;

public class PaymentProcessor {

    public void processPayment(Payment payment, int amount) {
        payment.pay(amount);
    }

}
