package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithoutBridgePattern;

public class AdvancedRadioRemote {
    public void turnOn() {
        System.out.println("Radio is turned ON with Advanced Radio Remote.");
    }
    public void turnOff() {
        System.out.println("Radio is turned OFF with Advanced Radio Remote.");
    }
    public void setVolume(int volume) {
        System.out.println("Radio volume is set to " + volume + " with Advanced Radio Remote.");
    }
    public void setStation(String station) {
        System.out.println("Radio station is set to " + station + " with Advanced Radio Remote.");
    }
    public void mute() {
        System.out.println("Radio is muted with Advanced Radio Remote.");
    }
    public void unmute() {
        System.out.println("Radio is unmuted with Advanced Radio Remote.");
    }

   
}

 // this is the combination of the AdvancedRadioRemote and the Radio classes

    // when there is a new Device HomeTheaterSystem, we need to create a new remote for it
    // and implement all the methods again, which is not a good practice. 
    // this makes the code dificult to maintain and extend.
//In rder to avoid this problem, we can use the Bridge Pattern.
// The Bridge Pattern is a structural design pattern that decouples an abstraction from its implementation so that the two can vary independently.

    
