package main.java.inhatc.cse.java.basic.exam.ex5;

public class RecordTest {
    public static void main(String[] args) {
        Result r = new Result("홍길동", 95);
        System.out.println(r);
        System.out.println(r.name());
        System.out.println(r.score());
    }
}