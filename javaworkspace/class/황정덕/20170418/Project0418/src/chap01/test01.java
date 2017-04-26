package chap01;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		double b;
		System.out.print("나이를 입력하시오 : ");
		a=in.nextInt();
		System.out.print("성적을 입력하시오 : ");
		b=in.nextDouble();
		if(a<30&&b>3.5){
			System.out.println("추천 대상입니다");
		}else{
			System.out.println("추천 대상이 아닙니다");			
		}
		
	}

}
