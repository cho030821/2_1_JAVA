package main.java.inhatc.cse.java.basic.HW1.test2;

public class OutClass {
    private int num = 10;           // 외부 클래스의 인스턴스 변수 (Heap 영역)
    private static int sNum = 20;   // 외부 클래스의 정적 변수 (Method 영역)

    /**
     * 정적 내부 클래스 (Static Inner Class)
     * 외부 클래스의 인스턴스 생성 없이도 독립적으로 생성 및 사용 가능
     */
    static class InStaticClass {
        int inNum = 100;               // 내부 클래스의 인스턴스 변수
        static int sInNum = 200;       // 내부 클래스의 정적 변수

        // 1. 정적 내부 클래스의 일반 메서드
        void inTest() {
            // [오류] 외부 클래스의 인스턴스 변수(num)는 접근 불가
            // 이유: 외부 클래스가 생성되지 않은 상태에서도 이 메서드가 호출될 수 있기 때문
            // num += 10;

            System.out.println("InStaticClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
        }

        // 2. 정적 내부 클래스의 정적 메서드
        static void sTest() {
            // [오류] 외부 클래스의 인스턴스 변수(num) 접근 불가
            // num += 10;

            // [오류] 내부 클래스의 인스턴스 변수(inNum) 접근 불가
            // 이유: static 메서드는 객체 생성 없이 호출되므로 인스턴스 변수 사용이 불가능함
            // inNum += 10;

            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
            System.out.println("InStaticClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");
        }
    }
}