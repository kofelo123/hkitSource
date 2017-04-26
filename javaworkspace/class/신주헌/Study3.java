package Homework;

import java.util.Scanner;

public class Study3 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int gender, toeicjumsu;
		System.out.println("성별 입력하세요:");
		gender = scan.nextInt();
		System.out.println("점수를 입력하세요:");
		toeicjumsu = scan.nextInt();
		
		if((gender==1 && toeicjumsu>=700) || (gender==2 && toeicjumsu>=800)){
			System.out.println("항공 승무원 지원자격 가능합니다");
		}
		else{
			System.out.println("자격없습니다");
		}
	}
}
