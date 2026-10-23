package strategy;

public class Divide implements Operation{
    @Override
    public double exec(double a, double b) {
        return a /b ;
    }
}
