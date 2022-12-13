package chapter02;

/**
 * 생성자 대신 정적 팩토리 메서드를 고려하라
 */
public class Exam01 {

    public static void main(String[] args) {

        boolean value = false;
        System.out.println("result: " + valueOf(value));
    }

    private static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE: Boolean.FALSE;
    }
}


