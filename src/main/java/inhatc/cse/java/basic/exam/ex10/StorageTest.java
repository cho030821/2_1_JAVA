package main.java.inhatc.cse.java.basic.exam.ex10;

// TODO: Storage<T> 클래스 작성

public class StorageTest {
    public static void main(String[] args) {
        Storage<String> storage = new Storage<>();
        storage.add("사과");
        storage.add("바나나");
        storage.add("귤");
        storage.printAll();
    }
}