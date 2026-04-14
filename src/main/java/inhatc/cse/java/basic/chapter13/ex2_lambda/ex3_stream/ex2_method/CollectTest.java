package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex2_method;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectTest {
    static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, -10, -22, 0, 47, 7 ,8 );
        Predicate<Integer> isNegative = i -> i <0;

        List<Integer> collect = list.stream()
                .filter(isNegative)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<Integer> list1 = list.stream()
                .filter(x -> x >=0)
                .sorted()
                .toList();
        System.out.println(list1);

        long count =list.stream()
                .filter(x -> x % 2 == 0)
                .count();
        System.out.printf("짝수의 개수 : %d 개 입니다" , count);

    }
}
