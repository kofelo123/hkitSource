package Homework;

import java.util.Scanner;

public class study2 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		System.out.print("1번째 숫자 입력하세요:");
		num1 = scan.nextInt();
		System.out.print("2번째 숫자 입력하세요:");
		num2 = scan.nextInt();
		
		
		if((num1%2==0 && num2%2==0) || (num1%2!=0 && num2%2!=0)){
			System.out.println("두숫자는 같은 짝수또는 홀수 입니다.");
		}
		else{
			System.out.println("없음");
		}
	}
}
