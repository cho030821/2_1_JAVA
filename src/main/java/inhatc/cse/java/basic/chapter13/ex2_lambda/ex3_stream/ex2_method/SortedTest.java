package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex2_method;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortedTest {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("파인애플", "사과", "귤","바나나");
        fruits.stream()
                .sorted()
                .limit(2)
                .forEach(str -> System.out.println(str+" "));

        System.out.println("");

        fruits.stream()
                .sorted(Comparator.comparingInt(String::length))
                .limit(2)
                .forEach(f -> System.out.println(f));
    }
}
