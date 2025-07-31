package lang.string.builder;

public class LoopStringBuilderMain {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<10000; i++) {
           sb.append("Hello Java");
        }
        long endTime = System.currentTimeMillis();
        String result = sb.toString();
        System.out.println(result);
        System.out.println(endTime - startTime);
    }

}
