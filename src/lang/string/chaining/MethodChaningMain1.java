package lang.string.chaining;

public class MethodChaningMain1 {

    public static void main(String[] args) {
        ValueAdder valueAdder = new ValueAdder();
        valueAdder.add(1);
        valueAdder.add(2);
        valueAdder.add(3);

        int result = valueAdder.getValue();
        System.out.println(result);

    }

}
