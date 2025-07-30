package lang.immutable.change;

public class ImmutableMain1 {

    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        ImmutableObj obj2 = obj1.add(20);//불변 객체의 더하기는 값을 반환함으로 값을 받을 객체가 필요함

        //게산 이후에도 기존 값과 신규값 모두 확인 가능
        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());

    }
}
