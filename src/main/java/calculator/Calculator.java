package calculator;

import java.util.ArrayList;
import java.util.List;

// Calculator 클래스 정의 파일
public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    private List<Integer> results;

    // 기본 생성자
    public Calculator() {
        // ArrayList를 사용하여 results 리스트 초기화
        results = new ArrayList<>();
    }

    // 연산 메서드: 두 개의 숫자와 연산 기호를 받아 연산을 수행
    public int calculate(int num1, int num2, char operator) throws InvalidOperationException {
        int result; // 연산 결과를 저장할 변수

        // 연산 기호에 따라 연산을 수행
        switch (operator) {
            case '+':
                result = num1 + num2; // 덧셈 연산
                break;
            case '-':
                result = num1 - num2; // 뺄셈 연산
                break;
            case '*':
                result = num1 * num2; // 곱셈 연산
                break;
            case '/':
                if (num2 == 0) { // 분모가 0인 경우
                    // 사용자 정의 예외 발생
                    throw new InvalidOperationException("나눗셈에서 분모의 수가 0이 될 수 없습니다.");
                }
                result = num1 / num2; // 나눗셈 연산
                break;
            default: // 잘못된 연산 기호인 경우
                // 사용자 정의 예외 발생
                throw new InvalidOperationException("올바른 사칙연산 기호를 입력하세요.");
        }

        // 연산 결과를 컬렉션에 저장
        results.add(result);

        // 연산 결과 반환
        return result;
    }

    // 연산 결과를 반환하는 메서드
    public List<Integer> getResults() {
        return results;
    }
}

