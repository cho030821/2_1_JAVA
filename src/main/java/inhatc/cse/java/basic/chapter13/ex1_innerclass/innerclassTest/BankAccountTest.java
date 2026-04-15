package main.java.inhatc.cse.java.basic.chapter13.ex1_innerclass.innerclassTest;

import javax.xml.crypto.dsig.TransformService;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount bank1 = new BankAccount(100000,"홍길동");
        BankAccount bank2 = new BankAccount(200000,"조재균");
        BankAccount bank3 = new BankAccount(300000,"김민호");

        BankAccount.Transaction trans1 = bank1.new Transaction(1000);
        BankAccount.Transaction trans2 = bank1.new Transaction(2000);
        BankAccount.Transaction trans3 = bank1.new Transaction(3000);

        trans1.deposit();
        trans1.deposit();
        trans1.deposit();
        trans1.withdraw();
        trans2.withdraw();
        trans2.withdraw();
        trans2.withdraw();
        trans2.deposit();

    }
}
