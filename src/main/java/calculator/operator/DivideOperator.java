package calculator.operator;

public class DivideOperator implements AbstractOperator {
    @Override
    public double operate(double a, double b) {
        return a / b;
    }
}
