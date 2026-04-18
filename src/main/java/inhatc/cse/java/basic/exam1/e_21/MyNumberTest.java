package main.java.inhatc.cse.java.basic.exam1.e_21;

public class MyNumberTest {
    static void main(String[] args) {
        MyNumber number = (a,b) -> a>=b ? a:b;
        System.out.println("max : "+number.getMax(80,100));

    }
}
