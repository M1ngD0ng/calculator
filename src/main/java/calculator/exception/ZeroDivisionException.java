package calculator.exception;

public class ZeroDivisionException extends Exception {
    public ZeroDivisionException(){
        super("나눗셈 분모는 0이 될 수 없습니다. 새로운 값을 입력해주세요.");
    }
}
