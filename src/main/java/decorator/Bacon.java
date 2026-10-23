package decorator;

public class Bacon extends DecoratorPizza{
    public Bacon(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", c беконом";
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 100.0;
    }
}
