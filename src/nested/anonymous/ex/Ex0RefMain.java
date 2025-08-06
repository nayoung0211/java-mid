package nested.anonymous.ex;

public class Ex0RefMain {

    //상황에 따라 변하는 부분은 외부에서 전달 받아서 처리한다.
    public static void hello(String str){
        System.out.println("program start");//변하지 않는 부분
        System.out.println(str);//변하는 부분
        System.out.println("program end");//변하지 않는 부분
    }

    public static void main(String[] args) {
       hello("Hello World");
       hello("Hello Java");
    }
}
