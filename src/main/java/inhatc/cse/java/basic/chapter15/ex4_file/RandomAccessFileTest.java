package main.java.inhatc.cse.java.basic.chapter15.ex4_file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
    static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("src/main/resource/random.txt","rw");
        raf.writeInt(100);
        System.out.println(raf.getFilePointer());
        raf.writeDouble(3.14);
        System.out.println(raf.getFilePointer());
        raf.writeUTF("한글");
        System.out.println(raf.getFilePointer());
        raf.seek(0);
        System.out.println(raf.getFilePointer());
        System.out.println(raf.readInt());
        System.out.println(raf.getFilePointer());
        System.out.println(raf.readDouble());
        System.out.println(raf.getFilePointer());
    }
}
