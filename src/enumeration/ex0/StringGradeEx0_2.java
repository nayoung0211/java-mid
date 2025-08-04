package enumeration.ex0;

public class StringGradeEx0_2 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountService discountService = new DiscountService();

        //존재하지 않는 등급
        int vip = discountService.discount("VIP", price);
        System.out.println(vip);

        //오타
        int basic =  discountService.discount("BASICC", price);
        System.out.println(basic);

        //소문자 입력
        int gold = discountService.discount("gold", price);
        System.out.println(gold);

        int diamond = discountService.discount("DIAMOND", price);
        System.out.println(diamond);

    }
}
