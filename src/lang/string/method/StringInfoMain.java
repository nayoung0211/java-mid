package lang.string.method;

public class StringInfoMain {

    public static void main(String[] args) {
        String str = "hello java";
        System.out.println("length : "+str.length());
        System.out.println("Empty : "+str.isEmpty());
        System.out.println("Blank : "+str.isBlank());
        System.out.println("   ".isBlank());
        char c  = str.charAt(7);
        System.out.println(c);
    }

}
