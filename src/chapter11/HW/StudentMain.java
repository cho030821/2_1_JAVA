package chapter11.HW;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("202345059","조재균",2);
        Student student2 = new Student("202345059","조재균",2);

        System.out.println(student1);
        System.out.println(student2.toString());
        if(student1.equals(student2)){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }


    }
}
