package main.java.inhatc.cse.java.basic.chapter15.ex4_file;

import java.io.File;
import java.io.IOException;

public class FileTest {
    static void main(String[] args) throws IOException {
        File f =new File("src/main/resource/b.txt");
        if (!f.exists()) {
            f.createNewFile();
        }

        System.out.println(f.getAbsolutePath());
        f.delete();
    }


}
