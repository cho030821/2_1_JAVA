package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex2_method;

import java.util.ArrayList;
import java.util.List;

public class DistinctTest {
    static void main(String[] args) {
        Student s1 = new Student(100,"홍길동");
        Student s2 = new Student(200,"김길동");
        Student s3 = new Student(100,"최길동");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        studentList.stream()
                .distinct()
                .map(s -> s.getName())
                .forEach(s -> System.out.println(s));

    }
}
