package main.java.inhatc.cse.java.basic.HW1.test3;

public interface LocalInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();
        Runnable runner = out.getRunnable(10); // 메서드 호출
        runner.run();
    }
}
