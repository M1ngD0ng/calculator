package calculator;

import calculator.exception.BadInputException;
import calculator.exception.ZeroDivisionException;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Calculator {
    double result;
    Queue<Double> results;

    public void addResult(double result) {
        this.results.add(result);
    }

    public void removeResult() {
        this.results.remove();
    }

    public void inquiryResults() {
        this.results.forEach((value) -> System.out.print(value.toString() + ' '));
        System.out.println();
    }
    public void inquiryBiggerResults(double num) {
        this.results.stream().filter((value) -> value> num ).forEach((value) -> System.out.print(value.toString() + ' '));
        System.out.println();
    }

}
