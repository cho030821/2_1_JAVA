package main.java.inhatc.cse.java.basic.HW1.test2;

 public class InnerTest {
    public static void main(String[] args) {

        // 외부 클래스를 생성하지 않고 바로 정적 내부 클래스 생성 가능
        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();

        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();

        System.out.println();

        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        // 보통 정적 메서드는 객체 변수(sInClass)보다는 클래스 이름으로 직접 호출하는 것이 정석입니다.
        OutClass.InStaticClass.sTest();
    }
}

