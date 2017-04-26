package Test1;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int G;
		int Score;
		
		System.out.println("성별을 입력하세요1.남자,2.여자");
		G=sc.nextInt();
		System.out.println("토익성적을 입력하세요");
		Score=sc.nextInt();
		if(1==G && Score>=800){
			System.out.println("항공 승무원 지원 자격가능자입니다");
		}else if(2==G && Score>=700){
			System.out.println("항공 승무원 지원 자격가능자입니다");
		}else 
			System.out.println("항공 승무원 지원 자격 불가능한자입니다.");
}
}
