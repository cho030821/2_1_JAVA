package main.java.inhatc.cse.java.basic.chapter16.ex3_NoSync;

public class ParkWife extends Thread {
    @Override
    public void run() {
        System.out.println("박씨 부인 출금 시작...");
        BankTest.mybank.MinusMoney(1000);
        System.out.println("1000원 출금 후 잔액 : " + BankTest.mybank.getMoney());
    }

}
