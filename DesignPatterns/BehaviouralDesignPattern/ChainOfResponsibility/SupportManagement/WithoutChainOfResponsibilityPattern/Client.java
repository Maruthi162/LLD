package DesignPatterns.BehaviouralDesignPattern.ChainOfResponsibility.SupportManagement.WithoutChainOfResponsibilityPattern;

public class Client {
    public static void main(String[] args) {
        SupportTicketHandler handler = new SupportTicketHandler();
        handler.handleTicket("low");

        handler.handleTicket("high");
    }
}
