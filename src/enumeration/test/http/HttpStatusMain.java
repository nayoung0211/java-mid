package enumeration.test.http;

import java.util.Scanner;

public class HttpStatusMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter HTTP status code : ");
        int codeInput = sc.nextInt();

        HttpStatus status = HttpStatus.findByCode(codeInput);
        if(status == null){
            System.out.println("Invalid HTTP status code");
        }else{
            System.out.println(status.getCode()+" "+status.getMessage());
            System.out.println(status.isSuccess());
        }
    }
}
