package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibility.SupportManagement.WithChainOfResponsibilityPattern;

public class SupportDirector extends SupportHandler {
    @Override
    public void handlerequest(String priority) {
        if (priority.equals("high")) {
            System.out.println("Support Director is handling the high priority ticket.");
        } else if (nextHandler != null) {
            nextHandler.handlerequest(priority); // Pass the request to the next handler in the chain
        } else {
            System.out.println("No handler available for this request.");
        }
    } 
}
// This class represents a concrete handler in the chain of responsibility pattern.
//and it is a third concrete handler in the chain of responsibility pattern.
// It handles high priority requests and passes the request to the next handler if it cannot handle it.
