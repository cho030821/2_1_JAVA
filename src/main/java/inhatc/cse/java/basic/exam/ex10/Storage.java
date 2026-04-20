package main.java.inhatc.cse.java.basic.exam.ex10;

import java.util.ArrayList;

public class Storage <T>{
    ArrayList<T> list = new ArrayList<>();
    public void add(T item){
        list.add(item);
    }
    public void printAll(){
        for(T item : list){
            System.out.println(item);
        }
    }
}
