package DesignPatterns.StructuralDesignPatterns.CompositePattern.WithoutCompositePattern;

public class File {
    private String fileName;
    private String fileType;
    private double fileSize; // in kb
    private String filePath;


    public File(String fileName, String fileType, double fileSize, String filePath) {
        this.fileName = fileName;
        this.fileType = fileType;
        this.fileSize = fileSize;
        this.filePath = filePath;
    }
    
    //Methos to show the details of the file
    public String showDetails() {
        return "File Name: " + fileName + "\n" +
                "File Type: " + fileType + "\n" +
                "File Size: " + fileSize + " KB\n" +
                "File Path: " + filePath;
    }

    //setters & Getters
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public String getFileType() {
        return fileType;
    }
    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public double getFileSize() {
        return fileSize;
    }
    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    public String getFilePath() {
        return filePath;
    }
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    

}
