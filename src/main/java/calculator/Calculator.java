package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator {
    // 연산 결과를 저장하는 컬렉션 타입 필드 (private으로 선언하여 외부에서 직접 접근할 수 없도록 함)
    protected List<Double> results;

    // 생성자: Calculator 인스턴스 생성 시 결과 저장 리스트를 초기화합니다.
    public Calculator() {
        this.results = new ArrayList<>();
    }

    // 결과를 저장하는 메서드
    protected void addResult(double result) {
        results.add(result);
    }

    // 결과 리스트를 반환하는 Getter 메서드
    public List<Double> getResults() {
        return new ArrayList<>(results); // 원본 리스트를 보호하기 위해 복사본을 반환
    }

    // 결과 리스트를 수정하는 Setter 메서드
    public void setResults(List<Double> newResults) {
        this.results = new ArrayList<>(newResults); // 새로운 리스트로 필드 업데이트
    }

    // 연산 결과를 조회하는 메서드
    public void inquiryResults() {
        if (results.isEmpty()) {
            System.out.println("저장된 결과가 없습니다.");
        } else {
            System.out.println("저장된 결과:");
            for (int idx = 0; idx < results.size(); idx++) {
                System.out.println(idx + "번째 결과 = " + results.get(idx));
            }
        }
    }
}

