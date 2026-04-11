package main.java.inhatc.cse.java.basic.chapter12.ex1_generic.test;

public class main {
    public static void main(String[] args) {
        Launcher<Water,Fire> launcher = new Launcher<>(new Water(),new Fire());
        Water material1 = launcher.getP1();
        Fire material2 = launcher.getP2();

        material1.doPrinting();
        material2.doPrinting();
    }
}
