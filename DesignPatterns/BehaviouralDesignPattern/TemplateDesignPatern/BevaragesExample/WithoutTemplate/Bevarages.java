package DesignPatterns.BehaviouralDesignPattern.TemplateDesignPatern.BevaragesExample.WithoutTemplate;

public class Bevarages {
    public void prepareRecipe() {
    	boilWater();

      	if(this instanceof Tea) {
        	this.prepareRecipe();
        } else if (this instanceof Coffee) {
        	this.prepareRecipe();
        } else {
        	System.out.println("Unknown Bevarage");
        }
      
      	pourInCup();
      	
    }
  
  	private void boilWater() {
    	System.out.println("Boiling Water");
    }
  
  	private void pourInCup() {
    	System.out.println("Pouring into cup");
    }
  
}
/*
 * Problems in this code that can be solved by template design pattern:

        Violation of the Open-Closed Principle: The prepareRecipe method needs to be modified whenever a new type of beverage is added (e.g., if conditions for each subclass like Tea or Coffee).
        Duplication of Logic: Methods like steepTeaBag and brewCoffeeGrinds handle beverage-specific operations but could be abstracted into the subclasses to eliminate the if-else checks.
        Poor Extensibility: Adding a new beverage type would require changes to the Beverage class, increasing the risk of breaking existing code.
        Centralized Responsibility: The prepareRecipe method handles responsibilities that could be delegated to subclasses for better cohesion and separation of concerns.
 */
