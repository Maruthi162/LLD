package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithBridgePattern;

public class TV implements Device  {
    private String brand ;
    private String model ;
    private int volume ;
    private boolean isOn ;

    public TV(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.volume = 0;
        this.isOn = false;
    }

    @Override   
    public void turnOn() {
        isOn = true;
        System.out.println(brand + " " + model + " TV is turned on.");
    }
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(brand + " " + model + " TV is turned off.");
    }
    @Override
    public void setVolume(int volume) {
        if (isOn) {
            this.volume = volume;
            System.out.println(brand + " " + model + " TV volume is set to " + volume + ".");
        } else {
            System.out.println("TV is off. Please turn it on first.");
        }
    }
    @Override
    public void mute() {
        if (isOn) {
            volume = 0;
            System.out.println(brand + " " + model + " TV is muted.");
        } else {
            System.out.println("TV is off. Please turn it on first.");
        }
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public int getVolume() {
        return volume;
    }
    public boolean isOn() {
        return isOn;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setOn(boolean isOn) {
        this.isOn = isOn;
    }
    @Override
    public String toString() {
        return "TV [brand=" + brand + ", model=" + model + ", volume=" + volume + ", isOn=" + isOn + "]";
    }
}

//concrete class which implements the Device interface
//this class represents a TV device. It implements the methods defined in the Device interface.
