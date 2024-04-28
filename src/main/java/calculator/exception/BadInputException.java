package calculator.exception;

public class BadInputException extends Exception{
    public BadInputException(){
        super(" + - * / 연산자 중 하나를 입력해주세요.");
    }
}
