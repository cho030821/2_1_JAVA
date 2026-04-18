package main.java.inhatc.cse.java.basic.exam1.e_23;

import java.util.*;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 27, 7);
        // TODO: Predicate<Integer> isPositive 정의 (x > 0)
        // TODO: for문으로 isPositive.test() 사용해서 출력
        Predicate<Integer> isPositive = a -> a>0;
        for(int num : numbers){
            if(isPositive.test(num)){
                System.out.println(num);
            }
        }


    }
}
