package main.java.inhatc.cse.java.basic.exam2.ex12;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        // TODO: LinkedList 생성, A와 B 추가, first를 앞에, last를 뒤에 추가 후 출력
    LinkedList<String> list = new LinkedList<>();
    list.add("A");
    list.add("B");
    list.addFirst("first");
    list.addLast("last");
        System.out.println(list);
    }
}
