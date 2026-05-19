package main.java.inhatc.cse.java.basic.chapter16.ex1_basic;

public class ThreadTest {
    static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        myThread1.start();


        MyThread myThread2 = new MyThread();
        myThread2.start();

        System.out.println("끝");
    }
}
