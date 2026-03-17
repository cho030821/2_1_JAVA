package chapter12.ex1_basic;

public class main {
    public static void main(String[] args) {
        GenericPrinter<Plastic> plasticGenericPrinter = new GenericPrinter<>();
        Plastic plastic = new Plastic();
        plasticGenericPrinter.setMaterial(plastic);
        plasticGenericPrinter.getMaterial();
        Plastic meterial = plasticGenericPrinter.getMaterial();
        meterial.doPrinting();
        System.out.println(meterial);

        GenericPrinter<Powder> powderGenericPrinter = new GenericPrinter<>();
        Powder powder = new Powder();
        powderGenericPrinter.setMaterial(powder);
        Powder meterial1 = powderGenericPrinter.getMaterial();
        meterial1.doPrinting();
        System.out.println(meterial1);


    }
}
