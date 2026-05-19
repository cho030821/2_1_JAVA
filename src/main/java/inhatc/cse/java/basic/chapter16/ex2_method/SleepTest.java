package main.java.inhatc.cse.java.basic.chapter16.ex2_method;

public class SleepTest extends Thread{
    static void main(String[] args) {
        SleepTest st = new SleepTest();
        st.start();

    }

    @Override
    public void run() {
        for (int i = 1; i < 11; i++) {
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(i + " ");


        }
    }
}
