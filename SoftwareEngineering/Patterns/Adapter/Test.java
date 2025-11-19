package Adapter;

public class Test {
    public static void main(String[] args) {
        // Altes Ladegerät (nicht kompatibel mit dem Laptop)
        RoundPinCharger oldCharger = new RoundPinCharger();

        // Adapter verwenden, um das alte Ladegerät kompatibel zu machen
        USBCChargerInterface adapter = new ChargerAdapter(oldCharger);

        // Adapter mit dem neuen System verbinden
        USBCCharger newCharger = new USBCCharger(adapter);

        // Laptop lädt jetzt über USB-C (mit Adapter)
        newCharger.chargeWithUSBC();
    }
}
