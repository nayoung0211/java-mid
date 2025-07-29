package lang.immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("seoul");
        Address b = new Address("seoul");//서로 다른 참조박스
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        b.setValue("busan");
        System.out.println("b = "+ b);
        System.out.println("a = "+ a);
    }
}
