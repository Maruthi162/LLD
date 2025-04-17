package DesignPatterns.StructuralDesignPatterns.ProxyPattern.ImageLoading.WithProxy;

public class Client {
    public static void main(String[] args) {
        ProxyImage img1 = new ProxyImage("Profile");
        img1.display();

        ProxyImage img2 = new ProxyImage("IdCard");
        img2.getfileName();

        ProxyImage img3 = new ProxyImage("PAN");
        img3.getfileName();
    }

}

//here even we have created objects for img2 , img3 it won't load images. image will load only when we call display
