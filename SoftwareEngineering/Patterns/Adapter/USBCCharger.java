package Adapter;

public class USBCCharger {

    USBCChargerInterface adapter;

    public USBCCharger(USBCChargerInterface adapter) {
        this.adapter = adapter;
    }

    public void chargeWithUSBC() {
        adapter.chargeWithUSBC();
    }

}
