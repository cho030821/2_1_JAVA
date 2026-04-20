package main.java.inhatc.cse.java.basic.exam3.ex26;

import java.util.*;

public class FilterTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 27, 7);
        // TODO: stream().filter().forEach() 사용
        numbers.stream()
                .filter(x -> x < 0 )
                .forEach(System.out::println);
    }
}
