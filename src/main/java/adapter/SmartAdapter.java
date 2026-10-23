package adapter;

public class SmartAdapter implements SmartDevice{
    private final Lamp lamp;

    public SmartAdapter(Lamp lamp) {
        this.lamp = lamp;
    }

    @Override
    public void turnOn() {
        System.out.println("Включаем лампу через умную розетку");
        lamp.Switch();
    }
}
