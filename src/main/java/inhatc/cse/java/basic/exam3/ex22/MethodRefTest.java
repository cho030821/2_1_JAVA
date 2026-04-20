package main.java.inhatc.cse.java.basic.exam3.ex22;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class MethodRefTest {
    public static void main(String[] args) {
        // 1. Consumer<String> 으로 System.out::println 사용
        // 2. IntBinaryOperator 로 Integer::sum 사용
        // 3. Function<String,String> 으로 String::toUpperCase 사용
        Consumer<String> cons = System.out::println;
        IntBinaryOperator sum = Integer::sum;
        Function<String,String> upper = String::toUpperCase;
        cons.accept("Hello");
        System.out.println(sum.applyAsInt(10,20));
        System.out.println(upper.apply("java"));



    }
}
