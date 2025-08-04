package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of grade [GUEST,LOGIN,ADMIN]");
        String grade = sc.nextLine();

        AuthGrade authGrade = AuthGrade.valueOf(grade.toUpperCase());//뭐가 입력되든 대문자로 바꿈
        System.out.println("당신의 등급은 : "+authGrade.getDescription()+"입니다.");

        //중복으로 볼 수 있게 하려면 전부 if를 쓴다
        System.out.println("==menu==");
        if(authGrade.getLevel() > 0){
            System.out.println("Main");
        }if(authGrade.getLevel() > 1){
            System.out.println("Email");
        }if(authGrade.getLevel() > 2){
            System.out.println("admin");
        }
    }
}
