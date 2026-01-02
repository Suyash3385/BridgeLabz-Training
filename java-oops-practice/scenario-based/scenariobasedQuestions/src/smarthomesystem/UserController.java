package smarthomesystem;

class UserController {

    public static void operateDevice(Appliance appliance) {

        appliance.turnOn();
        appliance.showStatus();

        if (appliance.getPowerUsage() > 1000) {
            System.out.println("⚠️ High energy consuming device!");
        }

        appliance.turnOff();
   
    }
}


