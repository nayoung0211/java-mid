package lang.string.chaining;

public class MethodChaningMain2 {

    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder adder1 = valueAdder.add(1);
        ValueAdder adder2 = valueAdder.add(2);
        ValueAdder adder3 = valueAdder.add(3);

        int result = adder3.getValue();
        System.out.println(result);
        System.out.println(adder1.getValue()); //모두 같은 참조값 add가 모두 자신의 참조값을 반환했기 때문
        System.out.println(adder2.getValue());
        System.out.println(adder3.getValue());
    }
}
