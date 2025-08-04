package enumeration.test;

public class AuthGradeMain1 {

    public static void main(String[] args) {
       AuthGrade[] grades = AuthGrade.values();
       for (AuthGrade grade : grades) {
           printGrade(grade);
       }

    }

    private static void printGrade(AuthGrade grade) {
        System.out.println(grade.name()+" "+grade.getLevel()+" "+grade.getDescription());
    }
}

