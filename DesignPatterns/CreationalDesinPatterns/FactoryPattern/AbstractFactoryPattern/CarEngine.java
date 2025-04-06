package DesignPatterns.CreationalDesinPatterns.FactoryPattern.AbstractFactoryPattern;

// Concrete Product: CarEngine
// This class implements the Engine interface and provides the behavior for a car engine.
public class CarEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Starting the Car Engine");
    }

    @Override
    public void stop() {
        System.out.println("Stopping the Car Engine");
    }
}
