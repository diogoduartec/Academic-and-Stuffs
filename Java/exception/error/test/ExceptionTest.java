package exception.error.test;

public class ExceptionTest {
    public static void stackOverflowError(){
        stackOverflowError();
    }
    public static void main(String[] args) {
        stackOverflowError();
    }
}
