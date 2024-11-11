package day_11_04.ex01;

public class Employee {
    protected String name;          // 이름
    protected int payPerMonth;      // 급여
    protected int commision;        // 성과금

    public Employee(String name, int payPerMonth, int commision){
        this.name = name;
        this.payPerMonth = payPerMonth;
        this.commision = commision;
    }

    int calcTotalPay() {
        int totalPay = 12 * payPerMonth + commision;
        return totalPay;
    }
}
