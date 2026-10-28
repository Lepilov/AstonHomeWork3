package strategy;

public class Plus implements Operation {

    @Override
    public double exec(double a, double b) {
        return a + b;
    }
}
