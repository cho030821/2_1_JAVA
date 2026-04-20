package main.java.inhatc.cse.java.basic.exam2.ex13;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        // TODO
        HashSet<Integer> hash = new HashSet<>();
        hash.add(1);
        hash.add(2);
        hash.add(3);
        hash.add(2);
        hash.add(1);
        System.out.println(hash);
        System.out.println("3의 여부 : " + hash.contains(3));

    }
}