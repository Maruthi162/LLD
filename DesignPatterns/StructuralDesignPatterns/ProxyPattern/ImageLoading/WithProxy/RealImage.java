package DesignPatterns.StructuralDesignPatterns.ProxyPattern.ImageLoading.WithProxy;

public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadImageFromDisk();  //this is the time consuming operation. It will load image every time the object is created. even if the image is not displayed.
    }

    public void loadImageFromDisk() {
        System.out.println("Loading " + fileName);
        try{
            Thread.sleep(2000); //simulating the time consuming operation of loading image from disk.
        }catch(InterruptedException e){
            System.out.println("Error loading image from disk: " + e.getMessage());
        }
    }
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    //getters & Setters
    public String getFileName() {
        return fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
