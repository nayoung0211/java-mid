package time;

import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {

    public static void main(String[] args) {
        OffsetDateTime nowZdt = OffsetDateTime.now();
        System.out.println(nowZdt);
        LocalDateTime ldt = LocalDateTime.of(2030,1,1,13,30,50);
        System.out.println(ldt);
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println(odt);
    }
}
