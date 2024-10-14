package classwork;

import java.util.Scanner;

public class Int10_dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] val = new int[10];
		int sum = 0;
		int avg = 0;
		int i = 0;
		do {
			System.out.print("값을 입력하세요: ");
			String inputx = sc.nextLine();
			val[i] = Integer.parseInt(inputx);
			sum += val[i];
			i++;
			if (i==10) {
				avg = sum / 10;} 
		} while(i<10);
			

		i = 0;

		do {
			System.out.println((i+1) + "번째 수: " + i);
			i++;
		} while (i<10);
		
		System.out.println("수의 합: " + sum);
		System.out.println("수의 평균: " + avg);
		}
}
