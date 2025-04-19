package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibility.SupportManagement.WithChainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        SupportHandler agent = new SupportAgent();
        SupportHandler manager = new SupportManager();
        SupportHandler director = new SupportDirector();

        // Set up the chain of responsibility
        agent.setNextHandler(manager);
        manager.setNextHandler(director);

        // Test the chain with different priorities
        agent.handlerequest("low"); // Should be handled by SupportAgent
        agent.handlerequest("medium"); // Should be handled by SupportManager
        agent.handlerequest("high"); // Should be handled by SupportDirector
    }
}
