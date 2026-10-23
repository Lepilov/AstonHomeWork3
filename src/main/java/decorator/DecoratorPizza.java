package decorator;

public abstract class DecoratorPizza implements Pizza{
    protected final Pizza pizza;

    public DecoratorPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }
}
