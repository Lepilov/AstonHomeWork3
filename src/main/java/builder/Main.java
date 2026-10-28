package builder;

public class Main {
    public static void main(String[] args) {
        Pizza cheese = new Pizza.Builder("средняя", "тонкое")
                .addCheese()
                .build();

        Pizza meat = new Pizza.Builder("большая", "толстое")
                .addCheese()
                .addBacon()
                .addChicken()
                .addSausage()
                .build();

        System.out.println(cheese);
        System.out.println(meat);
    }
}
