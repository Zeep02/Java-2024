//7장
//202311423 윤동현

package day_10_07;

public class MethodParameterTest1 {
	public static void main(String[] args) {
		int a =10;
		String str = "안녕하세요";
		MethodParameterTest1 m = new MethodParameterTest1();
		
		m.print(5);
		m.print(a);
		m.print(a + 15);
		
		m.printResult("Hello!");
		m.printResult(str);
		
		System.out.println("종료");
		
	}
	
	public void print(int x) {
		System.out.println("전달된 값: " + x);
	}
	
	public void printResult(String result) {
		System.out.println(result);
	}
}
