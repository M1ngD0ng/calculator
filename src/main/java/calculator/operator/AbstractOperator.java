package calculator.operator;

public interface AbstractOperator<T extends Number> {
    T operate(T  num1, T  num2);
}
