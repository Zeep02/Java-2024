//7장
//202311423 윤동현

package day_10_07;

public class LocalVarTest {
	public static void main(String[] args) {
		LocalVarTest m = new LocalVarTest();
		m.printSumFrom1To100();
		
		//System.out.println("1에서 100까지의 합" + sum);	다른 매서드에서 사용된 변수 사용 시 오류 발생
		System.out.println("종료");
	}
	
	public void printSumFrom1To100() {
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			sum +=1;
		}
		System.out.println("1에서 100까지의 합: " + sum);
	}

}
