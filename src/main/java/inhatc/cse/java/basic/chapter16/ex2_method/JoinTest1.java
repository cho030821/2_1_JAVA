package main.java.inhatc.cse.java.basic.chapter16.ex2_method;

public class JoinTest1 extends Thread {
    private int start;
    private int end;
    private int sum;
    public JoinTest1(int start, int end) {
        this.start = start;
        this.end = end;

    }
    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }
    static void main(String[] args) throws InterruptedException {
        JoinTest1 joinA = new JoinTest1(1,50);
        JoinTest1 joinB = new JoinTest1(51,100);

        joinA.start();
        joinB.start();
        joinA.join();
        joinB.join();

        int total = joinA.sum +  joinB.sum;
        System.out.println(joinA.sum + " + " + joinB.sum + " = " + total);




    }
}
