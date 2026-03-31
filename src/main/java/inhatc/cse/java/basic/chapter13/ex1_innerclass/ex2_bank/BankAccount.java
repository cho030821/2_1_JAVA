package main.java.inhatc.cse.java.basic.chapter13.ex1_innerclass.ex2_bank;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }



    public void printBalance(){
        System.out.println("현재 잔액 : " + balance+ "원");
    }
    class Transaction {
        private int amount;

        public Transaction(int amount) {
            this.amount = amount;
        }

        public void deposit(){
            balance += amount;
            System.out.println(owner+ " 계좌에 "+ amount+"원 입급");
        }

        public void withdraw(){
            balance -= amount;
            System.out.println(owner + " 계좌에서 " + amount +"원 출금");

        }

    }
}
