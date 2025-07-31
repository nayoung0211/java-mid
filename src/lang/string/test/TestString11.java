package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello World";
        String string = new StringBuffer(str).reverse().toString();
        System.out.println(string);
    }

}
