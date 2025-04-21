package CaseStudies.ParkingLotSystem.Payment;

import CaseStudies.ParkingLotSystem.Enums.PaymentStatus;
import CaseStudies.ParkingLotSystem.Enums.PaymentType;

public abstract class PaymentStrategy {
    private PaymentType paymentType;
    private double amount;
    private PaymentStatus paymentStatus;
    
    public abstract void payment(double amount);

    //Getters and Setters for PaymentType, Amount, and PaymentStatus
    public PaymentType getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(PaymentType paymentType) {
        this.paymentType = paymentType;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }
    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}
