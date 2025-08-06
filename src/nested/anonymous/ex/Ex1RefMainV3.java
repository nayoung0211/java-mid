package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {
    public static void hello(Process process) {
        System.out.println("program started");

        process.run();

        System.out.println("program finished");
    }
    public static void main(String[] args) {

        Process dice = new Process(){

            @Override
            public void run() {
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("dice = " + randomValue);
            }
        };
        Process sum = new Process(){

            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
                //코드 조각 종료
            }
        };
       hello(dice);//구현체
       hello(sum);
    }
}
