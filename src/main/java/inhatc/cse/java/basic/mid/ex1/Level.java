package main.java.inhatc.cse.java.basic.mid.ex1;

public enum Level {
    Bronze(0.01),Silver(0.03),Gold(0.05);

    private double rate;

    Level(double rate){
        this.rate = rate;
    }


    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
