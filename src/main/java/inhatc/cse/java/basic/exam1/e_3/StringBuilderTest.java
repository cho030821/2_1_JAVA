package main.java.inhatc.cse.java.basic.exam1.e_3;

public class StringBuilderTest {
    static void main(String[] args) {
        String str = "Java";
        System.out.println("주소 1 :" + System.identityHashCode(str));
//        String str = "AND";
        System.out.println("주소 1 :" + System.identityHashCode(str));

    }
}
