package calculator;

import calculator.operator.*;

import java.util.LinkedList;


public class ArithmeticCalculator<T extends Number> extends Calculator {
    public final Class<T> type;

    public ArithmeticCalculator(Class<T> type) {
        this.results = new LinkedList<>();
        this.type = type;
    }

    public T calculate(T firstNumber, T secondNumber, char operator)  {
        return operatorFactory(operator).operate(firstNumber, secondNumber);
    }
//
//        switch (operator) {
//            case ADD ->
//            case '-' -> this.result = OperatorType.SUB.operate(firstNumber, secondNumber);
//            case '*' -> this.result = OperatorType.MULTI.operate(firstNumber, secondNumber);
//            case '%' -> this.result = OperatorType.MOD.operate(firstNumber, secondNumber);
//            case '/' -> this.result = OperatorType.DIVIDE.operate(firstNumber, secondNumber);
//            default -> throw new BadInputException();
//        }
//        this.addResult(this.result);
//        return this.result;
//    }
    private AbstractOperator<Double> operatorFactory(char operator) {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch (operatorType) {
            case ADD -> new AddOperator(type);
            case SUB -> new SubtractOperator(type);
            case MULTI -> new MultiplyOperator(type);
            case DIVIDE -> new DivideOperator(type);
            case MOD -> new ModOperator(type);
        };
    }
}
