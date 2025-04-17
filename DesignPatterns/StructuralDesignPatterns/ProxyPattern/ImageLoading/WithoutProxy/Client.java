package DesignPatterns.StructuralDesignPatterns.ProxyPattern.ImageLoading.WithoutProxy;

public class Client {
    public static void main(String[] args) {
        //Create RealImage objects
        RealImage image1 = new RealImage("image1.jpg"); //creating a RealImage object with file name image1.jpg
        image1.display(); //displaying the image. This will load the image from disk and display it.

        RealImage image2 = new RealImage("image2.jpg"); //creating a RealImage object with file name image2.jpg
        image2.display(); //displaying the image. This will load the image from disk and display it.

        RealImage image3 = new RealImage("image3.jpg"); //creating a RealImage object with file name image1.jpg
        System.out.println(image3.getFileName());
        RealImage image4 = new RealImage("image4.jpg"); //creating a RealImage object with file name image1.jpg 
        System.out.println(image4.getFileName());
    }
}

//here whenever we create a new RealImage object, it will load the image from disk and display it.
//This is a time consuming operation. So, if we create multiple RealImage objects with the same file name, it will load the image from disk every time.
//if you observe when image3 and image4 created it will load the image from disk but here we are not displaying the image.hence no need to load the image from disk.
//So, we can use Proxy Pattern to avoid loading the image from disk every time we create a new RealImage object with the same file name.
