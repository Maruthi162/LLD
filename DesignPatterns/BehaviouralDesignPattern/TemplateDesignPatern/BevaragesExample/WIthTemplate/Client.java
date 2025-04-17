package DesignPatterns.BehaviouralDesignPattern.TemplateDesignPatern.BevaragesExample.WIthTemplate;

public class Client {
    public static void main(String[] args) {
        Tea tea = new Tea(); // Creating an object of Tea class
        tea.prepareRecipe(); // Calling the template method to prepare the recipe

        Cofee coffee = new Cofee(); // Creating an object of Coffee class
        coffee.prepareRecipe(); // Calling the template method to prepare the recipe
    }
}

/* Key Advantages of the Template Pattern:

    Code Reusability: Common steps are centralized, reducing code duplication.
    Adherence to Open/Closed Principle: The base class remains unchanged when new formats or behaviors are added.
    Enhanced Readability: Shared and specific steps are clearly segregated.
    Customization: Subclasses can implement only the required steps, leaving the common workflow untouched.

*/