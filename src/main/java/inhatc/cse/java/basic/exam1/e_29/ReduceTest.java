package main.java.inhatc.cse.java.basic.exam1.e_29;
import java.util.*;

public class ReduceTest {
    public static void main(String[] args) {
        // TODO ①
        List<String> list = Arrays.asList("안녕하세요","hi","GoodMorning");
        String s = list.stream()
                .reduce((s1, s2) -> {
                    if (s1.getBytes().length > s2.getBytes().length) {
                        return s1;
                    } else {
                        return s2;
                    }
                }).get();


        // TODO ②
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        Integer i = list2.stream()
                .reduce((s1, s2) -> {
                    return s1 + s2;
                })
                .get();
        System.out.println(i);
        System.out.println(s);
    }
}