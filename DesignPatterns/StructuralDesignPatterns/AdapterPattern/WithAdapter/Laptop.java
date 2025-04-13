package DesignPatterns.StructuralDesignPatterns.AdapterPattern.WithAdapter;
//client code
public class Laptop {
    private USBCCharger USBCcharger; //this is the target interface which is used by the client

    public Laptop(USBCCharger USBCcharger) {
        this.USBCcharger = USBCcharger;
    }

    public void charge(){
        //this method calls the target interface method to charge the device with USB-C
        System.out.println("Charging laptop with USB-C charger.");
        USBCcharger.chargeDeviceWithUSBC();  //this method calls the target interface method to charge the device with USB-C. internally it calls the adaptee method to charge the device with round pin
        //this method calls the adaptee method to charge the device with round pin

    }   

    public static void main(String[] args) {
        //Creating Adaptee Object
        RoundPinCharger roundPinCharger = new RoundPinCharger(); //this is the adaptee class which is used by the adapter
        ChargerAdapter adapter = new ChargerAdapter(roundPinCharger); //this is the adapter class which implements the target interface
        Laptop macBook = new Laptop(adapter); //this is the client class which uses the target interface
        macBook.charge(); //this method calls the target interface method to charge the device with USB-C. internally it calls the adaptee method to charge the device with round pin
        //this method calls the adaptee method to charge the device with round pin
    }
}

//Client (Laptop) expects chargeWithUSBC()

//Old Charger only has chargeWithRoundPin()

//Adapter maps the expected interface to the existing method
