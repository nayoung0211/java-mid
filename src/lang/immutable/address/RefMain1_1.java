package lang.immutable.address;

public class RefMain1_1 {

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("서울");
        Address b = a;//참조값 주소가 복사됨
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        b.setValue("busan");//같은 참조값 안의 박스의 내용 변경
        System.out.println("b = "+ b);
        System.out.println("a = "+ a);
    }
}
