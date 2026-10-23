package decorator;

public class BasePizza implements Pizza{
    @Override
    public String getDescription() {
        return "Пицца";
    }

    @Override
    public double getPrice() {
        return 300.0;
    }
}
