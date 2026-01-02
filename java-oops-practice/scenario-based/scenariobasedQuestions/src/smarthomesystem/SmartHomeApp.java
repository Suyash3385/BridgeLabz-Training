package smarthomesystem;

public class SmartHomeApp {

    public static void main(String[] args) {

        Appliance light = new Light();
        Appliance fan = new Fan();
        Appliance ac = new AC(1500);

        UserController.operateDevice(light);
        UserController.operateDevice(fan);
        UserController.operateDevice(ac);
    }
}
