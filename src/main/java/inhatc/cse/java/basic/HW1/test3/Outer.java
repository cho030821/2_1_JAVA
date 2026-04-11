package main.java.inhatc.cse.java.basic.HW1.test3;

/**
 * 외부 클래스
 */
class Outer {
    int outNum = 100;        // 외부 클래스의 인스턴스 변수
    static int sNum = 200;   // 외부 클래스의 정적(클래스) 변수

    // Runnable 인터페이스를 구현한 객체를 생성하여 반환하는 메서드
    Runnable getRunnable(int i) { // 매개변수 i (지역 변수와 동일한 특성)
        int num = 100;            // 지역 변수
        /*
         * [지역 내부 클래스]
         * 메서드 내부에 정의된 클래스로, 해당 메서드 안에서만 사용 가능
         */
        class MyRunnable implements Runnable {
            int localNum = 10;    // 내부 클래스의 인스턴스 변수

            @Override
            public void run() {
                // num = 200; // 에러: 지역 변수는 상수화되므로 값 변경 불가
                // i = 100;   // 에러: 매개변수도 지역 변수처럼 상수화되어 값 변경 불가
                // 1. 매개변수 i 출력
                System.out.println("i = " + i);

                // 2. 메서드 지역 변수 num 출력
                System.out.println("num = " + num);

                // 3. 내부 클래스 자신의 변수 출력
                System.out.println("localNum = " + localNum);

                // 4. 외부 클래스의 인스턴스 변수 접근 (외부 객체가 살아있는 한 접근 가능)
                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");

                // 5. 외부 클래스의 정적 변수 접근 (언제든 접근 가능)
                System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스 정적 변수)");
            }
        }

        // 생성된 내부 클래스 객체를 반환 (이때 getRunnable 메서드는 스택에서 종료됨)
        return new MyRunnable();
    }
}

