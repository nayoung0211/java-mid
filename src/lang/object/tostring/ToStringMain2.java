package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("BMW");
        Dog dog1 = new Dog("dog1",1);
        Dog dog2 = new Dog("dog2",2);

        System.out.println("1.단순 호출");
        System.out.println(car.toString());//기본으로 제공하는 참조값이 나옴
        System.out.println(dog1.toString());//오버라이딩함
        System.out.println(dog2.toString());

        System.out.println("1.내부 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("1.Object");
       ObjectPrinter.print(car);
       ObjectPrinter.print(dog1);
       ObjectPrinter.print(dog2);

       String refValue = Integer.toHexString(System.identityHashCode(dog1)); //참조값
        System.out.println(refValue);
        String refValue2 = Integer.toHexString(System.identityHashCode(dog2)); //참조값
        System.out.println(refValue2);
    }
}
