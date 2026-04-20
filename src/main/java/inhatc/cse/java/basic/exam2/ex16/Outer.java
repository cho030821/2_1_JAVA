package main.java.inhatc.cse.java.basic.exam2.ex16;

public class Outer {
    String msg = "안녕하세요";
    class Inner{
        public void printMsg(){
            System.out.println(msg);
        }
    }
    // TODO: Inner 클래스 정의 — printMsg() 메서드에서 msg 출력

    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.printMsg();
    }
}