package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaces = "       java Programming";

        System.out.println("소문자 변환 : "+strWithSpaces.toLowerCase());
        System.out.println("대문자 변환 : "+strWithSpaces.toUpperCase());

        System.out.println("trim 공백 제거 "+strWithSpaces.trim());
        System.out.println("strip()"+strWithSpaces.strip());
        System.out.println(strWithSpaces.stripLeading());//앞 공백 제거
        System.out.println(strWithSpaces.stripTrailing());//뒤 공백 제거

    }

}
