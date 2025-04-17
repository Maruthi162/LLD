package DesignPatterns.BehaviouralDesignPattern.ObserverDesignPattern.WeatherForecastSystem;

import java.util.*;

public abstract class Subject {
    private List<Observer> observers = new ArrayList<>(); // List to hold observers

    public void subscribe(Observer observer){
        observers.add(observer); // Add observer to the list
    }

    public void unSubscribe(Observer observer){
        observers.remove(observer); // Remove observer from the list
    }
    public void notifySubscribers(){
        for(Observer observer: observers){
            observer.update(); // Notify each observer
        }
    }
}

// The Subject class maintains a list of observers and provides methods to subscribe, unsubscribe, and notify them.
