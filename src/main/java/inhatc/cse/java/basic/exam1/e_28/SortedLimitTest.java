package main.java.inhatc.cse.java.basic.exam1.e_28;

import java.util.*;

public class SortedLimitTest {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("파인애플", "사과", "귤", "바나나");
        // TODO: stream().sorted(Comparator.comparingInt(...)).limit(2).forEach()
        fruits.stream()
                .sorted(Comparator.comparingInt(String::length))
                .limit(3)
                .forEach(System.out::println);

    }
}