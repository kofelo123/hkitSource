package quiz1;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int age; double jum;
	System.out.println("나이를 입력하세요.");
	age = sc.nextInt();
	if(age<30){
		System.out.println("성적을 입력하세요");
		jum = sc.nextDouble();
		if(3.5<jum){
			System.out.println("추전 대상입니다.");}
		else
			System.out.println("추전 대상이 아닙니다.");
		}
	
		else
			System.out.println("추전 대상이 아닙니다.");
	}
	}
			
