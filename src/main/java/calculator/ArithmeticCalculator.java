package calculator;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticCalculator extends Calculator {
    private Map<Character, Operator> operators;

    // 생성자: 각 연산 클래스를 초기화합니다.
    public ArithmeticCalculator() {
        super();
        operators = new HashMap<>();
        operators.put('+', new AddOperator());
        operators.put('-', new SubtractOperator());
        operators.put('*', new MultiplyOperator());
        operators.put('/', new DivideOperator());
        operators.put('%', new ModOperator());
    }

    // 사칙연산을 수행하는 메서드
    public double calculate(double num1, double num2, char operator) {
        Operator op = operators.get(operator);
        if (op == null) {
            throw new IllegalArgumentException("Invalid operator.");
        }
        double result = op.operate(num1, num2);
        // 계산된 결과를 저장합니다.
        addResult(result);
        return result;
    }

    // 연산자를 동적으로 추가하는 메서드
    public void addOperator(char symbol, Operator operator) {
        operators.put(symbol, operator);
    }
}
