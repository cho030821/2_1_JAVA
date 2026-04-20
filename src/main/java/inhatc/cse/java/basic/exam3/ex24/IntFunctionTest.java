package main.java.inhatc.cse.java.basic.exam3.ex24;

import java.util.function.IntFunction;

public class IntFunctionTest {
    public static void main(String[] args) {
        // TODO: IntFunction<String> label 정의
        IntFunction<String> label = x ->x+"번 학생";
        for (int i = 1; i <= 3; i++) {
            System.out.println( label.apply(i));
        }
    }
}