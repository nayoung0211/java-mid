package lang.immutable.change;

public class ImmutableMain2 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        //기존 값만 확인 가능
        System.out.println(obj1.getValue());
    }
}
