package DesignPatterns.StructuralDesignPatterns.CompositePattern.WithCompositePattern;


public class FileSystem {
    public static void main(String[] args) {
         // Leaf nodes
     File resume = new File("Resume.pdf","current_Paath", 120);
     File photo = new File("Vacation.jpg","Current Path", 500);

     // Composite node
     Folder documents = new Folder("Documents", "current_path");
     documents.addComponent(resume);

     Folder pictures = new Folder("Pictures", "current_path");
     pictures.addComponent(photo);

     Folder home = new Folder("Home", "current_path");
     home.addComponent(documents);
     home.addComponent(pictures);

     // Display structure
     home.showDetails();

     // Get total size
     System.out.println("Total size: " + home.getTotalSize() + "KB");

    }
    
}

// This code demonstrates the Composite Design Pattern by creating a file system structure with files and folders. 
//The `File` class represents individual files, while the `Folder` class can contain both files and other folders. 
//The `Component` interface defines the common behavior for both files and folders, allowing them to be treated uniformly. 
//The `FileSystem` class demonstrates how to create a file system structure and calculate the total size of all components within a folder.
// The code is designed to be extensible, allowing for easy addition of new file types or folder structures without modifying existing code,
// adhering to the Open/Closed Principle.
// The `showDetails` method in both the `File` and `Folder` classes provides a way to display the details of the components, 
//while the `getTotalSize` method calculates the total size of all components within a folder. This design allows for a flexible and maintainable file system structure.
