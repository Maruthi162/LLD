package DesignPatterns.CreationalDesinPatterns.SingleTonePattern.ThreadSafety;

public class Singleton {
    //gobal variable to store the instance of the class
    private static Singleton obj;

    //private constructor to prevent instantiation
    private Singleton() {
    }

    //synchronized method to get the instance of the class
    public static synchronized Singleton getInstance(){  //synchronized keyword is used to make the method thread safe. It will help to communicate between threads and prevent multiple threads to create multiple instances of the class.
        if(obj == null){                                    
            obj = new Singleton();
        }
        return obj;
    }

    /*If we use synchronized keyword in the method declaration, every time a thread calls 
    the method, it will acquire a lock on the method and no other thread can call 
    the method until the lock is released. This will make the method thread safe.

    But this approach has a performance issue. If the method is called multiple times, 
    it will acquire the lock multiple times and release it multiple times. 
    This will slow down the performance of the application.*/
    
}
