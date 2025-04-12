class Amplifier {
        
    public void on() {
        System.out.println("Amplifier is on.");
    }
    
	public void setVolume(int level) {
    }
}

class DVDPlayer {
	
  	public void on() {
    	System.out.println("DVD Player is on.");
    }
  
  	public void play(String movie) {
    	System.out.println("Playing movie: " + movie);
    }
}

class Projector {
	
  	public void on() {
    	System.out.println("Projector is on.");
    }
  
  	public void wideScreenMode() {
    	System.out.println("Projector is in widescreen mode.");
    }
}

class HomeTheatreFacade {
	private Amplifier amp;
  	private DVDPlayer dvd;
  	private Projector projector;

  	public HomeTheatreFacade(Amplifier amp, DVDPlayer dvd, Projector projector) {
    	this.amp = amp;
      	this.dvd = dvd;
      	this.projector = projector;
    }
  
  	public void watchMovie(String movie) {
    	System.out.println("Get ready to watch a movie...");
      	amp.on();
      	amp.setVolume(5);
      	dvd.on();
      	dvd.play(movie);
      	projector.on();
      	projector.wideScreenMode();
    }
}

public class Main {
	
  	public static void main(String[] args) {
    	
      	Amplifier amp = new Amplifier();
      	DVDPlayer dvd = new DVDPlayer();
      	Projector projector = new Projector();
      	HomeTheatreFacade homeTheater = new HomeTheatreFacade(amp, dvd, projector);
      
      	homeTheater.watchMovie("Inception");
    } 
}