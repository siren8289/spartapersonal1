package calculator;

public class CircleCalculator extends Calculator {

    // 상수: 원주율 π
    private static final double PI = 3.141592653589793;

    // 생성자: 부모 클래스의 생성자를 호출하여 결과 저장 리스트를 초기화합니다.
    public CircleCalculator() {
        super();
    }

    // 원의 넓이를 계산하는 메서드
    public double calculateCircleArea(double radius) {
        double area = PI * radius * radius;
        // 계산된 원의 넓이를 저장합니다.
        addResult(area);
        return area;
    }
}

