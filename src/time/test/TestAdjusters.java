package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        LocalDate localDate = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = localDate.getDayOfWeek();
        DayOfWeek lastDatOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();

        System.out.println(firstDayOfWeek);
        System.out.println(lastDatOfWeek);


    }

}
