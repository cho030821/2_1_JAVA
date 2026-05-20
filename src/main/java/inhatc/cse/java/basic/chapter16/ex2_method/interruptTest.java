package main.java.inhatc.cse.java.basic.chapter16.ex2_method;

public class interruptTest extends Thread {
    static void main(String[] args) throws InterruptedException {
        interruptTest it = new interruptTest();
        it.start();
        Thread.sleep(50);
        it.interrupt();
    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                sleep(10);
                System.out.print(i + " ");
            } catch (InterruptedException e) {
                System.out.println("인터럽트 발생");
            }
        }
        System.out.println("종료");
    }
}
