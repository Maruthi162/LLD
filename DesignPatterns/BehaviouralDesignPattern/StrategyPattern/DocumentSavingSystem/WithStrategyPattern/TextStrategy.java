package DesignPatterns.BehaviouralDesignPattern.StrategyPattern.DocumentSavingSystem.WithStrategyPattern;

public class TextStrategy implements SaveStrategy{
    @Override
    public void save(String content, String fileName) {
        System.out.println("Saving document as text: " + fileName + ".txt");
        // Logic to save the document as a text file
        //System.out.println("Content: " + content);
    }
} 
