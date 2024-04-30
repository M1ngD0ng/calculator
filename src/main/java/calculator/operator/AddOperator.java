package calculator.operator;

public class AddOperator implements AbstractOperator {
    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}
