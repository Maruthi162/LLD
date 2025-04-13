package DesignPatterns.StructuralDesignPatterns.CompositePattern.WithoutCompositePattern;

import java.util.ArrayList;
import java.util.List;

public class FileSystem {
    private String name;
    private double size; // in KB

    private List<File> files; // List of files in the file system
    private List<Folder> folders; // List of folders in the file system
    
    public FileSystem(String name, double size, List<File> files) {
        this.name = name;
        this.size = size;
        this.files = files;
        this.folders = new ArrayList<>(); //initialize the folders list
    }

    // Method to show the details of the file system, its files, and folders
    public String showDetails() {
        //file system details
        StringBuilder details = new StringBuilder("File System Name: " + name + "\n" +
                "File System Size: " + size + " KB\n" +
                "Files in the file system:\n");
        //loop through the files and show their details
        for (File file : files) {
            details.append(file.showDetails()).append("\n");
        }
        //loop through the folders and show their details
        for (Folder folder : folders) {
            details.append(folder.showDetails()).append("\n");
        }
        //return the details of the file system, its files, and folders
        return details.toString();
    }

    public void addItem(Object item ) {
        if(item instanceof File) {
            files.add((File)item); //add the file to the file system
        } 
        else if(item instanceof Folder) {
            folders.add((Folder)item); //add the folder to the file system
        }
        else {
            System.out.println("Invalid file type. Only files are allowed.");
        }
    }
    //above method is voilating the open closed principle. If we want to add a new type of file or folder, we have to modify the existing code.

}

//This aproach would solve the problem. but it is voilating the open-closed principle.
// The file system is not open for extension. If we want to add a new type of file or folder, we have to modify the existing code.
//and also this class is having 2 responsibilities. It is responsible for showing the details of the file system and also responsible for showing the details of the files and folders in the file system.
// This is voilating the single responsibility principle.
//and here we can't have folder inside a folder. This is not a good design.
// This is not a good design. We need to use the composite pattern to solve this problem.
