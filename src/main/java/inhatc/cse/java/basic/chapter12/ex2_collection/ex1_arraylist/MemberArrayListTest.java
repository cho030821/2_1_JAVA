package main.java.inhatc.cse.java.basic.chapter12.ex2_collection.ex1_arraylist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList list = new MemberArrayList();
        Member m1 = new Member(100,"이지원");
        Member m2 = new Member(102,"최성현");
        list.addMember(m1);
        list.addMember(new Member(101,"김민호"));
        list.addMember(m2);
        list.showAllMember();
        list.removeMember(102);
    }
}
