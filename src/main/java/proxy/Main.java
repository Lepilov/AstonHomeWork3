package proxy;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Proxy();
        System.out.println("Ответ " + arithmetic.sum(3, 2));
    }
}
