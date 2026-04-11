package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.test;

public class Water extends Material{
    private String name = "물을 출력가능한 ㅋㅋ";
    private int num = 3;
    public String getName() {
        return name;
    }

    public void doPrinting() {
        System.out.println(getName());
    }

}
