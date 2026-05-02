package main.java.inhatc.cse.java.basic.chapter15.ex2_inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    static void main(String[] args) {

        try(FileInputStream fis = new FileInputStream("C:\\Windows\\system.ini")) {

            int i=0;
            while((i=fis.read()) != -1){
                System.out.print((char)i);
            }

        } catch (FileNotFoundException e) {
            System.err.println("파일이 없어요" + e);

        } catch (IOException e) {
            System.err.println("입출력 오류가 났어요"+e);

        }
    }
}
