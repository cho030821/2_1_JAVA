package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex6_optionaltest;

import main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex2_method.Student;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Optional;

public class OptionalTest {
    static void main(String[] args) {
        ArrayList<Student> studentlist = new ArrayList<>();
        studentlist.add(new Student(1,"김철수"));
        studentlist.add(new Student(2,"이철수"));
        studentlist.add(new Student(3,"박철수"));
        studentlist.add(new Student(4,"최철수"));
        studentlist.add(new Student(5,"조철수"));

        usingOptional(studentlist);

    }
    public static void usingOptional(ArrayList<Student> studentlist){
        Student student = getFindId(10, studentlist).orElseThrow(()-> new IllegalStateException());
        System.out.println(student.getName());
    }

    public static Optional<Student> getFindId(int id, ArrayList<Student> studentlist){
        for(Student student : studentlist){
            if(student.getId() == id){
                return Optional.of(student);
            }

        }
        return Optional.empty();

    }

}
