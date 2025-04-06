package SOLID.DependencyInversionPrinciple.VoilationOfDIP;

public class Manager {
    private Worker worker;
    public Manager(){
        this.worker= new Worker(); //DIRECT DEPENDENCY
    }

    public void manage(){
        worker.performTask();
    }
}

/* Here, Manager is tightly coupled with Worker. If the implementation of Worker changes, 
    Manager might require modifications as well, 
    violating the Dependency Inversion Principle. */
