package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibility.SupportManagement.WithoutChainOfResponsibilityPattern;

public class SupportTicketHandler {
    public void handleTicket(String priority){
        if(priority.equals("low")){
            System.out.println("Support Agent Handling ticket");
        }
        else if(priority.equals("medium")){
            System.out.println("Support Manager Handling ticket");
        }
        else if(priority.equals("high")){
            System.out.println("Support Director Handling ticket");
        }
        else{
            System.out.println("Invalid priority level. Ticket cannot be handled.");
        }
    }
}

//this code do the work, but it voilates open/closed principle, because if we want to add a new priority level, we have to modify the existing code.
// This is not a good practice as it makes the code less maintainable and more error-prone.
// The Chain of Responsibility pattern allows us to decouple the sender and receiver of a request, making it easier to add new handlers without modifying existing code.
// It also promotes the Single Responsibility Principle by allowing each handler to focus on a specific type of request.
