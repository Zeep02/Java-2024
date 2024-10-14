package classwork;

import java.util.Scanner;

public class Int10_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] val = new int[10];
		int sum = 0;
		int avg = 0;
		
		for (int i = 0; i<val.length; i++) {
			System.out.print("값을 입력하세요: ");
			String inputx = sc.nextLine();
			val[i] = Integer.parseInt(inputx);
		}
		
		System.out.println("입력받은 정수: ");
		for (int i=0;i<10;i++) {

			System.out.println((i+1)+"번째 수: " + val[i]);
		}
		
		for (int i=0;i<10;i++) {
			sum += val[i];
		}
		
		System.out.println("정수의 합: "+sum);
		
		for (int i=0;i<10;i++) {
			avg = sum/10;
		}
		
		System.out.println("정수의 평균: "+avg);
		
	}
}
