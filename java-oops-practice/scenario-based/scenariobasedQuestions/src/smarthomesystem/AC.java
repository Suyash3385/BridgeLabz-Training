package smarthomesystem;

class AC extends Appliance {

    public AC(int powerUsage) {
        super(powerUsage); // User-defined power
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println("AC cooling started at 22");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println("AC turned OFF");
    }
}
