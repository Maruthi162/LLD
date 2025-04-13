package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithBridgePattern;

public class AdvacedRemote extends RemoteControl {
    public AdvacedRemote(Device device) {
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

    public void changeChannel(int channel) {
        if (device instanceof Radio) {
            ((Radio) device).changeChannel(channel); // Call the changeChannel method of the Radio device
        } else {
            System.out.println("This remote control does not support changing channels for this device.");
        }
    }

    public void enableVoiceControl(){
        System.err.println("Voice control enabled.");
    }
    
}

//this is the advanced remote control. It extends the RemoteControl class and implements the powerOn, powerOff, setVolume, mute, and changeChannel methods.
// It uses the device object to call the corresponding methods of the device. The constructor takes a Device object as a parameter and passes it to the parent class constructor.
// This allows the AdvacedRemote class to use the methods of the Device interface without knowing the specific implementation of the device.
