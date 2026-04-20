package main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex4_optional;

import main.java.inhatc.cse.java.basic.chapter13.ex2_lambda.ex3_stream.ex2_method.Student;

import java.util.List;
import java.util.Optional;

public class OptionalTest {
    static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student(100, "홍길동"),
                new Student(101, "이길동"),
                new Student(102, "최길동")
        );
        Student s = studentList.get(999);

        usingOptional(studentList);
    }

    private static void usingOptional(List<Student> studentList) {


        Student student2 = getFindById(101, studentList).orElseThrow(()
                -> new IllegalStateException("해당 사용자가 존재하지 않습니다."));
        System.out.println(student2.getName());

        Optional<Student> op = getFindById(101, studentList);
        if(op.isPresent()){
            Student student = op.get();
            System.out.println(student.getName());
        }else{
            System.out.println("존재하지 않음");
        }



    }

    private static Optional<Student> getFindById(int id, List<Student> studentList) {
        for(Student student : studentList){
            if(student.getId() == id){
                return Optional.of(student);
            }

        }
        return Optional.empty();
    }
}
