package DesignPatterns.CreationalDesinPatterns.FactoryPattern.AbstractFactoryPattern;

// Concrete Product: BikeEngine
// This class implements the Engine interface and provides the behavior for a bike engine.
public class BikeEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Bike Engine Started");
    }

    @Override
    public void stop() {
        System.out.println("Bike Engine Stopped");
    }
}
