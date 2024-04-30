package calculator.operator;

public class MultiplyOperator implements AbstractOperator{
    @Override
    public double operate(double a, double b) {
        return a * b;
    }
}
