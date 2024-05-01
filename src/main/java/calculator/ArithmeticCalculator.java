package calculator;

import calculator.exception.BadInputException;
import calculator.exception.ZeroDivisionException;
import calculator.operator.*;

import java.util.LinkedList;


public class ArithmeticCalculator extends Calculator {
    double firstNumber;
    double secondNumber;

    public ArithmeticCalculator() {
        this.results = new LinkedList<>();
    }

    public double calculate(double firstNumber, double secondNumber, char operator) throws ZeroDivisionException, BadInputException {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        switch (operator) {
            case '+' -> this.result = OperatorType.ADD.operate(this.firstNumber, this.secondNumber);
            case '-' -> this.result = OperatorType.SUB.operate(this.firstNumber, this.secondNumber);
            case '*' -> this.result = OperatorType.MULTI.operate(this.firstNumber, this.secondNumber);
            case '%' -> this.result = OperatorType.MOD.operate(this.firstNumber, this.secondNumber);
            case '/' -> {
                if (secondNumber==0) throw new ZeroDivisionException();
                else this.result = OperatorType.DIVIDE.operate(this.firstNumber, this.secondNumber);
            }
            default -> throw new BadInputException();
        }
        this.addResult(this.result);
        return this.result;
    }
}
