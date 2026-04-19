package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex5_Test;

import java.util.ArrayList;
import java.util.List;

public class TravleTest {
    static void main(String[] args) {
        //TODO "1. 추가된 순서대로 고객 명단 출력"
        //TODO "2. 여행 총 비용"
        //TODO "3. 30대 이상 명단을 정렬해서 출력"

        List<Custom> list = new ArrayList<>();
        list.add(new Custom("박명수",100000,23));
        list.add(new Custom("유재석",200000,43));
        list.add(new Custom("정준하",300000,60));

        list.stream()
                .map(Custom::getName)
                .forEach(System.out::println);

        Integer i = list.stream()
                .map(Custom::getPrice)
                .reduce(Integer::sum)
                .get();
        System.out.println(i);

        list.stream()
                .filter(s -> s.getAge() >=30)
                .map(Custom::getName)
                .sorted()
                .forEach(System.out::println);
    }
}
