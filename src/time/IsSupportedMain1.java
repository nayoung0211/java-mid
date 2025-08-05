package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain1 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int minute = date.get(ChronoField.SECOND_OF_MINUTE);
        System.out.println(minute);
    }

}
