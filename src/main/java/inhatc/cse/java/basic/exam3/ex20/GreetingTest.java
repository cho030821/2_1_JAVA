package main.java.inhatc.cse.java.basic.exam3.ex20;

public class GreetingTest {
    public static void main(String[] args) {
        // TODO: 람다식으로 Greeting 구현 후 greet("홍길동") 호출
    Greeting greet = g -> System.out.println("안녕하세요 " + g+"님");
    greet.greeting("홍길동");
    }
}