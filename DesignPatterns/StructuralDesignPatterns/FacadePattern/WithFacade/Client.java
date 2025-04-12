package DesignPatterns.StructuralDesignPatterns.FacadePattern.WithFacade;

public class Client {
    public static void main(String[] args) {
        // Create objects for Amplifier, DVDPlayer and Projector
        Amplifier amplifier = new Amplifier("Sony Amplifier");
        DVDPlayer dvdPlayer = new DVDPlayer("Samsung DVD Player", 2);
        Projector projector = new Projector("Epson Projector");

        // Create a HomeTheaterFacade object
        HomeTheatreFacade homeTheater = new HomeTheatreFacade(amplifier, dvdPlayer, projector);
        homeTheater.watchMovie(1); // Watch a movie with track 1

        // Turn off the components after watching the movie
        System.out.println("\nTurning off the components...");
        dvdPlayer.stop(); // Stop the DVD player
        dvdPlayer.off(); // Turn off the DVD player
        projector.off(); // Turn off the projector
        amplifier.off(); // Turn off the amplifier


    }
}

//this is the client code that uses the HomeTheatreFacade to watch a movie
//it creates the components and passes them to the facade, which takes care of the rest
//this way, the client code doesn't have to worry about the details of each component, making it easier to use the home theatre system
