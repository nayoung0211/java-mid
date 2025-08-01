package lang.wrapper.test;

public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        //String -> int parseInt
        int num1 = Integer.parseInt(str1);//parseInt -> Integer 에서 문자 -> 숫자로 변환 시켜줌
        int num2 = Integer.parseInt(str2);
        int sum = num1 + num2;
        System.out.println(sum);
    }

}
