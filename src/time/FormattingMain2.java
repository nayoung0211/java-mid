package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

    public static void main(String[] args) {
        //포맷팅 : 날짜와 시간을 문자로
        LocalDateTime now = LocalDateTime.of(2018, 1, 1, 1, 1);
        System.out.println(now);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String nowString = now.format(formatter);
        System.out.println(nowString);

        //파싱 : 문자와 날짜를 시간으로
        String input = "2030-01-01 11:30:00";
        LocalDateTime parse = LocalDateTime.parse(input, formatter);
        System.out.println(parse);
    }
}
