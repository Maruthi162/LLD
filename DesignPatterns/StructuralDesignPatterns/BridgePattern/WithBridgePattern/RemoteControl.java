package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithBridgePattern;

public abstract class RemoteControl {
    protected Device device; // Composition - has-a relationship

    public RemoteControl(Device device) {
        this.device = device;
    }
    public abstract void powerOn(); // Abstract method to turn on the device
    public abstract void powerOff(); // Abstract method to turn off the device
    public abstract void setVolume(int volume); // Abstract method to set the volume of the device
    public abstract void mute(); // Abstract method to mute the device

    // Additional methods can be added here for more functionality
}

//this is the abstract class it acts as a bridge between the device and the remote control. 
//It has a reference to the device and defines the methods that any remote control should implement.
//this class is used to create different types of remote controls (e.g., BasicRemote, AdvancedRemote) that can control the device.
//this will decouple the remote control from the device, allowing for different implementations of remote controls and devices without affecting each other.
