package lang.string.test;

public class TestString7 {

    public static void main(String[] args) {
        String original = "      hello   java  ";
        String trimmed = original.trim();
        System.out.println(trimmed);

        String striped = original.strip();
        System.out.println(striped);
    }

}
