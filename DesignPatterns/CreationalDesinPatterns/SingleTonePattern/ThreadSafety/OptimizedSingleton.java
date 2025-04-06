package DesignPatterns.CreationalDesinPatterns.SingleTonePattern.ThreadSafety;

public class OptimizedSingleton {
    //global volatile variable. volatile variables are immediately visible to other threads.
    //It is used to communicate between threads. It will prevent multiple threads to create multiple instances of the class.
    private static volatile OptimizedSingleton obj = null;

    //private constructor to prevent instantiation
    private OptimizedSingleton() {
    }

    //synchronized method to get the instance of the class
    public static OptimizedSingleton getInstance(){
        if(obj == null){ //The first if (obj == null) check is performed without locking.
            synchronized (OptimizedSingleton.class){ //synchronized block is used to make the method thread safe. It will help to communicate between threads and prevent multiple threads to create multiple instances of the class.
                if(obj == null){        //The second if (obj == null) check is performed inside the synchronized block to ensure that only one thread creates the singleton instance.
                    obj = new OptimizedSingleton();
                }
            }
        }
        return obj;
    }
}

//The above code is an optimized version of the Singleton class.
//In this code, we have used the double-checked locking mechanism to make the getInstance() method thread-safe.
