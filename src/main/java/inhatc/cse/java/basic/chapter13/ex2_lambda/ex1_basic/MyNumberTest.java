package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex1_basic;

public class MyNumberTest {
    static void main(String[] args) {
        MyNumber m1 = new MyNumber() {
            @Override
            public int getMax(int x, int y) {
                return x >= y ? x : y;
            }
        };
        int max1 = m1.getMax(4,5);
        System.out.println(max1);

        MyNumber m2 = (x, y) -> x >= y ? x : y;
            int max2 = m2.getMax(100,80);
        System.out.println(max2);
    }
}
