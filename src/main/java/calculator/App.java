package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Calculator 객체를 생성합니다.
        // 생성자 호출 시 결과 리스트가 초기화됩니다.
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("첫 번째 숫자 입력 (종료=exit):");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("remove")) {
                // 결과 삭제 메서드 호출
                calculator.removeResult();
                System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
                continue;
            } else if (input.equalsIgnoreCase("inquiry")) {
                // 결과 조회 메서드 호출
                calculator.inquiryResults();
                continue;
            }

            int num1;
            try {
                num1 = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자를 입력하세요.");
                continue;
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            try {
                int result = calculator.calculate(num1, num2, operator);
                System.out.println("결과: " + result);
            } catch (InvalidOperationException e) {
                System.out.println(e.getMessage());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        }

        // 프로그램 종료 후, 저장된 연산 결과를 출력합니다.
        System.out.println("프로그램 종료. 저장된 연산 결과:");
        calculator.inquiryResults();

        sc.close();
    }
}

