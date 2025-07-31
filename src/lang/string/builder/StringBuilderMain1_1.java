package lang.string.builder;

public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");//계속 넣음
        sb.append("b");
        sb.append("c");
        sb.append("d");
        System.out.println(sb);

        sb.insert(4, "Java");
        System.out.println(sb);

        sb.delete(4, 8);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println(string);
    }

}
