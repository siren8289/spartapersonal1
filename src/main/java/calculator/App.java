package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //  스캐너 객체 생성
        Scanner sc = new Scanner(System.in);
        /* 반복문 사용 해서 연산을 반복 */
        while (true) {
            System.out.println("첫 번째 숫자 입력 (종료=exit):");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();

            System.out.println("첫 번째 숫자: " + num1);
            System.out.println("두 번째 숫자: " + num2);

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            int result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산 안에 분모의 수가 0이 될 수 없습니다.");
                        return; // 프로그램 종료
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("올바른 사칙연산 기호를 입력하세요.");
                    return; // 프로그램 종료
            }
            System.out.println("결과: " + result);
        }
    }
}


