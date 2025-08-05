package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

    public static void main(String[] args) {
        LocalDateTime nowDt = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016,8,16,8,10,1);
        System.out.println(nowDt);
        System.out.println(ofDt);


        //날짜와 시간 분리
        LocalDate localdate = ofDt.toLocalDate();
        LocalTime localTime = ofDt.toLocalTime();
        System.out.println(localdate);
        System.out.println(localTime);

        //날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localdate, localTime);
        System.out.println(localDateTime);

        //계산
        LocalDateTime ofDtPlus = ofDt.plusDays(10);
        System.out.println(ofDtPlus);
        LocalDateTime ofDtPlusYear = ofDt.plusYears(1);
        System.out.println(ofDtPlusYear);
        LocalDateTime ofDtPlusMonth = ofDt.plusMonths(1);
        System.out.println(ofDtPlusMonth);
        LocalDateTime ofDtPlusWeek = ofDt.plusWeeks(1);
        System.out.println(ofDtPlusWeek);

        //비교
        System.out.println("현재 날짜 시간이 지정 날짜시간보다 이전인가?"+nowDt.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜시간보다 이후인가?"+nowDt.isAfter(ofDt));
        System.out.println(nowDt.isEqual(ofDt));


    }

}
