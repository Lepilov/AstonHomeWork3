package proxy;

public class Proxy implements Arithmetic {
    private final Arithmetic arithmetic = new Calculator();
    @Override
    public int sum(int a, int b) {
        System.out.println("Вызов метода sum с параметрами " + a + ", " + b);
        int result = arithmetic.sum(a, b);
        System.out.println("Результат " + result);
        return result;
    }
}
