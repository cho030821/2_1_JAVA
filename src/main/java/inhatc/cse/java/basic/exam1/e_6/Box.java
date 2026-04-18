package main.java.inhatc.cse.java.basic.exam1.e_6;

public class Box<T> {
    private T space;

    public T get() {
        return space;
    }

    public void set(T space) {
        this.space = space;
    }
}
