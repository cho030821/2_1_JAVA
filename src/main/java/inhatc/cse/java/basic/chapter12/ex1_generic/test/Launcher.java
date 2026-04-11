package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.test;

public class Launcher<T extends Material,V extends Material>{
    private T p1;
    private V p2;

    public Launcher(T p1, V p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Launcher(){

    }

    public void setMaterial(T p1,V p2) {
        this.p1 = p1;
        this.p2 = p2;

    }



    public T getP1() {
        return p1;
    }



    public V getP2() {
        return p2;
    }


    public void printing(){
        p1.doPrinting();
        p2.doPrinting();
    }
}
