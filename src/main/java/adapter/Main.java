package adapter;

public class Main {
    public static void main(String[] args) {
        SmartHomeApp smartHomeApp = new SmartHomeApp();

        Lamp lamp = new Lamp();

        SmartDevice smartDevice = new SmartAdapter(lamp);

        smartHomeApp.activateDevice(smartDevice);
    }
}
