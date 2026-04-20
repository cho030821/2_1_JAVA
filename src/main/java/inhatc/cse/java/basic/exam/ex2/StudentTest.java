package main.java.inhatc.cse.java.basic.exam.ex2;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(100, "홍길동");
        Student s2 = new Student(100, "홍길동");
        Student s3 = new Student(200, "김철수");
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // false
    }
}
