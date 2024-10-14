//제출일: 2024.09.29
//학  번: 202311423
//이  름: 윤동현
//내  용: 계산기 프로그램 작성, 입력값과 출력값은 정수, 0으로 나눌 시 오류문구 출력 및 다시 입력

package work;

import java.util.Scanner;

public class calculate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, result;
		char x;
		boolean check = false;
		while (!check) {
			
			System.out.print("값을 입력하세요 (ex. 3 + 7)");
			String inputx = sc.nextLine();
			String[] xindex = inputx.trim().split("\\s+");
			
			num1 = Integer.parseInt(xindex[0]);
			num2 = Integer.parseInt(xindex[2]);
			x = xindex[1].charAt(0);
			
			
			switch (x) {
				case '+':
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					check=true;
					break;
				case '-':
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					check=true;
					break;
				case '*':
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					check=true;
					break;
				case '/':
					if (num2==0) {
						System.out.println("0으로 나눌 수 없습니다. 다시 입력하세요.");
						break;
					}
					else {
						System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
						check=true;
						break;
					}
				default:
					System.out.println("유효한 연산자가 아닙니다.");
			}
		}
		
	}
}
