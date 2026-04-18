package main.java.inhatc.cse.java.basic.exam1.e_22;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;

public class MethodRefTest {
    static void main(String[] args) {
        Consumer<String> consume = System.out::println;
        IntBinaryOperator intbi = Integer::sum;
        Function<String,String> str = String::toUpperCase;

        consume.accept("Hello");
        System.out.println(intbi.applyAsInt(10,20));
        System.out.println(str.apply("java"));

// 1. Consumer<String> 으로 System.out::println 사용
        // 2. IntBinaryOperator 로 Integer::sum 사용
        // 3. Function<String,String> 으로 String::toUpperCase 사용
    }
}
