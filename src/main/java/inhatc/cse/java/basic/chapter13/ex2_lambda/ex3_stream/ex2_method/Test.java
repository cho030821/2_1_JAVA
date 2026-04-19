package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex2_method;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Test {
    static void main(String[] args) {
        List<String> list = Arrays.asList("김철수ㄴㅇㄹ", "박평식ㄴ","박형","나");
        list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
     }
}
