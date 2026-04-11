package main.java.inhatc.cse.java.basic.chapter12.ex2_collection.ex3_hashset;

import com.sun.source.util.Trees;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetTest {
    static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("홍길동");
        hashSet.add("김길동");
        hashSet.add("박길동");
        hashSet.add("최길동");
        hashSet.add("이길동");
        System.out.println(hashSet);


        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("홍길동");
        treeSet.add("홍길동");
        treeSet.add("김길동");
        treeSet.add("박길동");
        treeSet.add("최길동");
        treeSet.add("최길동");
        treeSet.add("이길동");
        treeSet.add("문길동");

        System.out.println(treeSet);
        System.out.println("역순 : " + treeSet.reversed());

    }
}
