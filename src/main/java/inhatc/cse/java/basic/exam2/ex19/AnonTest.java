package main.java.inhatc.cse.java.basic.exam2.ex19;

public class AnonTest {
    public static void main(String[] args) {
        // TODO: 익명 내부클래스로 ICalc 구현
        // TODO: 람다식으로 ICalc 구현
        ICalc calc = new ICalc() {
            @Override
            public int add(int x, int y) {
                return x+y;
            }
        };
        System.out.println("익명 : " + calc.add(10,20));

        ICalc calc2 = (x,y) -> x + y;
        System.out.println("람다 : " +calc2.add(10,20));
    }
}