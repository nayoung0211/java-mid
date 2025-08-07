package exception.basic.checked;

public class Service {
    Client client = new Client();
    /**
     * 예외를 잡아서 처리하는 코드 catch 로 잡은 뒤로는 정상처리 됨
     */
    public void callCatch(){
        try {
            client.call();
            //Exception = MyCheckedException 이라 바꿔도 된다 (자식들 전부 커버 가능)
        }catch (MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리 ,message : " + e.getMessage());
        }
        System.out.println("정상흐름");
        }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야한다.
     * 던질때도 Exception 사용 가능(바꿀거면 한번에 다 바꿔야함)
     */
    public void catchThrow() throws MyCheckedException{
        client.call();
        }
    }

