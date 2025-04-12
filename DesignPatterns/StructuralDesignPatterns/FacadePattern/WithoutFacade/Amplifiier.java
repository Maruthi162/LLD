package DesignPatterns.StructuralDesignPatterns.FacadePattern.WithoutFacade;

public class Amplifiier {
    private String name;
    private int volumeLevel;
    private boolean isOn;

    public Amplifiier(String name) {
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
