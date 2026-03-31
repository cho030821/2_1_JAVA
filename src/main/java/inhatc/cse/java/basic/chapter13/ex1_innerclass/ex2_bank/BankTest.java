package main.java.inhatc.cse.java.basic.chapter13.ex1_innerclass.ex2_bank;



public class BankTest {
    static void main(String[] args) {
        BankAccount account = new BankAccount("손흥민",10000);
        BankAccount.Transaction t1 = account.new Transaction(3000);
        t1.deposit();
        account.printBalance();

        BankAccount.Transaction t2 = account.new Transaction(2000);
        t2.withdraw();
        account.printBalance();



    }
}
