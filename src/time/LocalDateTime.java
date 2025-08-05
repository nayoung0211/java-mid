package time;

import java.time.LocalDate;

public class LocalDateTime {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2018, 1, 1);
        System.out.println(nowDate);
        System.out.println(ofDate);

        //계산(불변) 반환값은 자기 자신으로 바꿔도 됨
        ofDate = ofDate.plusDays(10);
        System.out.println(ofDate);
    }
}
