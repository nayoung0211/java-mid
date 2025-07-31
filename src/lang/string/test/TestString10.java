package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,orange";
        //분리하기
        String[] split = fruits.split(",");
        for(String s : split) {
            System.out.println(s);
        }

        //합치기
        String join = String.join("-", split);
        System.out.println(join);
    }

}
