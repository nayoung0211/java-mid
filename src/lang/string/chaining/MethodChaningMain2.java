package lang.string.chaining;

public class MethodChaningMain2 {

    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        ValueAdder adder1 = valueAdder.add(1);
        ValueAdder adder2 = valueAdder.add(2);
        ValueAdder adder3 = valueAdder.add(3);

        int result = adder3.getValue();
        System.out.println(result);
    }
}
