package time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {

    public static void main(String[] args) {
        //생성
        Period period = Period.ofDays(10);
        System.out.println("period = " + period);

        //계산에 사용 가능
        LocalDate localDate = LocalDate.of(2030, 1, 1);
        LocalDate plusDate = localDate.plus(period);
        System.out.println("localDate = " + localDate);
        System.out.println("plusDate = " + plusDate);

        //기간 차이
        LocalDate startDate = LocalDate.of(2030, 1, 1);
        LocalDate endDate = LocalDate.of(2030, 12, 31);
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between.getMonths()+" "+between.getDays());

    }

}
