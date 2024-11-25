package day_11_18.ex03;

public class ChildTest {
    public static void main(String[] args) {
        Child c = new Child();
        c.method1();
        c.method2();

        ITest1 i1 = new Child();
        i1.method1();   // 인터페이스에 선언된 추상 메서드만 호출 가능
        //i2.method2(); 업캐스팅 상태에서 다른 인터페이스 메서드 호출 불가능
        
        ITest2 i2 = new Child();
        i2.method2();
    }
}
