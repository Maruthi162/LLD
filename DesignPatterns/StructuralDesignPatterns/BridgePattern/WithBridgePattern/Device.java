package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithBridgePattern;

public interface Device {
    public void turnOn();
    public void turnOff();
    public void setVolume(int volume);
    public void mute();
}

//this is the interface for the device. It defines the methods that any device should implement.
