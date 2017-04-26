package test01;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int a, b;  //변수
		
		System.out.println("나이를 입력하세요");
		a = sc.nextInt();
		
		System.out.println("성적을 입력하세요");
		b = sc.nextInt();
		
		if(a < 30 && b >= 3.5){
			System.out.println("추천대상입니다.");
		}
		else
			System.out.println("추천대상이 아닙니다.");

	}

}
