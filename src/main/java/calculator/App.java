package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Double> q=new LinkedList<>();
        int index=0;
        String answer;


        while (true) {
            double result = 0;
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            double firstNumber = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            double secondNumber = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char operator = sc.next().charAt(0);

            switch (operator) {
                case '+' -> result = firstNumber + secondNumber;
                case '-' -> result = firstNumber - secondNumber;
                case '*' -> result = firstNumber * secondNumber;
                case '/' -> result = firstNumber / secondNumber;
            }
            sc.nextLine();
            System.out.println("결과: " + result);
            q.add(result);
            /* 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현 */
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = sc.nextLine();
            if (answer.equals("remove")){
                q.remove();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            answer = sc.nextLine();
            if (answer.equals("inquiry")){
                q.forEach((value)-> System.out.print(value.toString()+' '));
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = sc.nextLine();
            if (answer.equals("exit")) break;

        }
    }
}
