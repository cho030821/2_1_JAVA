package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex2_param;

public class LambdaTest {
    static void main(String[] args) {
        IPrintString ps = str -> System.out.println(str);
        ps.showString("람다식");

        showMyString(ps);

        IPrintString rePS = returnString();
        rePS.showString("World");

    }

    private static IPrintString returnString() {
        return str -> System.out.println(str);
    }

    private static void showMyString(IPrintString ps) {
        ps.showString("Hello");
    }

}
