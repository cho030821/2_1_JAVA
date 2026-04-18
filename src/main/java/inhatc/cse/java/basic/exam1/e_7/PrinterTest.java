package main.java.inhatc.cse.java.basic.exam1.e_7;

public class PrinterTest {
    public static void main(String[] args) {
        GenericPrinter<Plastic> printer = new GenericPrinter<>(new Plastic());
        printer.doPrint();
    }
}