package decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new BasePizza();
        System.out.println(pizza.getDescription() + " Цена: " + pizza.getPrice());

        Pizza pizza2 = new BasePizza();
        pizza2 = new Bacon(pizza2);
        pizza2 = new Chicken(pizza2);
        pizza2 = new Cheese(pizza2);
        System.out.println(pizza2.getDescription() + " Цена: " + pizza2.getPrice());
    }
}
