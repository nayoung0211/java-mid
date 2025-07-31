package lang.string.immutable;

public class StringImmutable2 {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = str1.concat("java");
        System.out.println(str2);//string은 불변 객체여서 합쳐지려면 새로운 객체로 반환값을 받아야함
    }

}
