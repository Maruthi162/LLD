package DesignPatterns.CreationalDesinPatterns.SingleTonePattern.WithSingleTon;

public class Client {
    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance(); //will create a new instance
        logger1.log("This is the first log message");
  
        Logger logger2 = Logger.getInstance();     //will return the same instance as logger1
        logger2.log("This is the second log message");
  
        if(logger1 == logger2) {
            System.out.println("Logger1 and Logger2 are the same instance"); //will print this message
        } else {
            System.out.println("Logger1 and Logger2 are different instances");
        }
    }
}
