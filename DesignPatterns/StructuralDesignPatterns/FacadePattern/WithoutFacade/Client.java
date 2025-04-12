package DesignPatterns.StructuralDesignPatterns.FacadePattern.WithoutFacade;

public class Client {
    public static void main(String[] args) {
        // Create the components
        Amplifiier amplifier = new Amplifiier("Amplifier");
        Projector projector = new Projector("Projector");
        DVDPlayer dvdPlayer = new DVDPlayer("DVD Player", 5);

        // Use the components directly
        amplifier.on();
        amplifier.setVolume(10);
        projector.on();
        projector.project();
        dvdPlayer.on();
        dvdPlayer.play(1);

        // Turn off the components
        dvdPlayer.off();
        projector.off();
        amplifier.off();
    }
}

//here the client is responsible for managing the components and their interactions.
//this can lead to a complex and tightly coupled codebase, making it difficult to maintain and extend
//and user should be aware of the internal workings of each component and how they interact with each other
//and this is not a good practice in software design as it violates the principle of separation of concerns
//to make the code more maintainable and easier to use, we can use the Facade pattern
//which provides a simplified interface to a complex subsystem, allowing the client to interact with the subsystem without needing to understand its internal workings
