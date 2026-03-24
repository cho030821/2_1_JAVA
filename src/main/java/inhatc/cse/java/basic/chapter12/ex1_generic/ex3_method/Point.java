package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.ex3_method;

public class Point<T,V> {
    private T x;
    private V y;

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

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }
}
