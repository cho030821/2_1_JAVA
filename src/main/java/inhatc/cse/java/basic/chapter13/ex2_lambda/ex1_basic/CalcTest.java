package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex1_basic;

public class CalcTest {
    static void main(String[] args) {
        ICalc calc2 = (x, y) -> x + y;

        int sum2 = calc2.add(15,25);
        System.out.println("합계 : "+ sum2);
    }
}
