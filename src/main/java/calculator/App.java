package calculator;

import calculator.operator.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        while (true) {
            System.out.println("사칙연산을 원하시면 1, 원의 넓이를 구하시려면 2를 입력해주세요.");
            answer = sc.nextLine();

            double result = 0;
            if (answer.equals("1")) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                double num1 = sc.nextDouble();

                System.out.print("두 번째 숫자를 입력하세요: ");
                // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
                double num2 = sc.nextDouble();

                System.out.print("사칙연산 기호를 입력하세요: ");
                // 사칙연산 기호를 적합한 타입으로 선언한 변수에 저장합니다.
                char operator = sc.next().charAt(0);

                sc.nextLine();

                try {
                    result = arithmeticCalculator.calculate(num1, num2, operator);
                } catch (Exception e) {
                    System.out.println(e.getMessage()); // 해당 에러 메시지를 출력하고 다시 처음부터 입력 받음
                    continue;
                }
                System.out.println("결과: " + result);


                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                answer = sc.nextLine();
                if (answer.equals("remove")) {
                    arithmeticCalculator.removeResult();
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                answer = sc.nextLine();
                if (answer.equals("inquiry")) {
                    arithmeticCalculator.inquiryResults();
                }

                System.out.println("숫자를 입력하시면 해당 숫자보다 큰 값을 모두 출력합니다. (조회를 원하지 않으면 아무 문자를 입력해주세요.)");
                answer = sc.nextLine();
                double num;
                try {
                    num=Double.parseDouble(answer);
                }catch (NumberFormatException e) {
                    System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                    answer = sc.nextLine();
                    if (answer.equals("exit")) break; // 이 부분에서 숫자가 아닌 값이 들어왔을 때 에러만 던지고 아래 문을 수행하고 싶은데 구현 못함
                    continue;
                }

                arithmeticCalculator.inquiryBiggerResults(num);
            } else if (answer.equals("2")) {
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble();
                sc.nextLine();

                result = circleCalculator.calculate(radius);
                System.out.println("결과: " + result);

                circleCalculator.inquiryResults();
                /* 배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현 */
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                answer = sc.nextLine();
                if (answer.equals("remove")) {
                    circleCalculator.removeResult();
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            answer = sc.nextLine();
            if (answer.equals("exit")) break;

        }
    }
}
