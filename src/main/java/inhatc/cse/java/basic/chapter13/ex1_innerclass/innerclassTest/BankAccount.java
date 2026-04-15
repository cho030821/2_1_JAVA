package main.java.inhatc.cse.java.basic.chapter13.ex1_innerclass.innerclassTest;

public class BankAccount {
    private int money;
    private String name;

    public BankAccount(int money, String name) {
        this.money = money;
        this.name = name;
    }

    class Transaction{
        private int balance;

        public Transaction(int balance){
            this.balance = balance;

        }

        public void deposit(){
            money = money + balance;
            System.out.println(balance+ "원 입금");
            System.out.println("현재 잔액 : " + money);

        }
        public void withdraw(){
            money = money - balance;
            System.out.println(balance+ "원 출금");

        }
    }
}
