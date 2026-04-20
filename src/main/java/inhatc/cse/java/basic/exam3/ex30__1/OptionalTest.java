package main.java.inhatc.cse.java.basic.exam3.ex30__1;

import java.util.*;

public class OptionalTest {
    public static void main(String[] args) {
        List<Student> list = List.of(
                new Student(100, "홍길동"),
                new Student(101, "이길동")
        );

        Optional<Student> op =  findById(100,list);
        if(op.isPresent()){
            System.out.println(op.get().getName());
        }
        Student student1 = findById(101,list).orElseThrow(()->new IllegalStateException());
        System.out.println(student1.getName());
        Student student2 = findById(999,list).orElseThrow(()->new IllegalStateException("해당학생이 존재하지 않습니다"));
        // TODO: findById(100, list) → isPresent/get으로 이름 출력
        // TODO: findById(101, list) → orElseThrow로 이름 출력
        // TODO: findById(999, list) → orElseThrow로 예외 발생
    }

    static Optional<Student> findById(int id, List<Student> list) {
        // TODO: for문으로 id 일치하는 Student 반환, 없으면 Optional.empty()
        for(Student student : list){
            if(student.getId() == id){
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
}