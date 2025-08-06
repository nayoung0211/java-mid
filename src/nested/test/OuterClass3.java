package nested.test;

public class OuterClass3 {
    public void myMethod(){

        //지역 클래스 정의하고
        class LocalClass {
            public void myMethod(){
                System.out.println("LocalClass.myMethod");
            }
        }
        //생성하고 바로 호출
        LocalClass localClass = new LocalClass();
        localClass.myMethod();
    }
}
