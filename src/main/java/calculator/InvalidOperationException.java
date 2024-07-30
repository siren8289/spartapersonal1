package calculator;

// 예외 클래스 정의 파일
public class InvalidOperationException extends Exception {
    public InvalidOperationException(String message) {
        super(message);
    }
}
