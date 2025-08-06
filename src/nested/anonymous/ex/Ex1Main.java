package nested.anonymous.ex;

import java.util.Random;

public class Ex1Main {
    public static void helloDice(){
        System.out.println("program started");

        //코드 조각 시작
        int randomValue = new Random().nextInt(6)+1;
        System.out.println("dice = "+randomValue);
        //코드 조각 종료

        System.out.println("program finished");

    }
    public static void helloSum(){
        System.out.println("program started");

        //코드 조각 시작
       for(int i = 0; i<3; i++){
           System.out.println("i = "+i);
       }
        //코드 조각 종료

        System.out.println("program finished");
    }
    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
