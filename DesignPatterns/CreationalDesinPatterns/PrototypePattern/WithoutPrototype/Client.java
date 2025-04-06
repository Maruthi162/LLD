package DesignPatterns.CreationalDesinPatterns.PrototypePattern.WithoutPrototype;

public class Client {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla", "White", 1000000);
        Car car2 = new Car("Toyota", "Corolla", "White", 1000000);
        
        //Car car3 = new Car("Toyota", "Corolla", "White", 1000000);

        if(car1 == car2 ) {
            System.out.println("car1 and car2 are the same instance");
        } else {
            System.out.println("car1 and car2 are different instances");
        }

    }
}

//Here we are creating multiple instances of the Car class.
//creating multiple instances can lead memory wastage and name conflicts and also it is not thread safe.
//In order to avoid these issues, we can use the Prototype Pattern.
//The Prototype Pattern ensures that a class has only one instance and provides a global point of access to that instance.

//we can store the prototype object in a map and clone the object whenever we need it.
