package main.java.inhatc.cse.java.basic.exam1.e_11;

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
            System.out.print(name);

        }
    }
    public void priaveteAndVoidAndNameRemove(T name){
        for (int i = 0; arraylist.size() > i  ; i++) {
            if(arraylist.get(i) == name){
                System.out.println(arraylist.get(i));
                arraylist.remove(i);
            }
        }
        System.out.println("없음");

    }


}
