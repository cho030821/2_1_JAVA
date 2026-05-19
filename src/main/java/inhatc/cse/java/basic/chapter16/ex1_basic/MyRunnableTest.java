package main.java.inhatc.cse.java.basic.chapter16.ex1_basic;

public class MyRunnableTest {
    static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        t1.start();
        t2.start();

    }
}
