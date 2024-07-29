package calculator;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 스캐너 객체 생성
        List<String> results = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
//        // 연산 결과 저장 배열 생성 (최대 10개)
//        int[] results = new int[10];
//        int count = 0;

        while (true) {
//            // 배열이 가득 찬 경우 종료
//            if (count >= results.length) {
//                System.out.println("저장 공간이 가득 찼습니다. 프로그램을 종료합니다.");
//                break;
//            }

            System.out.println("첫 번째 숫자 입력 (종료=exit):");
            String input = sc.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }else if(input.equalsIgnoreCase("remove")){
                if (!results.isEmpty()){
                    results.remove(0);
                    System.out.println("가장 먼저 저장된 결과가 삭제");
                }else{
                    System.out.println( "저장된 결과가 없습니다.");
                }
                continue;
            }else if(input.equalsIgnoreCase("inquiry")) {
                if (!results.isEmpty()) {
                    results.remove(0);
                    System.out.println("저장된 연산결과를 조회하시겠습니까?");
                } else {
                    System.out.println("저장된 결과가 없습니다.");
                }
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
                        System.out.println("나눗셈 연산에서 분모의 수가 0이 될 수 없습니다.");
                        continue;
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("올바른 사칙연산 기호를 입력하세요.");
                    continue;
            }

            // 연산 결과 저장
            results.add(String.valueOf(result));


            System.out.println("결과: " + result);
        }

        // 저장된 결과 출력
        System.out.println("저장된 연산 결과:");
        for (int i = 0; i < results.size(); i++) {
            System.out.println("결과 " + (i + 1) + ": " + results.get(i));
        }
    }
}
