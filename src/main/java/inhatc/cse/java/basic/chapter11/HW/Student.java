package main.java.inhatc.cse.java.basic.chapter11.HW;

import java.util.Objects;

public class Student {
    private String hakbun;
    private String name;
    private int grade;


    public Student(String hakbun, String name, int grade) {
        this.hakbun = hakbun;
        this.name = name;
        this.grade = grade;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hakbun='" + hakbun + '\'' +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return grade == student.grade && Objects.equals(hakbun, student.hakbun) && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hakbun, name, grade);
    }

}
