package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibility.SupportManagement.WithChainOfResponsibilityPattern;

public abstract class SupportHandler {
    protected SupportHandler nextHandler; // Next handler in the chain

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler; // Set the next handler in the chain
    }
    public abstract void handlerequest(String priority);
}

//this is the abstract class for the chain of responsibility pattern. 
//It contains a reference to the next handler in the chain and an abstract method to handle requests.
// The concrete handlers (SupportAgent, SupportManager, SupportDirector) will implement the handlerequest method
// to handle requests based on their priority. The setNextHandler method is used to set up the chain of responsibility by linking handlers together.
