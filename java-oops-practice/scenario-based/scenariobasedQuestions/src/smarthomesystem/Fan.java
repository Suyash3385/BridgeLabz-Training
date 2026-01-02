package smarthomesystem;

class Fan extends Appliance {

    public Fan() {
        super(75);
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("Fan started spinning at medium speed.");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("Fan stopped.");
    }
}

