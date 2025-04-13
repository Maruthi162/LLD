package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithBridgePattern;

public class BasicRemote extends RemoteControl {
    public BasicRemote(Device device) {
        super(device); // Call the constructor of the parent class (RemoteControl)
    }

    @Override
    public void powerOn() {
        device.turnOn(); // Call the turnOn method of the device
    }

    public void powerOff() {
        device.turnOff(); // Call the turnOff method of the device
    }

    public void setVolume(int volume) {
        device.setVolume(volume); // Call the setVolume method of the device
    }
    public void mute() {
        device.mute(); // Call the mute method of the device
    } 
}

//this is the basic remote control. It extends the RemoteControl class and implements the powerOn, powerOff, setVolume, and mute methods. 
//It uses the device object to call the corresponding methods of the device. The constructor takes a Device object as a parameter and passes it to the parent class constructor. 
//This allows the BasicRemote class to use the methods of the Device interface without knowing the specific implementation of the device. 
//The BasicRemote class is a concrete implementation of the RemoteControl class, which is an abstract class that defines the basic functionality of a remote control.
