package main.java.inhatc.cse.java.basic.chapter15.ex3_buffed;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffedReaderTest {
    static void main(String[] args)  {

        String path=System.getProperty("user.dir");
        System.out.println(path);
        BufferedReader bfr = null;
        try {
            bfr = new BufferedReader(new FileReader(path+"/src/main/java/inhatc/cse/java/basic/ex1/Car.java"));
            String line="";
            while((line = bfr.readLine()) != null ){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
