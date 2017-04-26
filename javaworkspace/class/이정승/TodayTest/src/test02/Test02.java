package test02;

import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int a, b;  //변수
		
		System.out.println("숫자1를 입력하세요");
		a = sc.nextInt();
		
		System.out.println("숫자2를 입력하세요");
		b = sc.nextInt();
		
		if((a%2 == 0) && (b%2 == 0) ){
			System.out.println("둘 다 짝수 입니다.");
		}
		else if((a%2 != 0) && (b%2 != 0))
			System.out.println("둘 다 홀수 입니다.");
		else
			System.out.println("짝수, 홀수 섞였습니다.");
	}

}
