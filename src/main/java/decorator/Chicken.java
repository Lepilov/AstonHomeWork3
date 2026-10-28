package decorator;

public class Chicken extends DecoratorPizza{
    public Chicken(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", c курицей";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 100.0;
    }
}
