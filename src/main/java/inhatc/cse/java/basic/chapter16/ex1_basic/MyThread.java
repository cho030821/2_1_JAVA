package main.java.inhatc.cse.java.basic.chapter16.ex1_basic;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <200; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);


        }
    }
}
