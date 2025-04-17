package DesignPatterns.BehaviouralDesignPattern.TemplateDesignPatern.BevaragesExample.WithoutTemplate;

public class Tea extends Bevarages {
    @Override
    public void prepareRecipe() {
        steepTeaBag();  
        addCondiments();
    }

    private void steepTeaBag() {
        System.out.println("Steeping the tea");
    }

    private void addCondiments() {
        System.out.println("Adding Lemon");
    }
    
}
