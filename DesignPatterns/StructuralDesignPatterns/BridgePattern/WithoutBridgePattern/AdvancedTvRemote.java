package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithoutBridgePattern;

public class AdvancedTvRemote {
    public void turnOn() {
        System.out.println("TV is turned ON with Advanced Tv Remote.");
    }
    public void turnOff() {
        System.out.println("TV is turned OFF with Advanced Tv Remote.");
    }
    public void setChannel(int channel) {
        System.out.println("TV channel is set to " + channel + " with Advanced Tv Remote.");
    }
    public void setVolume(int volume) {
        System.out.println("TV volume is set to " + volume + " with Advanced Tv Remote.");
    }
    public void mute() {
        System.out.println("TV is muted with Advanced Tv Remote.");
    }
}

//this is the combination of the AdvancedTvRemote and the TV classes
//this is the concrete implementation class

