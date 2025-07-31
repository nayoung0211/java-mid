package lang.string.method;

public class StringSplitJoinMain {

    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split()
        String[] split = str.split(",");
        for(String s : split) {
            System.out.println(s);
        }
        String join = String.join("-", "A", "B", "C");
        System.out.println(join);

        //문자열 배열 연결
        String joined = String.join("-", split);
        System.out.println(joined);


    }

}
