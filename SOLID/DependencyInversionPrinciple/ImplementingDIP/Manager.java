package SOLID.DependencyInversionPrinciple.ImplementingDIP;

public class Manager {
    private Employee employee;

    public Manager(Employee employee ){
            this.employee = employee;  //Dependency Injection
    }

    public void manage(){
        employee.performTask();
    }
}
