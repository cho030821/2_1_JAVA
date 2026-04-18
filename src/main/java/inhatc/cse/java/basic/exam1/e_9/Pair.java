package main.java.inhatc.cse.java.basic.exam1.e_9;

public class Pair <T,V>{
    private T t1;
    private V t2;
    public Pair(T t1, V t2) {
        this.t1 = t1;
        this.t2=t2;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + t1 +
                ", 이름=" + t2 +
                '}';
    }
}
