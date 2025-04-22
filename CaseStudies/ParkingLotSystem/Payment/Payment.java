package CaseStudies.ParkingLotSystem.Payment;

import java.time.LocalDateTime;

public class Payment {
    private String paymentId;
    private String ticketId; // Reference to the associated ticket
    private double amount; // Amount to be paid
    private boolean isPaid; // Payment status
    private LocalDateTime paymentDate; // Date of payment
    private PaymentStrategy paymentStrategy; // Payment strategy to be used


    //set payment strategy
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public Payment(String paymentId, String ticketId, double amount) {
        this.paymentId = paymentId;
        this.ticketId = ticketId;
        this.amount = amount;
        this.isPaid = false; // Default to unpaid
     //this.paymentDate = LocalDate.now(); // Set the payment date to today
    }
    public void processPayment() {
        if (paymentStrategy != null) {
            paymentStrategy.payment(amount); // Process payment using the selected strategy
            this.isPaid = true; // Mark as paid after processing
            System.out.println("Payment of " + amount + " processed successfully using " + paymentStrategy.getPaymentType() + ".");
            paymentDate = LocalDateTime.now(); // Update payment date to today
        } else {
            System.out.println("Payment strategy not set. Cannot process payment.");
        }
    }

    // Getters and Setters
    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public String getTicketId() {
        return ticketId;
    }
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public boolean isPaid() {
        return isPaid;
    }
    public void setPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }
    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }
    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }
    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }


}
