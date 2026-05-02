package main.java.inhatc.cse.java.basic.chapter15.ex1_basic;

import java.io.IOException;

public class SystemInTest {
    static void main(String[] args) {
        int i = 0;
        try{
            while((i = System.in.read()) != '\n'){
                System.out.print((char)i);
            }
        }catch(IOException e){
            System.err.println("예외 발생");
            e.printStackTrace();
        }


    }
}
