package enumeration.ref3;

public class DiscountService {

    public  int discount(Grade grade, int price) {
        return grade.discount(10000);
    }
}
