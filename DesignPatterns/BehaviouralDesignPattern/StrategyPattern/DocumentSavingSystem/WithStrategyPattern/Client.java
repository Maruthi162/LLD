package DesignPatterns.BehaviouralDesignPattern.StrategyPattern.DocumentSavingSystem.WithStrategyPattern;

public class Client {
    public static void main(String[] args) {
        Document document = new Document("This is the content of my document.");
        
        // Set the strategy to save as text and save the document
        document.setSaveStrategy(new TextStrategy());
        document.save("myDocument"); // Save as text
        
        // Set the strategy to save as PDF and save the document
        document.setSaveStrategy(new PdfStrategy());
        document.save("myDocument"); // Save as PDF
    }
}
