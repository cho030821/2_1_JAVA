package main.java.inhatc.cse.java.basic.exam.ex6;

public class BoxTest {
    public static void main(String[] args) {
        Box<String> strBox = new Box<>();
        strBox.set("자바");
        System.out.println(strBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println(intBox.get());
    }
}