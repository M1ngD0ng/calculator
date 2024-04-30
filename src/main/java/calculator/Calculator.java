package calculator;

import calculator.exception.BadInputException;
import calculator.exception.ZeroDivisionException;

import java.util.LinkedList;
import java.util.Queue;

public abstract class Calculator {
    double result;
    Queue<Double> results;
//
//    public Calculator(){ // 연산 결과 저장할 컬렉션 필드 초기화
//        this.results = new LinkedList<>();
//    }
//
//    public abstract void addResult(double result);
//
//    public abstract void removeResult();
//
//    public abstract void inquiryResults();

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
}
