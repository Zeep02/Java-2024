package day_11_04.ex01;

public class EmpTest {
    public static void main(String[] args) {
        String name;
        int totalPay;
        Employee Hong, Lee;
        Lee = new Regular("이순신", 2000000, 5000000);
        Hong = new Temp("홍길동", 1500000, 0, 500);

        System.out.println("사원 정보 출력");
        System.out.println("-------------------------");
        name = Lee.name;
        totalPay = Lee.calcTotalPay();
        System.out.println("사원 이름: " + name + ", 총 급여: " + totalPay + "원");

        name = Hong.name;
        totalPay = Hong.calcTotalPay();
        System.out.println("사원 이름: " + name + ", 총 급여: " + totalPay + "원");
    }
}
