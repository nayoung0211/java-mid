package lang.object.test;

public class RectangleMain {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(100,20);
        Rectangle r2 = new Rectangle(100,20);
        System.out.println(r);
        System.out.println(r2);
        System.out.println(r == r2);
        System.out.println(r.equals(r2));



    }

}
