package main.java.inhatc.cse.java.basic.chapter16.ex3_NoSync;

public class Park extends Thread {
    @Override
    public void run() {
        System.out.println("박씨 예금 시작...");
        BankTest.mybank.saveMoney(3000);
        System.out.println("3000원 입금 후 잔액 : " + BankTest.mybank.getMoney());


    }
}
