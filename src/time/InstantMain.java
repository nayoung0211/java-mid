package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        //생성,기계 중심 UTC기준
        Instant now = Instant.now();//UTC
        System.out.println(now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println(from);

        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println(epochStart);

        //계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println(later);

        //조회
        long epochSecond = later.getEpochSecond();
        System.out.println(epochSecond);
    }
}