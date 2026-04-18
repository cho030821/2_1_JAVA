package main.java.inhatc.cse.java.basic.exam1.e_13;

import java.util.HashSet;

public class HashSetTest {
    static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(2);
        hash.add(1);
        System.out.println(hash);
        System.out.println( "3 포함 여부 "+hash.contains(3));

    }
}
