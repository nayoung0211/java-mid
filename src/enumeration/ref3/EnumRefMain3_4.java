package enumeration.ref3;

public class EnumRefMain3_4 {

    public static void main(String[] args) {
        int price = 10000;
        //회원을 추가해도 수정할 필요가 없는 코드
        Grade[] values = Grade.values(); //Grade 안의 모든 값을 가지고 온다 배열로 담아서
        //for 문으로 하나씩 넣어주면서 프린트하기
        for(Grade grade : values) {
            printDiscount(grade,price);
        }
    }
    private static void printDiscount(Grade grade,int price) {
        System.out.println(grade.name()+"등급의 할인 금액 : "+grade.discount(price));
    }
}
