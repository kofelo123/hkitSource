package chap07;

import java.util.Scanner;

public class test07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		int standard;
		String duk;
		System.out.print("성별 입력(m,f) : ");
		duk=in.nextLine();
		System.out.print("키를 입력하시오 : ");
		a=in.nextInt();
		System.out.print("몸무게를 입력하시오 : ");
		b=in.nextInt();
		
		if(duk.equals("m")){
			standard = a-100;
		}else if(duk.equals("f")){
			standard = a-105;
		}else{
			System.out.print("성별을 잘못입력하였습니다.");
			return ;
		}
		
		if(b < standard-5){
			System.out.println("현재 당신의 상태는 미달입니다.");
		}
		else if(b >= standard-5 && b < standard+5){
			System.out.println("현재 당신의 상태는 정상입니다.");
		}
		else {
			System.out.println("현재 당신의 상태는 초과입니다.");
		}
		
		
	}

}
