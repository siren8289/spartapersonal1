package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    // 원의 넓이 결과를 저장하는 컬렉션 타입 필드 (private으로 선언하여 외부에서 직접 접근할 수 없도록 함)
    private List<Double> circleAreas;

    // 원의 넓이 계산에 필요한 상수 (원의 넓이를 계산할 때 사용되는 원주율 π)
    // final로 선언하여 값이 변경되지 않도록 함
    private static final double PI = 3.141592653589793;

    // 생성자: Calculator 인스턴스 생성 시 원의 넓이 저장 리스트를 초기화합니다.
    public Calculator() {
        this.circleAreas = new ArrayList<>();
    }

    // 원의 넓이를 계산하는 메서드
    public double calculateCircleArea(double radius) {
        // 원의 넓이 = π * 반지름^2
        double area = PI * radius * radius;
        // 계산된 원의 넓이를 저장합니다.
        circleAreas.add(area);
        return area;
    }

    // 원의 넓이 저장 필드의 Getter 메서드
    public List<Double> getCircleAreas() {
        return new ArrayList<>(circleAreas); // 원본 리스트를 보호하기 위해 복사본을 반환
    }

    // 원의 넓이 저장 필드의 Setter 메서드
    public void setCircleAreas(List<Double> newCircleAreas) {
        this.circleAreas = new ArrayList<>(newCircleAreas); // 새로운 리스트로 필드 업데이트
    }

    // 저장된 원의 넓이를 조회하는 메서드
    public void inquiryCircleAreas() {
        if (circleAreas.isEmpty()) {
            System.out.println("저장된 원의 넓이가 없습니다.");
        } else {
            System.out.println("저장된 원의 넓이 결과:");
            for (int idx = 0; idx < circleAreas.size(); idx++) {
                System.out.println(idx + "번째 원의 넓이 = " + circleAreas.get(idx));
            }
        }
    }

    // 사칙연산 메서드들은 여기에 포함됩니다 (예: calculate)
}

