package CaseStudies.ParkingLotSystem.Ticket;

import java.time.LocalDateTime;

import CaseStudies.ParkingLotSystem.Enums.PaymentStatus;
import CaseStudies.ParkingLotSystem.Enums.PaymentType;
import CaseStudies.ParkingLotSystem.Payment.CreditCard;
import CaseStudies.ParkingLotSystem.Payment.Payment;
import CaseStudies.ParkingLotSystem.Payment.UPI;
import CaseStudies.ParkingLotSystem.Vehicle.Vehicle;

public class Exit {
    private String exitId; // Unique identifier for the exit
    private Vehicle vehicle; // Reference to the ticket associated with the exit
    private boolean isOpen; // Status of the exit (open/closed)
    private Payment payment; // Reference to the payment associated with the exit

    public Exit(String exitId) {
        this.exitId = exitId;
        this.isOpen = true; // Default to open
       
    }

    public void openExit() {
        if(isOpen == true ) {
            System.out.println("Exit " + exitId + " is already open.");
            return; // Exit if the exit is already open
        }
        if(payment.isPaid()){
            setOpen(true); // Set exit status to open
            System.out.println("Exit " + exitId + " is now open.");
        }
       
    }

    public void processExit(Ticket ticket, PaymentType paymentMethod) {
        if (ticket == null) {
            System.out.println("No ticket found at exit " + exitId);
            return; // Exit if no ticket is found
        }
    
        // Set the exit date and time
        ticket.setExitDateTime(LocalDateTime.now());
    
        // Calculate the amount due based on the parking duration
        double amountDue = ticket.calculateAmountDue();
        //set Vehicle
        vehicle = ticket.getVehicle(); // Get the vehicle from the ticket
        // Create a new payment object
        payment = new Payment(ticket.getTicketId() + LocalDateTime.now().toString(), ticket.getTicketId(), amountDue);
    
        // Process the payment
        if (payBill(amountDue, paymentMethod)) {
            openExit(); // Open the exit for the vehicle to leave
            ticket.getParkingSpot().unparkVehicle(vehicle); // Mark the parking spot as available
            System.out.println("Vehicle " + vehicle.getLicensePlate() + " has exited through exit " + exitId);
        } else {
            System.out.println("Payment failed for ticket ID: " + ticket.getTicketId());
        }
    }
    public boolean payBill(double amount, PaymentType paymentMethod) {
        
        if(payment == null) {
            System.out.println("No payment found for exit " + exitId);
            return false; // Exit if no payment is found
        }
        switch(paymentMethod) {
            case UPI:
                payment.setPaymentStrategy(new UPI("UPI ID", "1234")); // Set payment strategy to cash
                break;
            case CREDIT_CARD:
                payment.setPaymentStrategy(new CreditCard("12353264234", "Maruthi N", "03/30","434")); // Set payment strategy to credit card
                break;
            default:
                System.out.println("Invalid payment method selected.");
                return false; // Exit if invalid payment method is selected
        }
        payment.processPayment(); // Process the payment

        if(payment.getPaymentStrategy().getPaymentStatus() == PaymentStatus.COMPLETED) {
            System.out.println("Payment of " + amount + " is successful for vehicle " + vehicle.getLicensePlate() + " at exit " + exitId);
            payment.setPaid(true); // Mark payment as completed
        } else {
            System.out.println("Payment failed for vehicle " + vehicle.getLicensePlate() + " at exit " + exitId);
            return false; // Exit if payment fails
        }
        vehicle.setTicket(null); // Clear the ticket reference from the vehicle
        return true; // Return true if payment is successful
        
    }
    
    // Getters and Setters
    public String getExitId() {
        return exitId;
    }
    public void setExitId(String exitId) {
        this.exitId = exitId;
    }   
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public boolean isOpen() {
        return isOpen;
    }
    public void setOpen(boolean isOpen) {
        this.isOpen = isOpen;
    }
    public Payment getPayment() {
        return payment;
    }
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    
}
