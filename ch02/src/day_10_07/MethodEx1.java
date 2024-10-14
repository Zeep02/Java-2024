//7장
//202311423 윤동현

package day_10_07;

public class MethodEx1 {
	public static void main(String[] args) {
		MethodEx1 m = new MethodEx1();
		m.print();
		m.print();
		m.print();
		
		System.out.println("종료");
		
	}
	public void print() {
		System.out.println("메서드를 호출합니다.");
	}
}
