package chapter02;

import java.util.regex.Pattern;

/**
 * Pattern은 입력받은 정규표현식에 해당하는 유한 상태 머신을 만들기 때문에
 * 인스턴스 생성비용이 높다. 따라서 인스턴스를 클래스 초기화 과정에서 직접 생성해 캐싱해두고, 재사용하는 것을 권고함.
 */
public class Exam03 {

    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }
}
