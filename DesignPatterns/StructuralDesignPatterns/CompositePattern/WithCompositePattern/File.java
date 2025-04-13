package DesignPatterns.StructuralDesignPatterns.CompositePattern.WithCompositePattern;

public class File implements Component {
    private String fileName; //name of the file
    private String filePath; //path of the file
    private double fileSize; //size of the file
    //private String fileType; //type of the file

    public File(String fileName, String filePath, double fileSize) {
        this.fileName = fileName;
        this.filePath = filePath;
        this.fileSize = fileSize;
        //this.fileType = fileType; //initialize the file type
    }

    @Override
    public void showDetails() {
        //show the details of the file
        System.out.println("File Name: " + fileName);
        System.out.println("File Size: " + fileSize + " KB");
       // System.err.println("File Type: " + fileType); //show the file type
    }
    // Method to get the size of the file
    public double getFileSize() {
        return fileSize; //return the size of the file
    }
    //get file path
    public String getFilePath() {
        return filePath; //return the path of the file
    }
    
}
