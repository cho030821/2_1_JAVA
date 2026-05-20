package main.java.inhatc.cse.java.basic.chapter16.ex3_NoSync;

public class Bank {
    private int money = 10000;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void saveMoney(int save) {
        int m = getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        setMoney(m + save);
    }
    public void MinusMoney(int minus) {
        int m = getMoney();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
        }
        setMoney(m - minus);
    }
}
