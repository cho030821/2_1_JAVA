package main.java.inhatc.cse.java.basic.chapter12.ex2_collection.ex4_hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapTest {
    static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("철수",90);
        scores.put("영희",85);
        scores.put("영희",88);
        scores.put("민수",95);
        scores.put("흥민",85);


        System.out.println(scores); //자바에서 중괄호는 집합
        System.out.println(scores.get("흥민"));


    }
}
