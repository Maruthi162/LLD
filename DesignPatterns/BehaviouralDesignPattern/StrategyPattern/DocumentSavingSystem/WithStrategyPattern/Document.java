package DesignPatterns.BehaviouralDesignPattern.StrategyPattern.DocumentSavingSystem.WithStrategyPattern;

public class Document {
    private String content; // Content of the document
    private SaveStrategy saveStrategy; // Strategy for saving the document

    public Document(String content) {
        this.content = content;
    }

    public void setSaveStrategy(SaveStrategy saveStrategy) {
        this.saveStrategy = saveStrategy;
    }

    public void save(String fileName) {
        if (saveStrategy != null) {
            saveStrategy.save(content, fileName); // Use the strategy to save the document
        } else {
            System.out.println("No save strategy set. Cannot save the document.");
        }
    }
}
