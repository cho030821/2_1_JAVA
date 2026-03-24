package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.ex2_extends;

public class Plastic extends Material {

    @Override
    public void doPrinting() {

        System.out.println("플라스틱 재료로 출력");
    }

    @Override
            public String toString(){
            return("재료는 플라스틱");
        }


    }

