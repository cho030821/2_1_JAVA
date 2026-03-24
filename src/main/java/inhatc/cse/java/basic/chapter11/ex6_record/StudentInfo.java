package main.java.inhatc.cse.java.basic.chapter11.ex6_record;

public record StudentInfo(int id, String name) {
    public static String  SCHOOL_NAME = "INHATC";

    @Override
    public int id() {
        return id;
    }

    @Override
    public String name() {
        return name;
    }

    public void setName(String name){
    //this.name = name;
    }

}
