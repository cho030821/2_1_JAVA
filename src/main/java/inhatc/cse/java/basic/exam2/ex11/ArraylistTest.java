package main.java.inhatc.cse.java.basic.exam2.ex11;

import java.util.ArrayList;

public class ArraylistTest {
    public static void main(String[] args) {
        // TODO: ArrayList 생성 및 사과, 바나나, 귤 추가
        // TODO: 인덱스 1 삭제
        // TODO: 출력

        ArrayList<String> list = new ArrayList<>();
        list.add("사과");
        list.add("바나나");
        list.add("귤");
        System.out.println(list);
        list.remove("바나나");
        System.out.println(list);
    }
}