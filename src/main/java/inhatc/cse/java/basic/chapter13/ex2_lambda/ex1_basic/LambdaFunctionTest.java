package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex1_basic;

import java.util.function.IntFunction;

public class LambdaFunctionTest {
    static void main(String[] args) {
        IntFunction intSum = x -> x + 10;
        System.out.println(intSum.apply(10));

    }
}
