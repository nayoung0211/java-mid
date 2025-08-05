package time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;

public class ZonedDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println(nowZdt);
        LocalDateTime ldt = LocalDateTime.of(2030,1,1,13,30,50);
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/seoul"));
        System.out.println(zonedDateTime1);

        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(2030, 1, 1, 13, 30, 50, 0,
            ZoneId.of("Europe/Berlin"));
        System.out.println(zonedDateTime2);

       ZonedDateTime utcZdt = zonedDateTime2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println(utcZdt);
    }

}
