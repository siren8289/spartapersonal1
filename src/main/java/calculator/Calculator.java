package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드를 private으로 선언하여 외부에서 직접 접근하지 못하도록 합니다.
    private List<Integer> results;

    // 생성자: Calculator 인스턴스 생성 시 결과 리스트를 초기화합니다.
    public Calculator() {
        // 결과를 저장할 리스트를 생성합니다.
        this.results = new ArrayList<>();
    }

    // 연산 메서드
    public int calculate(int num1, int num2, char operator) throws InvalidOperationException {
        int result;
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
                    throw new InvalidOperationException("Division by zero is not allowed.");
                }
                result = num1 / num2;
                break;
            default:
                throw new InvalidOperationException("Invalid operator.");
        }

        // 연산 결과를 저장합니다.
        results.add(result);

        return result;
    }

    // 결과 리스트를 조회하는 메서드
    public void inquiryResults() {
        if (results.isEmpty()) {
            System.out.println("저장된 결과가 없습니다.");
        } else {
            System.out.println("저장된 연산 결과:");
            for (int idx = 0; idx < results.size(); idx++) {
                System.out.println(idx + "번째 결과 = " + results.get(idx));
            }
        }
    }

    // Getter 메서드
    public List<Integer> getResults() {
        return new ArrayList<>(results);
    }

    // Setter 메서드
    public void setResults(List<Integer> newResults) {
        this.results = new ArrayList<>(newResults);
    }

    // 결과 리스트에서 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0); // 가장 먼저 저장된 결과를 삭제합니다.
        }
    }
}

