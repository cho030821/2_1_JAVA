package main.java.inhatc.cse.java.basic.exam.ex3__1;

public class StringBuilderTest {
    public static void main(String[] args) {
        // TODO: String + 연산으로 주소 변화 확인
        // TODO: StringBuilder로 append 후 주소 불변 확인
        // TODO: 최종 문자열 출력
        String st = "안녕";

        System.out.println("st의 주소"+System.identityHashCode(st));
        String splus= st+"디지몬";
        System.out.println("st + 문자열의 주소" + System.identityHashCode(splus) );
        StringBuilder SB = new StringBuilder("안녕");
        System.out.println("스트링 빌더 주소"+System.identityHashCode(SB));
        System.out.println("스트링 빌더 합친거 주소:"+ System.identityHashCode(SB.append(" 디지몬")));
        System.out.println(SB);


    }
}
