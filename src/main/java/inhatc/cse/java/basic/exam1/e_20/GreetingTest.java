package main.java.inhatc.cse.java.basic.exam1.e_20;

public class GreetingTest {
    static void main(String[] args) {
        Greeting greeting = a -> System.out.println("안녕하세요 "+a+"님");

        greeting.greet("홍길동");
    }
}
