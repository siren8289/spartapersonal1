package calculator;

public class DivideOperator implements Operator {
    @Override
    public double operate(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}

