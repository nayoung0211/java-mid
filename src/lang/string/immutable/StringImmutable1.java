package lang.string.immutable;

public class StringImmutable1 {

    public static void main(String[] args) {
        String str = "hello";
        str.concat("java");
        System.out.println(str);//string은 불변 객체여서 합쳐지려면 새로운 객체로 반환값을 받아야함
    }

}
