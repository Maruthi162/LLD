package DesignPatterns.StructuralDesignPatterns.CompositePattern.WithCompositePattern;

import java.util.*;
public class Folder implements Component {
    private String folderName; //name of the folder
    private String folderPath; //path of the folder

    private List<Component> components; // List of components (files and folders) in the folder
    // Constructor to initialize the folder name, path, and components  

    public Folder(String folderName, String folderPath) {
        this.folderName = folderName;
        this.folderPath = folderPath;
        this.components = new ArrayList<>(); //initialize the components list
    }

    @Override
    public void showDetails() {
        //show the details of the folder and its components
        System.out.println("Folder Name: " + folderName);
        System.out.println("Folder Path: " + folderPath);
        System.out.println("Components in the folder:");
        this.showComponents(); //show the components of the folder
    }

    // Method to add a component (file or folder) to the folder
    public void addComponent(Component component) {
        components.add(component); //add the component to the folder
    }
    // Method to remove a component (file or folder) from the folder
    public void removeComponent(Component component) {
        components.remove(component); //remove the component from the folder
    }
    // Method to show the details of the folder and its components
    public void showComponents() {
        
        for (Component component : components) {
            component.showDetails(); //show the details of the component
        }
    }
    // Method to get the total size of the folder and its components
    public double getTotalSize() {
        double totalSize = 0; //initialize the total size to 0
        for (Component component : components) {
            if (component instanceof File) {
                totalSize += ((File) component).getFileSize(); //add the size of the file to the total size
            } else if (component instanceof Folder) {
                totalSize += ((Folder) component).getTotalSize(); //add the size of the folder to the total size
            }
        }
        return totalSize; //return the total size of the folder and its components
    }
    
}
