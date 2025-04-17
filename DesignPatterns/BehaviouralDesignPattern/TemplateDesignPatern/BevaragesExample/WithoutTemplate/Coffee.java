package DesignPatterns.BehaviouralDesignPattern.TemplateDesignPatern.BevaragesExample.WithoutTemplate;

public class Coffee extends Bevarages {
    @Override
    public void prepareRecipe() {
        brewCoffeeGrinds();  
        addCondiments();
    }

    private void brewCoffeeGrinds() {
        System.out.println("Brewing the coffee grinds");
    }

    private void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
    
}
