package day_11_04.ex01;

public class Temp extends Employee {
    private int workedHour;

    public Temp(String name, int payPerMonth, int commision, int workedHour) {
        super(name, payPerMonth, commision);
        this.workedHour = workedHour;
    }


    @Override
    int calcTotalPay() {
        int temp = super.calcTotalPay();
        int tempTotalPay = temp + workedHour * 2000;
        return tempTotalPay;
    }
}
