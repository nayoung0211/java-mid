package lang.wrapper;

public class WrapperClassMain {

    public static void main(String[] args) {
        Integer newInteger = new Integer(10);

        Integer i = Integer.valueOf(10);
        Long l = Long.valueOf(10);
        Double d = Double.valueOf(10);

        System.out.println(newInteger);

        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        int intValue = newInteger.intValue();
        System.out.println(intValue);
        long l1 = l.longValue();
        System.out.println(l1);
        double d1 = d.doubleValue();
        System.out.println(d1);

        System.out.println(newInteger==i);
        System.out.println(i.equals(newInteger));
    }}
