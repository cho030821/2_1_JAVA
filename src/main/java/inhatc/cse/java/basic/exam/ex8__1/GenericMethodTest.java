package main.java.inhatc.cse.java.basic.exam.ex8__1;

public class GenericMethodTest {

    // TODO: public static <T extends Comparable<T>> T getMax(T a, T b)

    public static void main(String[] args) {
        System.out.println(getMax(10, 20));
        System.out.println(getMax("apple", "banana"));
    }

    public static <T extends Comparable<T>> T getMax(T a, T b){
        return a.compareTo(b) >=0 ? a:b;
    }

}
