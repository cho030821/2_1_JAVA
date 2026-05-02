package main.java.inhatc.cse.java.basic.chapter15.ex1_basic;

import java.io.InputStream;
import java.util.Scanner;

public class ScannerTest {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.println(name);
        System.out.print("학년 : ");
        int grade = sc.nextInt();
        sc.nextLine();
        System.out.println(grade);
        System.out.print("학과 : ");
        String dept = sc.nextLine();
        System.out.print(dept);

    }
}
