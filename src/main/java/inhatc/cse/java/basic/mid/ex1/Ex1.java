package main.java.inhatc.cse.java.basic.mid.ex1;

public class Ex1 {
    static void main(String[] args) {
        int amount = 120000;
        Level gold = Level.Gold;
        int point = (int)(amount * gold.getRate());
        System.out.println("적립 포인트 : " + point + "원");
    }
}