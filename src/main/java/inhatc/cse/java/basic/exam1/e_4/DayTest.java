package main.java.inhatc.cse.java.basic.exam1.e_4;
enum Day {
    MONDAY,TUESDAY,WEDSNDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}

public class DayTest {
    static void main(String[] args) {
        Day day1 = Day.SATURDAY;
        Day day2 = Day.MONDAY;
        printDayType(day1);
        printDayType(day2);
    }

    // TODO: switch 문으로 평일/주말 출력 메서드
    static void printDayType(Day day) {
        switch (day) {
            case SATURDAY: case SUNDAY:
                System.out.println(day + ": 주말입니다.");
                break;
            default:
                System.out.println(day + ": 평일입니다.");
        }
    }

}
