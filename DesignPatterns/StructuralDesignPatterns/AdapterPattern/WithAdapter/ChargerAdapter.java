package DesignPatterns.StructuralDesignPatterns.AdapterPattern.WithAdapter;

public class ChargerAdapter implements USBCCharger {
    //this is the adapter class which implements the target interface
    private RoundPinCharger roundPinCharger; 

    public ChargerAdapter(RoundPinCharger roundPinCharger) {
        this.roundPinCharger = roundPinCharger;
    }

    @Override
    public void chargeDeviceWithUSBC(){
        //this method calls the adaptee method to charge the device with round pin
        System.out.println("Charging device with USB-C charger.");
        roundPinCharger.chargeDeviceWithRoundPin();
    }

}

//this is the adapter class which implements the target interface
//Our new laptop has a USB-C port, but we have a round pin charger. this adapter class allows us to use the round pin charger with the USB-C port.

