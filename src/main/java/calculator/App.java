package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        Calculator calculator = new Calculator();

        while (true) {
            int result = 0;
            System.out.print("첫 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요: ");
            // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
            char operator = sc.next().charAt(0);

            sc.nextLine();

            try {
                result = calculator.calculate(num1, num2, operator);
            } catch (Exception e) {
                System.out.println(e.getMessage()); // 해당 에러 메시지를 출력하고 다시 처음부터 입력 받음
                continue;
            }
            System.out.println("결과: " + result);

            /* 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현 */
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            answer = sc.nextLine();
            if (answer.equals("remove")) {
                calculator.removeFront();
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            answer = sc.nextLine();
            if (answer.equals("inquiry")) {
                calculator.getAll().forEach((value) -> System.out.print(value.toString() + ' '));
                System.out.println();
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = sc.nextLine();
            if (answer.equals("exit")) break;

        }
    }
}
