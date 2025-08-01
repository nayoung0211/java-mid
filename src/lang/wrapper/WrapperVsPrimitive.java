package lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000;//반복횟수
        long startTime, endTime;

        long sumPrimitive  = 0;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumPrimitive);
        System.out.println((endTime - startTime));

        //래퍼 클래스 사용 오래 걸림
        Long sumWrapper  = 0L;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println(sumWrapper);
        System.out.println((endTime - startTime));
    }
}
