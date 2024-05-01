package calculator.operator;

public enum OperatorType implements AbstractOperator {
    ADD("+"){
        public double operate(double a, double b) {
            return a + b;
        }
    },
    SUB("-"){
        public double operate(double a, double b) {
            return a - b;
        }
    },
    MULTI("*"){
        public double operate(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/"){
        public double operate(double a, double b) {
            return a / b;
        }
    },
    MOD("%"){
        public double operate(double a, double b) {
            return a % b;
        }
    };

    private final String oper;
    OperatorType(String oper) {
        this.oper = oper;
    }
}
