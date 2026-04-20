package main.java.inhatc.cse.java.basic.exam3.ex23;

import java.util.*;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, -10, -22, 0, 27, 7);
        // TODO: Predicate<Integer> isPositive 정의 (x > 0)
        // TODO: for문으로 isPositive.test() 사용해서 출력

        Predicate<Integer> isPositive = x -> x>0;

        for (Integer list : numbers){
            if(isPositive.test(list)){
                System.out.println(list);
            }
        }
    }
}
