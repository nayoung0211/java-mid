package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("program started");

        process.run();

        System.out.println("program finished");
    }

    public static void main(String[] args) {

       hello(() -> {
           int randomValue = new Random().nextInt(6) + 1;
           System.out.println("dice = " + randomValue);
       });
       hello(() -> {
           for (int i = 0; i < 3; i++) {
               System.out.println("i = " + i);
           }
       });
    }
}
