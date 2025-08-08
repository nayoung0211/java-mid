package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    public boolean sendError;


    public NetworkClientV3(String address) {
        this.address = address;
    }
    public String connect() throws NetworkClientExceptionV3 {
        if(connectError) {
            throw new ConnectExceptionV3(address,address+"서버 연결 실패");
        }
        //연결 성공
        System.out.println(address+"서버연결성공");
        return "success";
    }

    public String send(String data) throws NetworkClientExceptionV3 {
        if(sendError) {
            throw new SendExceptionV3(data,address+"데이터 전송 실패 : "+data);
            //중간에 다른 예외가 발생했다고 가정
            //throw new RuntimeException("ex");
        }
        //전송성공
        System.out.println(address+"서버에 데이터 전송"+data);
        return "success";
    }
    public void disconnect(){
        System.out.println(address+" 서버 연결 해제");
    }

    public void initError(String data){
        if(data.contains("error1")){
            connectError = true;
        }
        if(data.contains("error2")){
            sendError = true;
        }
    }
}
