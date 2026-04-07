package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex2_method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterTest {
    static void main(String[] args) {
        List<Integer> members = Arrays.asList(5, 10, -13, 14, -12, 7);
        Predicate<Integer> isPositive = x -> x > 0;
        members.stream()
                .filter(isPositive)
                .forEach(System.out::println);

    }
}
