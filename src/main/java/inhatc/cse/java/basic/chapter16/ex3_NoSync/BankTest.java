package main.java.inhatc.cse.java.basic.chapter16.ex3_NoSync;

public class BankTest {
    public static Bank mybank = new Bank();

    static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName());

        Park park = new Park();
        park.start();

        Thread.sleep(200);

        ParkWife parkWife = new ParkWife();
        parkWife.start();
    }
}