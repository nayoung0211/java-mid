package lang.immutable.address;

public class RefMain1_3 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("seoul");
        Address b = a;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        change(b,"busan");
        System.out.println("b = "+ b);
        System.out.println("a = "+ a);
    }
    private static void change(Address address,String changeAddress) {
        System.out.println("changeAddress = "+ changeAddress);
        address.setValue(changeAddress);
    }
}
