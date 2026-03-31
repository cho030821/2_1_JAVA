    package main.java.inhatc.cse.java.basic.chapter13.ex1_innerclass.ex1_bank;

    public class Transaction {
        private int amount;

        public Transaction(int amount) {
            this.amount = amount;
        }

        // 1 & 2번 메서드 통합 및 수정: 직접 숫자를 받지 말고 객체를 통해 처리
        public void deposit(BankAccount account) {
            int currentBalance = account.getBalance();
            account.setBalance(currentBalance + amount); // 반드시 다시 저장해줘야 함
            System.out.println(account.getOwner() + " 계좌에 " + amount + "원 입금");
        }

        public void withdraw(BankAccount account) {
            int currentBalance = account.getBalance();
            if (currentBalance >= amount) {
                account.setBalance(currentBalance - amount);
                System.out.println(account.getOwner() + " 계좌에서 " + amount + "원 출금");
            } else {
                System.out.println("잔액이 부족합니다.");
            }
        }
    }