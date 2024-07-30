package calculator;

public class ArithmeticCalculator extends Calculator {
    private AddOperator addOperator;
    private SubtractOperator subtractOperator;
    private MultiplyOperator multiplyOperator;
    private DivideOperator divideOperator;

    // 생성자: 각 연산 클래스를 초기화합니다.
    public ArithmeticCalculator() {
        super();
        this.addOperator = new AddOperator();
        this.subtractOperator = new SubtractOperator();
        this.multiplyOperator = new MultiplyOperator();
        this.divideOperator = new DivideOperator();
    }

    // 사칙연산을 수행하는 메서드
    public double calculate(double num1, double num2, char operator) {
        double result;
        switch (operator) {
            case '+':
                result = addOperator.operate(num1, num2);
                break;
            case '-':
                result = subtractOperator.operate(num1, num2);
                break;
            case '*':
                result = multiplyOperator.operate(num1, num2);
                break;
            case '/':
                result = divideOperator.operate(num1, num2);
                break;
            default:
                throw new IllegalArgumentException("Invalid operator.");
        }
        // 계산된 결과를 저장합니다.
        addResult(result);
        return result;
    }
}

