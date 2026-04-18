package main.java.inhatc.cse.java.basic.exam1.e_10;

import java.util.ArrayList;

public class Storage<T> {
    ArrayList<T> arraylist = new ArrayList<>();

    private void priadd(T name){
        arraylist.add(name);
    }
    public void advertiser(T name){
        priadd(name);
    }
    public void advertiserAll(){
        for (T name : arraylist ) {
            System.out.println(name);
        }
    }


}
