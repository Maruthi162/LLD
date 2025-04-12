package DesignPatterns.StructuralDesignPatterns.FacadePattern.WithFacade;

public class Projector {
    private String name;
    private boolean isOn;
    
    public Projector(String name) {
        this.name = name;
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
    public void project() {
        if (isOn) {
            System.out.println(name + " is projecting");
        } else {
            System.out.println(name + " is OFF. Cannot project.");
        }
    }
}
