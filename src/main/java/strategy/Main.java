package strategy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new Plus());
        System.out.println(calculator.calc(2, 3));

        calculator.setOperation(new Minus());
        System.out.println(calculator.calc(3, 2));

        calculator.setOperation(new Multiply());
        System.out.println(calculator.calc(2 ,2));

        calculator.setOperation(new Divide());
        System.out.println(calculator.calc(4, 2));
    }
}
