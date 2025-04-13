package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithoutBridgePattern;

public class BasicTvRemote {
    public void turnOn() {
        System.out.println("TV is turned ON with Basic Tv Remote.");
    }
    public void turnOff() {
        System.out.println("TV is turned OFF with Basic Tv Remote.");
    }
}

//this is the combination of the BasicTvRemote and the TV classes
//this is the concrete implementation class
