package main.java.inhatc.cse.java.basic.exam3.ex21;

public class MyNumberTest {
    public static void main(String[] args) {
        // TODO: 람다식으로 MyNumber 구현 후 getMax(80, 100) 출력

        MyNumber num = (x,y) -> x >= y ? x:y;
        System.out.println("max : " + num.getMax(80,100));
    }
}
