package main.java.inhatc.cse.java.basic.exam1.e_14;

import java.util.HashMap;

public class HashMapTest {
    static void main(String[] args) {
        HashMap hash = new HashMap();
        hash.put("홍길동",90);
        hash.put("김철수",85);

        System.out.println(hash.entrySet());
        System.out.println("홍길동의 점수 : "+hash.get("홍길동"));

    }
}
