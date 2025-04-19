package DesignPatterns.BehaviouralDesignPattern.StrategyPattern.DocumentSavingSystem.WithStrategyPattern;

public interface SaveStrategy {
    public void save(String content, String fileName); // Save the document with the given content and file name
    
}
