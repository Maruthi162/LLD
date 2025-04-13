package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithBridgePattern;

public class Radio implements Device {
    private boolean isOn;
    private int volume;

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Radio is turned ON.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Radio is turned OFF.");
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume is set to " + volume + ".");
    }

    @Override
    public void mute() {
        System.out.println("Radio is muted.");
    }
    public void changeChannel(int channel) {
        System.out.println("Radio channel is changed to " + channel + ".");
    }
    public boolean isOn() {
        return isOn;
    }
    public int getVolume() {
        return volume;
    }
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    
}

//this is the implementation of the Radio device. It implements the Device interface and provides the functionality 
//for turning on, turning off, setting volume, muting, and changing channels. The changeChannel method is specific to the Radio device and allows changing the radio channel. The other methods are inherited from the Device interface and provide basic functionality for the Radio device.
