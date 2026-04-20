package main.java.inhatc.cse.java.basic.exam2.ex14;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        // TODO
        HashMap<String, Integer> hash= new HashMap<>();
        hash.put("홍길동",90);
        hash.put("김철수",85);
        for (Map.Entry<String, Integer> list : hash.entrySet()){
            System.out.println(list.getKey() + " : " + list.getValue());
        }
        System.out.println("홍길동의 점수 : "+ hash.get("홍길동"));

    }
}
