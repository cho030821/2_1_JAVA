package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.test2;

public class NumberClass<T,V> {
        T x;
        V y;

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }

    public NumberClass(T x, V y) {
        this.x = x;
        this.y = y;
    }
}
