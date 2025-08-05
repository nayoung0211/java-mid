package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportedMain2 {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        boolean suppoerted = date.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println(suppoerted);

        //지원시에만 출력하기
        if(suppoerted) {
            int minutes = date.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println(minutes);
        }
    }
}
