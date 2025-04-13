package DesignPatterns.StructuralDesignPatterns.BridgePattern.WithBridgePattern;

public class Client {
    public static void main(String[] args) {
        //Create TV object
        TV tv = new TV("Sony", "2024-v1" );

        //Creating a basic remote for Sony Tv
        RemoteControl basicRemote = new BasicRemote(tv);

        //Using the basic remote to control the TV
        basicRemote.powerOn(); // Turn on the TV
        basicRemote.mute(); // Mute the TV
        basicRemote.setVolume(10); // Set volume to 10

        //Creating an advanced remote for Sony TV
        AdvacedRemote advancedRemote = new AdvacedRemote(tv);
        advancedRemote.powerOn(); // Turn on the TV
        advancedRemote.setVolume(20); // Set volume to 20
        advancedRemote.enableVoiceControl(); // Enable voice control

    }
}

//This is the client class that demonstrates the use of the Bridge Pattern.
//