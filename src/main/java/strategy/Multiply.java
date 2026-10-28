package strategy;

public class Multiply implements Operation{
    @Override
    public double exec(double a, double b) {
        return a * b;
    }
}
