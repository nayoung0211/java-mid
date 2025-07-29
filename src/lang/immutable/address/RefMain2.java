package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("seoul");
        ImmutableAddress b = a;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);


        b = new ImmutableAddress("busan");
        System.out.println("b = "+ b);
        System.out.println("a = "+ a);
    }
}
