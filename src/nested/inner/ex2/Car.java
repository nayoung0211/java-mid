package nested.inner.ex2;

public class Car {

    //car 에서만 사용하는 메서드
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {
        public void start(){
            System.out.println("충전 레벨 확인 : "+chargeLevel);
            System.out.println(model+"의 엔진을 구동합니다.");
        }
    }
}
