package main.java.inhatc.cse.java.basic.HW1.test1;

public class InnerTest {

        public static void main(String[] args) {
            // 외부 클래스 객체 생성
            OutClass outClass = new OutClass();

            System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
//            외부 클래스의 메서드를 통해 내부 클래스(InClass)의 메서드를 간접 호출
            outClass.usingClass();
            System.out.println();

//              내부 클래스가 'static' 키워드로 선언되지 않았더라도,
//              Java 16 버전 이후부터는 내부 클래스 안에 static 멤버를 가질 수 있습니다.
//
            System.out.println("인스턴스 내부 클래스 정적 변수 직접 호출 OutClass.InClass.sInNum = " + OutClass.InClass.sInNum);

//            외부 클래스의 인스턴스 생성 여부와 상관없이 '클래스명.내부클래스명.메서드명'으로 접근 가능
            OutClass.InClass.sTest();
        }

}
