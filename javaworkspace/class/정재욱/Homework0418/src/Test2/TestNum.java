package Test2;

import java.util.Scanner;

public class TestNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("두개의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((num1+num2)%2==0) {
			System.out.println("두 숫자는 같은 짝수 또는 홀수 입니다.");
		} else {
			System.out.println("두 숫자는 다른 수 입니다.");
		}
	}

}
