import java.util.Scanner; // Scanner 클래스를 사용하기 위해 import
import java.util.List;    // List 인터페이스를 사용하기 위해 import

public class App {
    public static void main(String[] args) {
        // Calculator 객체를 생성합니다.
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성

        while (true) { // 무한 루프 시작
            System.out.println("첫 번째 숫자 입력 (종료=exit):");
            String input = sc.next(); // 첫 번째 숫자 입력을 문자열로 받습니다.

            if (input.equalsIgnoreCase("exit")) { // 사용자가 'exit'을 입력하면 종료
                break;
            } else if (input.equalsIgnoreCase("remove")) { // 'remove' 명령어 처리
                // 결과 리스트가 비어 있지 않은 경우
                List<Integer> results = calculator.getResults(); // 결과 리스트를 가져옵니다.
                if (!results.isEmpty()) {
                    results.remove(0); // 가장 먼저 저장된 결과를 삭제합니다.
                    calculator.setResults(results); // 삭제 후 결과를 업데이트합니다.
                    System.out.println("가장 먼저 저장된 결과가 삭제되었습니다.");
                } else {
                    System.out.println("저장된 결과가 없습니다.");
                }
                continue;
            } else if (input.equalsIgnoreCase("inquiry")) { // 'inquiry' 명령어 처리
                List<Integer> results = calculator.getResults(); // 결과 리스트를 가져옵니다.
                if (results.isEmpty()) {
                    System.out.println("저장된 결과가 없습니다.");
                } else {
                    System.out.println("저장된 연산 결과:");
                    // 향상된 for 문을 사용하여 결과를 출력합니다.
                    for (String result : results) {
                        System.out.println(idx + "번째 결과 = " + result); // 각 결과를 출력
                        idx++; // 인덱스 증가
                    }
                }
                continue;
            }

            int num1; // 첫 번째 숫자
            try {
                num1 = Integer.parseInt(input); // 문자열을 정수로 변환
            } catch (NumberFormatException e) { // 변환 중 예외 발생 시
                System.out.println("유효한 숫자를 입력하세요.");
                continue;
            }

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두 번째 숫자 입력

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            char operator = sc.next().charAt(0); // 연산자 기호 입력

            try {
                int result = calculator.calculate(num1, num2, operator); // 계산 수행
                System.out.println("결과: " + result); // 계산 결과 출력
            } catch (InvalidOperationException e) { // 계산 중 예외 발생 시
                System.out.println(e.getMessage()); // 예외 메시지 출력
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)"); // 추가 계산 여부 확인
        }

        // 프로그램 종료 후, 저장된 연산 결과를 출력합니다.
        System.out.println("저장된 연산 결과:");
        List<Integer> results = calculator.getResults(); // 결과 리스트를 가져옵니다.
        for (int idx = 0; idx < results.size(); idx++) { // 결과 리스트를 순회
            System.out.println(idx + "번째 결과 = " + results.get(idx)); // 각 결과를 출력
        }

        sc.close(); // Scanner 객체를 닫습니다.
    }
}
