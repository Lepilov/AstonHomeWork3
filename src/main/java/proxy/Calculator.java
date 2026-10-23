package proxy;

public class Calculator implements Arithmetic {
    @Override
    public int sum(int a, int b) {
        return a + b;
    }
}
