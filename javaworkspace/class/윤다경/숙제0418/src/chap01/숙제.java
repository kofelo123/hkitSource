package chap01;

import java.util.Scanner;

public class 숙제 {

	public static void main(String[] args) {
		
		int age ;
		double scroe ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이 입력 : ");
		age = sc.nextInt();
		System.out.println("성적 입력 : ");
		scroe = sc.nextDouble();
	
		if ((age < 30) && (scroe >= 3.5)) 
		   System.out.println("추천 대상 입니다.");
	    else 
		   System.out.println("추천 대상이 아닙니다.");

		
		}

		}
	



