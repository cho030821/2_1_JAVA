package main.java.inhatc.cse.java.basic.exam1.e_14;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    static void main(String[] args) {
        Map<String,Integer> hash = new HashMap();
        hash.put("홍길동",90);
        hash.put("김철수",85);

        for(Map.Entry<String,Integer> list : hash.entrySet()){
            System.out.println(list.getValue()+ " : "+list.getKey());

        }
        System.out.println("홍길동의 점수 : "+hash.get("홍길동"));

    }
}
