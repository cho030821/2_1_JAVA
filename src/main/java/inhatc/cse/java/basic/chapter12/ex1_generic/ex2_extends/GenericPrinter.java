package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.ex2_extends;

public class GenericPrinter<T> {
    private T material;

    public GenericPrinter() {

    }

    public GenericPrinter(Plastic plastic) {
    }

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }


}
