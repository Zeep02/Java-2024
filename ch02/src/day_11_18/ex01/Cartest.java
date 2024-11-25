package day_11_18.ex01;

public class Cartest {
    public static void main(String[] args) {
    //    Car c1 = new Car();

        Truck t = new Truck();
        Car c = new SportsCar();

        // Car.SAFE_SPEED = 80; 상수는 값변경 x
        System.out.println("모든 차의 안전 속도: " + Car.SAFE_SPEED);

        t.speedUp();
        t.speedDown();
        t.stop();

        c.speedUp();
        c.speedDown();
        c.stop();

        SportsCar s = (SportsCar)c;
        s.turbo();
    }
}
