package Adapter;

// Der Adapter, der das runde Ladegerät mit USB-C kompatibel macht
class ChargerAdapter implements USBCChargerInterface {
    private RoundPinCharger roundPinCharger;

    public ChargerAdapter(RoundPinCharger roundPinCharger) {
        this.roundPinCharger = roundPinCharger;
    }

    @Override
    public void chargeWithUSBC() {
        System.out .println("Adapter konvertiert das Signal...");
        roundPinCharger.chargeWithRoundPin(); // Weiterleitung an das alte Ladegerät
    }
}
