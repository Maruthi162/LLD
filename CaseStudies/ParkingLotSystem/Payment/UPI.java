package CaseStudies.ParkingLotSystem.Payment;

import CaseStudies.ParkingLotSystem.Enums.PaymentStatus;

public class UPI extends PaymentStrategy {
    private String upiId;
    private String upiPin;

    public UPI(String upiId, String upiPin) {
        this.upiId = upiId;
        this.upiPin = upiPin;
    }

    @Override
    public void payment(double amount) {
        // Implement UPI payment logic here
        System.out.println("Processing UPI payment of " + amount + " using UPI ID: " + upiId);
        // Set payment status to completed after processing
        setPaymentStatus(PaymentStatus.COMPLETED);
        System.out.println("UPI payment completed successfully.");
        

    }

    // Getters and Setters for UPI ID and UPI PIN
    public String getUpiId() {
        return upiId;
    }

    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    public String getUpiPin() {
        return upiPin;
    }

    public void setUpiPin(String upiPin) {
        this.upiPin = upiPin;
    }
    
}
