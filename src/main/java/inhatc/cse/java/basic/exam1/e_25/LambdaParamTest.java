package main.java.inhatc.cse.java.basic.exam1.e_25;

public class LambdaParamTest {
    // TODO: static void showMyString(PrintString ps) — ps.showString("Hello") 호출
    // TODO: static PrintString returnString() — System.out::println 반환

    public static void main(String[] args) {
        PrintString ps = str -> System.out.println(str);

        showMyString(ps);
        PrintString returned = returnString();
        returned.showString("World");
    }

    private static void showMyString(PrintString ps) {
       ps.showString("Hello");
    }

    static PrintString returnString() {
        return System.out::println;
    }

}