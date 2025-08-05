package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween2 {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.of(2025, 11, 8);

        Period period = Period.between(startDate, endDate);
        long between = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("남은 기간 : "+period.getYears()+"년 ,"+period.getMonths()+"개월, "+period.getDays()+"일");
        System.out.println(between);

    }
}
