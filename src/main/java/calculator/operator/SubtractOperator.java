package calculator.operator;

public class SubtractOperator implements AbstractOperator {
    @Override
    public double operate(double a, double b) {
        return a - b;
    }
}
