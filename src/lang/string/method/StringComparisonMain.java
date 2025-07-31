package lang.string.method;

public class StringComparisonMain {

    public static void main(String[] args) {
        String str1 = "Hello World";//대문자 일부 있음
        String str2 = "hello world";//대문자 없이 모두 소문자
        String str3 = "Hello Java";

        System.out.println(str1.equals(str2));//대문자 구분 있음
        System.out.println(str1.equalsIgnoreCase(str2));//대문자 구분 무시

        System.out.println("'b' compare to 'a' "+"b".compareTo("a"));
        System.out.println("'a' compare to 'b'"+"a".compareTo("b"));
        System.out.println("'c' compare to 'a'"+"c".compareTo("a"));
        System.out.println(str1.compareTo(str3));
        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println("str1 start with 'Hello'"+str1.startsWith("Hello"));
        System.out.println("str1 ends with 'World'"+str1.endsWith("World"));


    }
}
