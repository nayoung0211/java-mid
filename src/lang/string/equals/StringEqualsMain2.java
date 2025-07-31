package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println(isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(isSame(str3, str4));
    }
    private static boolean isSame(String str1, String str2) {
        //return str1 == str2;
        return str1.equals(str2); //어떻게 생성된 문자열이 들어올지 모르므로 동등성 비교시 무조건 equals 사용
    }

}
