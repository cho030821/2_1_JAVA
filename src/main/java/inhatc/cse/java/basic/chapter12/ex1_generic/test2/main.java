package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.test2;

public class main {
    public static void main(String[] args) {
        NumberClass<Integer,Double> num1 = new NumberClass<>(10, 5.0);
        NumberClass<Integer, Double> num2 = new NumberClass<>(20, 10.0);
        NumberClass<Double, Integer> num3 = new NumberClass<>(30.0, 15);
        NumberClass<Double, Integer> num4 = new NumberClass<>(40.0, 25);


        System.out.println(makeRactangle(num2, num1));
        System.out.println(makeRactangle(num4, num3));
        System.out.println(makeRactangle2(num2,num1));
       // System.out.println(makeRactangle2(num4,num3)); 타입 안맞아서 오류


    }
    public static <T,V> double makeRactangle(NumberClass<T,V> p1 , NumberClass<T, V> p2){
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();

        double width = right - left;
        double height =  bottom - top;
        return width * height;
    }
    public static double makeRactangle2(NumberClass<Integer, Double> p1 , NumberClass<Integer, Double> p2){
        double left = p1.getX();
        double right = p2.getX();
        double top = p1.getY();
        double bottom = p2.getY();

        double width = right - left;
        double height =  bottom - top;
        return width * height;
    }
}
