package DesignPatterns.StructuralDesignPatterns.CompositePattern.WithoutCompositePattern;

import java.util.List;

public class Folder {
    private String folderName;
    private String folderPath;
    private double folderSize;
    private List<File> files; // List of files in the folder

    public Folder(String folderName, String folderPath, double folderSize, List<File> files) {
        this.folderName = folderName;
        this.folderPath = folderPath;
        this.folderSize = folderSize;
        this.files = files;
    }
    // Method to show the details of the folder and its files
    public String showDetails() {
        //folder details
        StringBuilder details = new StringBuilder("Folder Name: " + folderName + "\n" +
                "Folder Path: " + folderPath + "\n" +
                "Folder Size: " + folderSize + " KB\n" +
                "Files in the folder:\n");
        //loop through the files and show their details
        for (File file : files) {
            details.append(file.showDetails()).append("\n");
        }
        //return the details of the folder and its files
        return details.toString();
    }

    public void addFile(File file) {
        files.add(file); //add the file to the folder
    }
}
