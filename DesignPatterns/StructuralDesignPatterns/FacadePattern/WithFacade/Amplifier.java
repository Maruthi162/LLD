package DesignPatterns.StructuralDesignPatterns.FacadePattern.WithFacade;

public class Amplifier {
    private String name;
    private int volumeLevel;
    private boolean isOn;

    public Amplifier(String name) {
        this.name = name;
        this.volumeLevel = 0;
        this.isOn = false;
    }
    public void on() {
        isOn = true;
        System.out.println(name + " is ON");
    }
    public void off() {
        isOn = false;
        System.out.println(name + " is OFF");
    }
    public void setVolume(int volume) {
        if (isOn) {
            volumeLevel = volume;
            System.out.println(name + " volume set to " + volumeLevel);
        } else {
            System.out.println(name + " is OFF. Cannot set volume.");
        }
    }
}
