package DesignPatterns.BehaviouralDesignPattern.StrategyPattern.DocumentSavingSystem.WithoutStrategyPattern;

public class Client {
    public static void main(String[] args) {
        Document document = new Document( "This is the content of my document.");
        document.save("text"); // Save as text
        document.save("pdf"); // Save as PDF
    }
}

