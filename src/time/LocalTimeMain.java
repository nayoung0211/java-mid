package time;

import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(12, 34, 56);
        System.out.println(nowTime);
        System.out.println(ofTime);

        //계산
        ofTime = ofTime.plusHours(10);
        System.out.println(ofTime);
    }

}
