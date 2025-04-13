package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithoutBridgePattern;

public class BasicRadioRemote {
    public void turnOn() {
        System.out.println("Radio is turned ON with Basic Radio Remote.");
    }
    public void turnOff() {
        System.out.println("Radio is turned OFF with Basic Radio Remote.");
    }
    public void setVolume(int volume) {
        System.out.println("Radio volume is set to " + volume + " with Basic Radio Remote.");
    }
}
