package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex1_basic;

import java.util.Arrays;
import java.util.List;

public class IntArrayTest {
    static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum= Arrays.stream(arr).sum();
        System.out.println(sum);

        long count = Arrays.stream(arr).count();
        System.out.println(count);

//        List<Integer> list = Arrays.asList(arr);
//        for (Integer i : list) {
//            System.out.println(i);
//        }


    }
}
