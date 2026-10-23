package strategy;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation){
        this.operation = operation;
    }

    // Меняем операцию
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    // Счиатем
    public double calc(double a, double b){
        return operation.exec(a, b);
    }
}
