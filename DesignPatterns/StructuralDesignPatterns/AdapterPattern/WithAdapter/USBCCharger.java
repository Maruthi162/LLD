package DesignPatterns.StructuralDesignPatterns.AdapterPattern.WithAdapter;

public interface USBCCharger {
    //method to charge a device using USB-C
    public void chargeDeviceWithUSBC();
}

//this is the target interface which is used by the client
//this is the interface which the client wants to use
