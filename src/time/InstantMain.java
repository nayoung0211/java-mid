package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        //생성
        Instant now = Instant.now();//UTC
        System.out.println(now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println(from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println(epochStart);

        //계산
        Instant epochEnd = Instant.ofEpochSecond(Long.MAX_VALUE);
        System.out.println(epochEnd);
    }

}
