package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibility.SupportManagement.WithChainOfResponsibilityPattern;

public abstract class SupportHandler {
    protected SupportHandler nextHandler; // Next handler in the chain

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler; // Set the next handler in the chain
    }
    public abstract void handlerequest(String priority);
}
