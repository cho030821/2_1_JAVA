package main.java.inhatc.cse.java.basic.exam1.e_12;

import java.util.LinkedList;
import java.util.List;

public class Linkelist {
    public static void main(String[] args) {
        // TODO: LinkedList 생성, A와 B 추가, first를 앞에, last를 뒤에 추가 후 출력

        List list = new LinkedList();
        list.add("A");
        list.add("B");
        list.addFirst("First");
        list.addLast("Last");
        System.out.println(list);



    }
}
