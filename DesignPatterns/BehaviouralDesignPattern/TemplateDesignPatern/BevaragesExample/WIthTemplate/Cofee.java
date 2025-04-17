package DesignPatterns.BehaviouralDesignPattern.TemplateDesignPatern.BevaragesExample.WIthTemplate;

public class Cofee extends Bevarage {
    /// Implementing the abstract method from Bevarage class. 
    /// following methods are specific to Cofee and are not part of the template method.
    @Override
    protected void brew() { // Implementing the abstract method from Bevarage class
        System.out.println("Brewing the coffee grinds");
    }

    @Override
    protected void addCondiments() { // Implementing the abstract method from Bevarage class
        System.out.println("Adding Sugar and Milk");
    }
    
}
