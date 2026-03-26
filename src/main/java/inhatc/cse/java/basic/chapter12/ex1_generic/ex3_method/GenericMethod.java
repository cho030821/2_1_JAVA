package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.ex3_method;

public class GenericMethod {
    public static void main(String[] args) {
        Point<Integer, Double> p1 = new Point<>(0,0.0);
        Integer i = Integer.valueOf(10);
        int k = i.intValue();
        Point<Integer, Double> p2 =  new Point<>(10,10.0);


        double area = makeRectangle(p1, p2);

        Point<Integer, Double> p3 = new Point<>(0,0.0);
        Point<Integer, Double> p4 =  new Point<>(10,10.0);

        double area2 = makeRectangle2(p3,p4);
        System.out.printf(String.valueOf(area2));

    }

    private static <T, V> double makeRectangle2(Point<T, V> p1, Point<T, V> p2) {
        double left = ((Number)p1.getX()).doubleValue();
        double right = ((Number)p2.getX()).doubleValue();
        double top = ((Number)p1.getY()).doubleValue();
        double bottom = ((Number)p2.getY()).doubleValue();;

        double width = right - left;
        double height  = bottom - top;
        return width*height;
    }

    private static double makeRectangle(Point<Integer, Double> p1, Point<Integer, Double> p2) {
        double left = p1.getX();
        double right = p2.getX();
        double top = p1.getY();
        double bottom = p2.getY();

        double width = right - left;
        double height  = bottom - top;
        return width*height;
    }

}
