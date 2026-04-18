package main.java.inhatc.cse.java.basic.exam1.e_17;

public class Car {
    // TODO: static class Engine { void start() }
    static class Engine {
        void start(){
            System.out.println("엔진 시동!");
        }
    }
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine();
        engine.start();
    }
}
