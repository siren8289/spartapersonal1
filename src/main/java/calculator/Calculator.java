import java.util.ArrayList; // ArrayList 클래스를 사용하기 위해 import
import java.util.List;      // List 인터페이스를 사용하기 위해 import

public class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드를 private으로 선언하여 외부에서 직접 접근하지 못하도록 합니다.
    private List<Integer> results;

    // 기본 생성자
    public Calculator() {
        // ArrayList 인스턴스를 생성하여 results 필드를 초기화합니다.
        results = new ArrayList<>();
    }

    // 연산 메서드
    public int calculate(int num1, int num2, char operator) throws InvalidOperationException {
        int result; // 연산 결과를 저장할 변수
        switch (operator) { // 연산자에 따라 연산을 수행합니다.
            case '+':
                result = num1 + num2; // 덧셈
                break;
            case '-':
                result = num1 - num2; // 뺄셈
                break;
            case '*':
                result = num1 * num2; // 곱셈
                break;
            case '/':
                if (num2 == 0) { // 나눗셈에서 분모가 0인 경우
                    throw new InvalidOperationException("Division by zero is not allowed."); // 사용자 정의 예외를 발생시킵니다.
                }
                result = num1 / num2; // 나눗셈
                break;
            default:
                throw new InvalidOperationException("Invalid operator."); // 유효하지 않은 연산자일 경우 예외를 발생시킵니다.
        }

        // 연산 결과를 저장합니다.
        results.add(result);

        return result; // 연산 결과를 반환합니다.
    }

    // 결과 리스트를 반환하는 Getter 메서드
    public List<Integer> getResults() {
        // 원본 리스트를 보호하기 위해 복사본을 반환합니다.
        return new ArrayList<>(results); // 리스트의 복사본을 반환하여 직접적인 수정 방지
    }

    // 결과 리스트를 수정하는 Setter 메서드
    public void setResults(List<Integer> newResults) {
        // 전달된 리스트의 유효성 검사를 추가할 수 있습니다.
        this.results = new ArrayList<>(newResults); // 새로운 리스트로 교체합니다.
    }
}
