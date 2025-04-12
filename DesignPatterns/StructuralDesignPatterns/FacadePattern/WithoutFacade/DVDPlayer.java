package DesignPatterns.StructuralDesignPatterns.FacadePattern.WithoutFacade;

public class DVDPlayer {
    private String name;
    private boolean isOn;
    private int currentTrack;
    private int totalTracks;


    public DVDPlayer(String name, int totalTracks) {
        this.name = name;
        this.totalTracks = totalTracks;
        this.isOn = false;
        this.currentTrack = 0;
    }
    public void on() {
        isOn = true;
        System.out.println(name + " is ON");
    }
    public void off() {
        isOn = false;
        System.out.println(name + " is OFF");
    }
    //method to play a specific track
    //this method takes the track number as an argument and plays that track if the DVD player is on
    public void play(int track) {
        if (isOn) {
            if (track > 0 && track <= totalTracks) {
                currentTrack = track;
                System.out.println(name + " is playing track " + currentTrack);
            } else {
                System.out.println("Invalid track number. Please select a track between 1 and " + totalTracks);
            }
        } else {
            System.out.println(name + " is OFF. Cannot play track.");
        }
    }
    public void stop() {
        if (isOn) {
            System.out.println(name + " has stopped playing track " + currentTrack);
            currentTrack = 0;
        } else {
            System.out.println(name + " is OFF. Cannot stop track.");
        }
    }
}
