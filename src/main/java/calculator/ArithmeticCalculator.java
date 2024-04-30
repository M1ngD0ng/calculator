package calculator;

import calculator.exception.BadInputException;
import calculator.exception.ZeroDivisionException;
import calculator.operator.*;

import java.util.LinkedList;

public class ArithmeticCalculator extends Calculator {
    double firstNumber;
    double secondNumber;

    private final AddOperator addOperator;
    private final SubtractOperator subtractOperator;
    private final MultiplyOperator multiplyOperator;
    private final DivideOperator divideOperator;
    private final ModOperator modOperator;


    public ArithmeticCalculator(AddOperator addOperator, SubtractOperator subtractOperator, MultiplyOperator multiplyOperator, DivideOperator divideOperator, ModOperator modOperator) {
        this.results = new LinkedList<>();
        this.addOperator = addOperator;
        this.subtractOperator = subtractOperator;
        this.multiplyOperator = multiplyOperator;
        this.divideOperator = divideOperator;
        this.modOperator = modOperator;
    }

    public double calculate(double firstNumber, double secondNumber, char operator) throws ZeroDivisionException, BadInputException {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        switch (operator) {
            case '+' -> this.result = addOperator.operate(this.firstNumber, this.secondNumber);
            case '-' -> this.result = subtractOperator.operate(this.firstNumber, this.secondNumber);
            case '*' -> this.result = multiplyOperator.operate(this.firstNumber, this.secondNumber);
            case '%' -> this.result = modOperator.operate(this.firstNumber, this.secondNumber);
            case '/' -> {
                if (secondNumber == 0) throw new ZeroDivisionException();
                else this.result = divideOperator.operate(this.firstNumber, this.secondNumber);
            }
            default -> throw new BadInputException();
        }
        this.addResult(this.result);
        return this.result;
    }
}
