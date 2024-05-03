package calculator;

import java.util.LinkedList;

public class CircleCalculator extends Calculator {
    static final double PI = 3.141592;

    double radius;

    public CircleCalculator() {
        this.results = new LinkedList<>();
    }

    public double calculate(double number) {
        this.radius = number;
        double result = PI * Math.pow(number, 2);
        this.results.add(result);
        return result;
    }
}
