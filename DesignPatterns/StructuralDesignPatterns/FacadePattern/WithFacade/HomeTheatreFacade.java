package DesignPatterns.StructuralDesignPatterns.FacadePattern.WithFacade;

public class HomeTheatreFacade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public HomeTheatreFacade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie(int track){
        System.out.println("Get ready to watch movie...");
        amplifier.on();
        amplifier.setVolume(5);
        projector.on();
        projector.project();
        dvdPlayer.on();
        dvdPlayer.play(track);
    }
}

//this is the facade class that simplifies the process of watching a movie by providing a single method to call.
//it takes care of turning on the amplifier, setting the volume, turning on the projector, and playing the DVD
//this way, the client code doesn't have to worry about the details of each component, making it easier to use the home theatre system.
//this is the main advantage of using the Facade pattern: it provides a simplified interface to a complex subsystem, making it easier to use and understand
