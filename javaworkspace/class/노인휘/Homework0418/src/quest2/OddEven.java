package quest2;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		System.out.println("첫번째 숫자를 입력하세요");
		num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		num2 = scan.nextInt();

		if ((num1 % 2 == 0 && num2 % 2 == 0)||(num1 % 2 == 1 && num2 % 2 == 1)){
			System.out.println("두 숫자 모두 짝수 또는 홀수 입니다.");
		}
		else
			System.out.println("두 숫자는 모두 짝수 또는 홀수가 아닙니다.");
	}

}
