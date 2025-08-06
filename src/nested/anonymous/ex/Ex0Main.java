package nested.anonymous.ex;

public class Ex0Main {

    public static void helloJava(){
        System.out.println("program start");
        System.out.println("hello java");
        System.out.println("program end");
    }
    public static void helloSpring(){
        System.out.println("program start");
        System.out.println("hello spring");
        System.out.println("program end");
    }
    public static void main(String[] args) {
        helloSpring();
        helloJava();
    }

}
