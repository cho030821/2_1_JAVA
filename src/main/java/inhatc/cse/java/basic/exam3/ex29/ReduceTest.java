package main.java.inhatc.cse.java.basic.exam3.ex29;

import java.util.*;

public class ReduceTest {
    public static void main(String[] args) {
        // TODO ①
        // TODO ②
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Integer i = list.stream()
                .reduce((x, y) -> {
                    return x + y;
                })
                .get();
        System.out.println("합계 : " + i);
        ArrayList<String> str = new ArrayList<>(Arrays.asList("안녕하세요","hi","Good Morning"));
        String s = str.stream()
                .reduce((s1, s2) ->
                    s1.getBytes().length > s2.getBytes().length ? s1 : s2
                ).get();
        System.out.println("최장 : " +s);

    }
}