package chapter12.ex1_basic;

public class GenericPrinter<T> {
    private T material;

    public GenericPrinter() {

    }

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }


}
