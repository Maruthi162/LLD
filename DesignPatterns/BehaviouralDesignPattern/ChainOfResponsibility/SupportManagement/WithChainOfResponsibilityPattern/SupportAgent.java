package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibility.SupportManagement.WithChainOfResponsibilityPattern;

public class SupportAgent extends SupportHandler {
    @Override
    public void handlerequest(String priority) {
        if (priority.equals("low")) {
            System.out.println("Support Agent is handling the low priority ticket.");
        } else if (nextHandler != null) {
            nextHandler.handlerequest(priority); // Pass the request to the next handler in the chain
        } else {
            System.out.println("No handler available for this request.");
        }
    }
}
