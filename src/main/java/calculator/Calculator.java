package calculator;

import calculator.exception.BadInputException;
import calculator.exception.ZeroDivisionException;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    int firstNumber;
    int secondNumber;
    int result;
    Queue<Integer> q = new LinkedList<>();

    public int calculate(int firstNumber, int secondNumber, char operator) throws ZeroDivisionException, BadInputException {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

        switch (operator) {
            case '+' -> this.result = firstNumber + secondNumber;
            case '-' -> this.result = firstNumber - secondNumber;
            case '*' -> this.result = firstNumber * secondNumber;
            case '/' -> {
                if (secondNumber == 0) throw new ZeroDivisionException();
                else this.result = firstNumber / secondNumber;
            }
            default -> throw new BadInputException();
        }
        this.q.add(result);
        return result;
    }
    public void removeFront(){
        this.q.remove();
    }
    public void printAll(){
        this.q.forEach((value) -> System.out.print(value.toString() + ' '));
        System.out.println();
    }

}
