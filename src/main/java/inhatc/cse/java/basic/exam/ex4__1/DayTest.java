package main.java.inhatc.cse.java.basic.exam.ex4__1;

public class DayTest {
    public static void main(String[] args) {
        Day day1 = Day.SATURDAY;
        Day day2 = Day.MONDAY;
        printDayType(day1);
        printDayType(day2);
    }

    static void printDayType(Day day) {
        switch(day){
            case SATURDAY : case SUNDAY:
                System.out.println("주말입니다");
                break;
            default:
                System.out.println("평일입니다");
        }
    }
}
