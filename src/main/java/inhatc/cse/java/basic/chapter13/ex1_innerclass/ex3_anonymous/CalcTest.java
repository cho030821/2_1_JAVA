package main.java.inhatc.cse.java.basic.chapter13.ex1_innerclass.ex3_anonymous;

public class CalcTest {
    static void main(String[] args) {
        ICalc calc = (a,b) -> a + b;
        calc.add(2,3);
    }

}
