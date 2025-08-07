package exception.basic.checked;

public class Client {

    public void call() throws MyCheckedException{
        //문제상황 새로운 예외 발생 예외도 객체
        throw new MyCheckedException("ex");
    }

}
