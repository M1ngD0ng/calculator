package calculator;

import calculator.exception.BadInputException;
import calculator.exception.ZeroDivisionException;
import calculator.operator.*;

import java.util.LinkedList;


public class ArithmeticCalculator extends Calculator {
    double firstNumber;
    double secondNumber;

    private final OperatorType add = OperatorType.ADD;
    private final OperatorType sub = OperatorType.SUB;
    private final OperatorType multi = OperatorType.MULTI;
    private final OperatorType divide = OperatorType.DIVIDE;
    private final OperatorType mod = OperatorType.MOD;
//
//    private final AddOperator addOperator;
//    private final SubtractOperator subtractOperator;
//    private final MultiplyOperator multiplyOperator;
//    private final DivideOperator divideOperator;
//    private final ModOperator modOperator;


    public ArithmeticCalculator() {
        this.results = new LinkedList<>();
//        this.addOperator = addOperator;
//        this.subtractOperator = subtractOperator;
//        this.multiplyOperator = multiplyOperator;
//        this.divideOperator = divideOperator;
//        this.modOperator = modOperator;
    }

    public double calculate(double firstNumber, double secondNumber, char operator) throws ZeroDivisionException, BadInputException {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        switch (operator) {
//            case '+' -> this.result = addOperator.operate(this.firstNumber, this.secondNumber);
//            case '-' -> this.result = subtractOperator.operate(this.firstNumber, this.secondNumber);
//            case '*' -> this.result = multiplyOperator.operate(this.firstNumber, this.secondNumber);
//            case '%' -> this.result = modOperator.operate(this.firstNumber, this.secondNumber);
//            case '/' -> {
//                if (secondNumber == 0) throw new ZeroDivisionException();
//                else this.result = divideOperator.operate(this.firstNumber, this.secondNumber);
//            }
//            default -> throw new BadInputException();
            case '+' -> this.result = add.operate(this.firstNumber, this.secondNumber);
            case '-' -> this.result = sub.operate(this.firstNumber, this.secondNumber);
            case '*' -> this.result = multi.operate(this.firstNumber, this.secondNumber);
            case '%' -> this.result = mod.operate(this.firstNumber, this.secondNumber);
            case '/' -> {
                if (secondNumber == 0) throw new ZeroDivisionException();
                else this.result = divide.operate(this.firstNumber, this.secondNumber);
            }
            default -> throw new BadInputException();
        }
        this.addResult(this.result);
        return this.result;
    }
}
