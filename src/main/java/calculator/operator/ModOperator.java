package calculator.operator;

public class ModOperator implements AbstractOperator {
    @Override
    public double operate(double a, double b) {
        return a % b;
    }
}
