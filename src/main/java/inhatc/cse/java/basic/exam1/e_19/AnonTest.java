package main.java.inhatc.cse.java.basic.exam1.e_19;

public class AnonTest {
    static void main(String[] args) {
        ICalc calc = (a,b) -> a + b;
        ICalc calc2 = new ICalc() {
            @Override
            public int add(int x, int y) {
                return 0;
            }
        };
        int sum = calc.add(10,20);
        int sum2 = calc.add(10,20);
        System.out.println("익명 : " + sum2);
        System.out.println("람다 : "+sum);    

    }
}
