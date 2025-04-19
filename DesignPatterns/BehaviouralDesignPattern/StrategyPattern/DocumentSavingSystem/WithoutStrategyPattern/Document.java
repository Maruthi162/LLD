package DesignPatterns.BehaviouralDesignPattern.StrategyPattern.DocumentSavingSystem.WithoutStrategyPattern;

public class Document {
    private String text;

    public Document(String text) {
        this.text = text; // Initialize the document with text
    }

    public void save(String format){
        if(format.equalsIgnoreCase("text")){
            System.out.println("Saving document as text: " + text); // Save the document as text
        } else if(format.equalsIgnoreCase("pdf")){
            System.out.println("Saving document as pdf: " + text); // Save the document as PDF
        } else if(format.equalsIgnoreCase("word")){
            System.out.println("Saving document as word: " + text); // Save the document as Word
        } else {
            System.out.println("Unsupported format: " + format); // Handle unsupported formats
        }
    }
    public String getText() {
        return text; // Get the text of the document
    }
    public void setText(String text) {
        this.text = text; // Set the text of the document
    }

}
//Here we are voilating the OCP principle. If we want to add a new format, we have to modify the save method.
// This is not a good practice as it makes the code less maintainable and more error-prone.