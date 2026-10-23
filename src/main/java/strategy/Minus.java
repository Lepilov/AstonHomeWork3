package strategy;

public class Minus implements Operation{
    @Override
    public double exec(double a, double b) {
        return a - b;
    }
}
