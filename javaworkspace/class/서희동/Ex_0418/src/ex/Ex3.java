package ex;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int gender;
		int toeic;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("성별 입력 : 1.남자 2.여자");
		gender = sc.nextInt();
		System.out.println("토익 점수 입력 : ");
		toeic = sc.nextInt();
		
		if(((gender==1) && toeic>=800) || ((gender==2)&& toeic>=700)) {
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
		}else{
			System.out.println("항공 승무원 지원 자격 불가");
		}
	}

}
