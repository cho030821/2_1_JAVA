package main.java.inhatc.cse.java.basic.ex2;

public class TestClient {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        CarMaker maker =  new HyundaiMaker();
        CarMaker maker1 = new KiaMaker();
        manager.setMaker(maker);
        manager.setMaker(maker1);
        manager.setMaker(maker);
        manager.order();

    }
}
