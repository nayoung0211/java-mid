package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("BMW");
        Dog dog1 = new Dog("dog1",1);
        Dog dog2 = new Dog("dog2",2);

        System.out.println("1.단순 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("1.내부 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);
    }

}
