package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        InnerOuter inner = new InnerOuter();
        //단독으로 생성 불가능 바깥 인스턴스가 있어야 그 안에만 생성 가능하다
        InnerOuter.Inner inner1 = inner.new Inner();
        inner1.print();

        System.out.println("innerClass="+inner1.getClass());
    }
}
