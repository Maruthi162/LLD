package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibility.SupportManagement.WithChainOfResponsibilityPattern;

public class SupportManager extends SupportHandler{
    @Override
    public void handlerequest(String priority) {
        if (priority.equals("medium")) {
            System.out.println("Support Manager is handling the high priority ticket.");
        } else if (nextHandler != null) {
            nextHandler.handlerequest(priority); // Pass the request to the next handler in the chain
        } else {
            System.out.println("No handler available for this request.");
        }
    }
}
