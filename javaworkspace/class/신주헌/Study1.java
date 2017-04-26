package Homework;

import java.util.Scanner;

public class Study1 {
	public static void main(String[] args){
		int age;
		double score;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이 입력하세요:");
		age = scan.nextInt();
		
		System.out.println("성적 입력하세요:");
		score = scan.nextDouble();
		
		if(age<30 && score>=3.5){
			System.out.println("추천대상입니다");
		}else{
			System.out.println("추천대상아닙니다");
		}
	}
}
