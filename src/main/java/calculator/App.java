package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt();

        System.out.println("첫 번째 숫자:" + num1);
        System.out.println("두 번째 숫자:" + num2);

        System.out.print("사칙연산 기호를 입력하세요: ");
        String input = sc.next();
        char operator = sc.next().charAt(0); //첫번째 글자만 받아오기 위해 CharAT(0)메서드 사용

        int result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 == 0) {
                System.out.println("나눗셈 연산 안에 분모의 수가 0이 될 수 없습니다");
                return; //프로그램 종료
            } else {
                result = num1 / num2;
            }
        } else {
            System.out.println("올바른 사칙연산 기호를 입력하세요");
            return; //프로그램 종료
        }
        System.out.println("결과: " + result);
    }
}


