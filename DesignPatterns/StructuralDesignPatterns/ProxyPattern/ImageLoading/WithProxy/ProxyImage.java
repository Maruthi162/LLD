package DesignPatterns.StructuralDesignPatterns.ProxyPattern.ImageLoading.WithProxy;

public class ProxyImage implements Image{
    private String fileName;

    private RealImage realImage;
    //Constructor
    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    //method to display image. This method will be called to display the image.
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName); //Here object will be created only when we wamt to display image.
        }
        realImage.display(); //this will display the image.
    }

    //getter and setters
    public String getfileName(){
        return fileName;
    }
    public void setFileName(String fname){
        this.fileName = fname;
    }
} 