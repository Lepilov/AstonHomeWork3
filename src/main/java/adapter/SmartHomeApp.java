package adapter;

public class SmartHomeApp {
    public void activateDevice(SmartDevice smartDevice){
        System.out.println("Команда включения");
        smartDevice.turnOn();
    }
}
