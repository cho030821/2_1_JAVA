package main.java.inhatc.cse.java.basic.exam1.e_18;

public class Calculator {
    void operate(int a, int b) {
        // TODO: 메서드 안에 LocalAdder 지역 내부클래스 정의 (add() 메서드)
        // TODO: LocalAdder 객체 생성 후 add() 호출
        class LocalAdder{
            int add(){
                return a + b;

            }
        }
        LocalAdder adder =  new LocalAdder();
        System.out.println("합계 :" + adder.add());
    }

    public static void main(String[] args) {
        new Calculator().operate(10, 20);

    }
}