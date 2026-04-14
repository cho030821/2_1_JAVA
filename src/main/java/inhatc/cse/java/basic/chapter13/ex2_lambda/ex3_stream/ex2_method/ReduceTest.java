package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex2_method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceTest {
    static void main(String[] args) {
        String[] greetings = {"안녕하세요." , "Hello", "Good Morning", "반갑습니다"};
        String s = Arrays.stream(greetings)
                .reduce((s1, s2) -> {
                    if (s1.getBytes().length < s2.getBytes().length) {
                        return s1;
                    } else {
                        return s2;
                    }
                }).get();
        System.out.println(s);

        String s1 = Arrays.stream(greetings)
                .reduce(new CompareString())
                .get();
        System.out.println(s1);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list.stream()
                .reduce(10, (x, y) -> x + y));

    }
}
