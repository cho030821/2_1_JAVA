package main.java.inhatc.cse.java.basic.HW1.test1;

public class OutClass {                              // 외부 클래스
    private int num = 10;                     // 외부 클래스의 인스턴스 변수 (내부 클래스에서 접근 가능)
    private static int sNum = 20;             // 외부 클래스의 정적 변수 (내부 클래스에서 접근 가능)

    private InClass inClass;                  // 내부 클래스 타입의 참조 변수 선언

    public OutClass() {
        // 내부 클래스는 외부 클래스가 생성된 이후에만 생성할 수 있음
        inClass = new InClass();
    }

    // 인스턴스 내부 클래스: 외부 클래스의 인스턴스 생성 후 사용 가능
    class InClass {
        int inNum = 100;                      // 내부 클래스의 인스턴스 변수

        // 정적 변수: 원래는 static 클래스에서만 가능했으나, Java 16부터 인스턴스 내부 클래스에서도 허용됨
        static int sInNum = 200;

        void inTest() {
            // 외부 클래스의 private 변수와 정적 변수에 직접 접근 가능
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수)");

            // 내부 클래스 자신의 정적 변수 접근
            System.out.println("OutClass sInNum = " + sInNum + "(인스턴스 내부 클래스의 정적 변수)");
        }

        // 정적 메서드: Java 16부터 인스턴스 내부 클래스 내 선언 가능
        static void sTest() {
            System.out.println("인스턴스 내부 클래스의 정적 메서드 호출");
        }
    }

    // 외부에서 내부 클래스의 기능을 간접적으로 호출하기 위한 메서드
    public void usingClass() {
        inClass.inTest();
    }
}
