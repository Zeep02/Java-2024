package day_11_11.ex04;

public class NumberTest {

	public static void main(String[] args) {
		System.out.println("numCount의 값: " + Number.numCounter);
		
		Number number1 = new Number();
		number1.increaseNum();
		System.out.println("numCount의 값: " + Number.getNumCounter());
		
		Number number2 = new Number();
		number2.increaseNum();
		number2.increaseNum();
		
		System.out.println("numCount의 값: " + Number.getNumCounter());
		System.out.println("numCount의 값: " + number1.getNumCounter());
		System.out.println("numCount의 값: " + number2.getNumCounter());

	}

}