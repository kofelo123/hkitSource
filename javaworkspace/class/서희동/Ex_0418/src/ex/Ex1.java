package ex;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int age;
		double score;
		System.out.println("나이 :");
		age = sc.nextInt();
		System.out.println("점수");
		score = sc.nextDouble();
		
		if(age<=30 && score>=3.5){
			System.out.println("추천 대상입니다.");
		}else{
			System.out.println("추천 대상이 아닙니다.");
		}
	}

}
