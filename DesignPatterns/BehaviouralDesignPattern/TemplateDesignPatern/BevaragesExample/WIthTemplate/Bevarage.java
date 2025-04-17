package DesignPatterns.BehaviouralDesignPattern.TemplateDesignPatern.BevaragesExample.WIthTemplate;

public abstract class Bevarage {
    // Template method
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    protected abstract void brew(); // Abstract method to be implemented by subclasses

    protected abstract void addCondiments(); // Abstract method to be implemented by subclasses

    private void boilWater() {                      // Boiling water is a common step
        System.out.println("Boiling Water");
    }

    private void pourInCup() {                      // Pouring into cup is a common step
        System.out.println("Pouring into cup");
    }
}
