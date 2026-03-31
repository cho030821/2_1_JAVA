package main.java.inhatc.cse.java.basic.chapter13.ex1_innerclass.ex1_bank;

public class BankTest {
    static void main(String[] args) {
        BankAccount account = new BankAccount("홍길동",10000);
        Transaction t1 = new Transaction(3000);
        t1.deposit(account);
        account.printBalance();

        Transaction t2 = new Transaction(2000);
       // t2.withdraw();
        account.printBalance();


    }
}
