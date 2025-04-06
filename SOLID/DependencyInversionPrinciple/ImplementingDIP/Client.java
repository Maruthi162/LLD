package SOLID.DependencyInversionPrinciple.ImplementingDIP;

public class Client {
    public static void main(String[] args) {
        Employee worker = new Worker();
        Manager manager = new Manager(worker);

        manager.manage();
    }
}
