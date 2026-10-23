package decorator;

public class Cheese extends DecoratorPizza{
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", c сыром";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 100.0;
    }
}
