package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {

        ImmutableAddress immutableAddress = new ImmutableAddress("서울");

        MemberV2 memberA = new MemberV2("회원A", immutableAddress);
        MemberV2 memberB = new MemberV2("회원B", immutableAddress);

        //회원A, 회원B의 처음 주소는 모두 서울

        System.out.println("memberA = " + memberA);
        System.out.println("memberB = " + memberB);

        //회원B의 주소를 부산으로 변경해야함
        memberB.setAddress(new ImmutableAddress("busan"));//새로운 객체 생성 후 값 대입
        System.out.println("memberA = " + memberA);//seoul
        System.out.println("memberB = " + memberB);//busan
    }
}