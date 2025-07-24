package lang.object;

//아무것도 상속받지 않으면 묵시적으로 오브젝트를 상속 받고 부모를 상속 받았으면 상속 받지 않음
public class Child extends Parent{

    public void childMethod(){
        System.out.println("Child.childMethod");
    }
}
