package main.java.inhatc.cse.java.basic.exam1.e_11;

public class StorageTest {
    public static void main(String[] args) {
        Storage<String> storage = new Storage<>();
        storage.advertiser("사과");
        storage.advertiser("바나나");
        storage.advertiser("바나나");
        storage.advertiser("귤");
        storage.advertiserAll();
        storage.priaveteAndVoidAndNameRemove("바나나");
        storage.advertiserAll();
    }
}
