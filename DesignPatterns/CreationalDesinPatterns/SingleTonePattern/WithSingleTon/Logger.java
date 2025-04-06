package DesignPatterns.CreationalDesinPatterns.SingleTonePattern.WithSingleTon;

public class Logger {

     // Step1: Create a private static instance of the class
     private static Logger instance; //global variable to store the instance of the class

     // Step 2: Make the constructor private to prevent instantiation
     private Logger() {
       // Constructor
   }
     
     // Step 3: Provide a public static method to get the instance
     public static Logger getInstance(){
       if(instance == null) {   //check if there is no instance is created
           instance = new Logger(); //if not instance is created then create a new instance
       }
     return instance; //if there is already an instance then return the instance
   }
 
     public void log(String message) {
       System.out.println("Log message: " + message);
   }
}
