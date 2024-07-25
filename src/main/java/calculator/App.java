package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("사칙연산 기호를 입력하세요: ");
        String input = sc.next();
        char Number = sc.next().charAt(0); //첫번째 글자만 받아오기 위해 CharAT(0)메서드

    }
}


