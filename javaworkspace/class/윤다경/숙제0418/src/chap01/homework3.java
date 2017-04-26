package chap01;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		
		int Gender=0;
		int Toeic=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별 입력 : ");
		Gender=sc.nextInt();
		System.out.println("점수 입력 : ");
		Toeic=sc.nextInt();
		
		if  (((Gender == 1) && (Toeic >=800 )) || ((Gender == 2) && (Toeic >=700 )))
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
	
		}
		
		}
	


	