    package main.java.inhatc.cse.java.basic.chapter13.ex1_innerclass.ex1_bank;

    public class Transaction {
        private int amount;

        public Transaction(int amount) {
            this.amount = amount;
        }

        public void deposit(int balance, String owner) {
            balance += amount;
            System.out.println(owner + " 계좌에 " + amount + "원 입금");
        }

        public void withdraw(int balance, String owner) {
            balance -= amount;
            System.out.println(owner + " 계좌에서 " + amount + "원 출금");
        }
    }