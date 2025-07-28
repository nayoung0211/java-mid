package lang.object.tostring;

public class ObjectPrinter {
    //오브젝트만 사용해서 변경할 필요가 없음
    public static void print(Object obj) {
        String string = "객체 정보 출력: "+obj.toString();
        System.out.println(string);
    }

}
