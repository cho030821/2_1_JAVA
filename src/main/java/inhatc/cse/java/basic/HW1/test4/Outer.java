package main.java.inhatc.cse.java.basic.HW1.test4;

public class Outer {
    // 1. 메서드 내부에서 익명 클래스 사용하기
    Runnable getRunnable(int i) {
        int num = 100; // 지역 변수

        // 클래스 이름 없이 바로 new Runnable()을 호출하며 구현부를 작성
        return new Runnable() {
            @Override
            public void run() {
                // [중요] 이전 예제와 마찬가지로 지역 변수와 매개변수는 변경 불가 (상수화)
                // num = 200; // 오류 발생
                // i = 10;    // 오류 발생

                System.out.println("매개변수 i = " + i);
                System.out.println("지역 변수 num = " + num);
            }
        }; // 익명 클래스 정의가 끝나는 지점에 세미콜론(;)을 반드시 붙여야 함
    }

    // 2. 외부 클래스의 멤버 변수에 익명 클래스 대입하기
    // 클래스를 따로 만들지 않고 인터페이스나 추상 클래스형 변수를 선언하면서 즉시 생성
    Runnable runner = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    }; // 변수 대입 식이므로 문장 끝에 ;를 씀
}
