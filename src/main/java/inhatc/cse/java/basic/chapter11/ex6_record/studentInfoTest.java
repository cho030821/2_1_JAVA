package chapter11.ex6_record;

import chapter11.HW.Student;

public class studentInfoTest {
    public static void main(String[] args) {
        StudentInfo studentInfo1 = new StudentInfo(111,"홍길동");
        StudentInfo studentInfo2 = new StudentInfo(111,"홍길동");

        System.out.println(studentInfo1.equals(studentInfo2));
        System.out.println(studentInfo1.name());
        System.out.println(studentInfo2);

    }
}
