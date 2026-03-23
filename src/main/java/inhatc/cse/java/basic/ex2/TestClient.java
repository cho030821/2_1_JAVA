package inhatc.cse.java.basic.ex2;

public class TestClient {
    public static void main(String[] args) {
        OrderManager manager = new OrderManager();
        CarMaker maker =  new HyundaiMaker();
        manager.setMaker(maker);

        manager.order();
    }
}
