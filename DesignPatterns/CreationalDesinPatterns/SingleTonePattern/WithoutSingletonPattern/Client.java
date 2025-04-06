package DesignPatterns.CreationalDesinPatterns.SingleTonePattern.WithoutSingletonPattern;

public class Client {
    public static void main(String[] args) {
            
        Logger logger1 = new Logger();
        logger1.log("This is the first log message");
    
        Logger logger2 = new Logger();
        logger2.log("This is the second log message");
    
        if(logger1 == logger2) {
          System.out.println("logger1 and logger2 are the same instance");
      } else {
          System.out.println("Logger1 and Logger2 are different instances");
      }
    }
}

//Here we are creating multiple instances of the Logger class. 
//creating multiple instances can lead memory wastage and name conflicts and also it is not thread safe.
//In order to avoid these issues, we can use the Singleton Pattern.
//The Singleton Pattern ensures that a class has only one instance and provides a global point of access to that instance.
