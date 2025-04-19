package DesignPatterns.BehaviouralDesignPattern.StrategyPattern.DocumentSavingSystem.WithStrategyPattern;

public class PdfStrategy implements SaveStrategy{
    @Override
    public void save(String content, String fileName) {
        System.out.println("Saving document as PDF: " + fileName + ".pdf");
        // Logic to save the document as a PDF file
        //System.out.println("Content: " + content);
    }
    
}
