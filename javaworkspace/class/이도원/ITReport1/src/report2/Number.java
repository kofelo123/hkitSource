package report2;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int first_number, second_number;
		
		System.out.println("첫 번째 수를 입력하세요.");
		first_number = scan.nextInt();
		System.out.println("두 번째 수를 입력하세요.");
		second_number = scan.nextInt();
		
		if((first_number%2 == 0 && second_number%2 == 0)
				|| (first_number%2 == 1 && second_number%2 == 1)){
			System.out.println("\n두 개의 숫자는 같은 짝수 또는 홀수 입니다.");
		}
		else {
			System.out.println("\n두 개의 숫자는 같은 짝수 또는 홀수가 아닙니다.");
		}
	}

}
