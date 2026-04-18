package main.java.inhatc.cse.java.basic.exam1.e_7;

public class GenericPrinter <T extends Material>{

    T material;
    public GenericPrinter(T material) {
        this.material= material;
    }

    public void doPrint(){
        material.doPrinting();
    }


}
