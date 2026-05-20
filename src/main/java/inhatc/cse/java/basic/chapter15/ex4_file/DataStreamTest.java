package main.java.inhatc.cse.java.basic.chapter15.ex4_file;

import java.io.*;

public class DataStreamTest {
    static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("src/main/resource/data.txt");
            DataOutputStream dos = new DataOutputStream(fos);
        ){
            dos.writeByte(100);
            dos.writeChar('a');
            dos.writeInt(11);
            dos.writeUTF("한글");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (DataInputStream dis = new DataInputStream(new FileInputStream("src/main/resource/data.txt"));
        ){
            System.out.println(dis.readByte());
            System.out.println(dis.readChar());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
