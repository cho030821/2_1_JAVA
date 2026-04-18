package main.java.inhatc.cse.java.basic.exam1.e_15;

import java.util.*;

public class SortTest {
    static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5,2,8,1,4));
        Collections.sort(array);
        System.out.println("오름차순 : " + array);
        array.sort(Comparator.reverseOrder());
        System.out.println("내림차순 : " + array);
    }
}
