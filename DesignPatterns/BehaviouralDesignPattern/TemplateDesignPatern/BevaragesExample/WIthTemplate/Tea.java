package DesignPatterns.BehaviouralDesignPattern.TemplateDesignPatern.BevaragesExample.WIthTemplate;

public class Tea extends Bevarage {

    /// Implementing the abstract method from Bevarage class. 
    /// following methods are specific to Tea and are not part of the template method.
    @Override
    protected void brew() { // Implementing the abstract method from Bevarage class
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() { // Implementing the abstract method from Bevarage class
        System.out.println("Adding Lemon");
    }
    
}
