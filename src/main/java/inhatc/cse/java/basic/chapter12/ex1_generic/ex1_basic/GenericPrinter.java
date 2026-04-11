package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.ex1_basic;

public class    GenericPrinter<T> {
    private T material;

    public GenericPrinter() {

    }
    public GenericPrinter(T material){
        this.material = material;
    }
    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }


}
