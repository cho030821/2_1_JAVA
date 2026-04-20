package main.java.inhatc.cse.java.basic.exam2.ex15;
import java.util.*;

public class SortTEst {
    public static void main(String[] args) {
        // TODO
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,3,8,1,4));

        Collections.sort(list);
        System.out.println("오름차순 : "+list);
        list.sort(Comparator.reverseOrder());
        System.out.println("내림차순 : " +list);


    }
}
