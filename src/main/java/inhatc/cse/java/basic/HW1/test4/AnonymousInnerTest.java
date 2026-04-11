package main.java.inhatc.cse.java.basic.HW1.test4;

public class AnonymousInnerTest {
    public static void main(String[] args) {
        Outer out = new Outer();

        // 1. 메서드 호출을 통해 생성된 익명 클래스 객체 실행
        Runnable runnable = out.getRunnable(10);
        runnable.run();

        // 2. 외부 클래스의 멤버 변수로 정의된 익명 클래스 객체 실행
        out.runner.run();
    }
}
