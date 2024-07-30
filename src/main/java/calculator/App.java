package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 인스턴스 생성
        Scanner sc = new Scanner(System.in);
        Calculator calculator = null;

        while (true) {
            System.out.println("사칙연산을 진행할까요, 원의 넓이를 구할까요? (사칙연산=calc, 원의 넓이=area, 종료=exit)");
            String choice = sc.next();

            if (choice.equalsIgnoreCase("exit")) {
                break;
            } else if (choice.equalsIgnoreCase("calc")) {
                // ArithmeticCalculator 객체를 생성합니다.
                calculator = new ArithmeticCalculator();
                System.out.print("첫 번째 숫자를 입력하세요: ");
                double num1 = sc.nextDouble();
                System.out.print("두 번째 숫자를 입력하세요: ");
                double num2 = sc.nextDouble();
                System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /, %): ");
                char operator = sc.next().charAt(0);

                try {
                    double result = ((ArithmeticCalculator) calculator).calculate(num1, num2, operator);
                    System.out.println("결과: " + result);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }

            } else if (choice.equalsIgnoreCase("area")) {
                // CircleCalculator 객체를 생성합니다.
                calculator = new CircleCalculator();
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble();

                double area = ((CircleCalculator) calculator).calculateCircleArea(radius);
                System.out.println("원의 넓이: " + area);

                // 저장된 원의 넓이 값을 전체 조회
                System.out.println("저장된 원의 넓이 결과:");
                calculator.inquiryResults();
            } else {
                System.out.println("유효하지 않은 선택입니다. 다시 시도하세요.");
            }

            System.out.println("계속 진행할까요? (exit 입력 시 종료)");
        }

        sc.close();
    }
}
