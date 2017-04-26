package chap03;

import java.util.Scanner;

public class test03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t;
		String duk;
		System.out.print("성별 입력(m,f) : ");
		duk=in.nextLine();
		System.out.print("토익성적을 입력하시오 : ");
		t=in.nextInt();
		
		if(duk.equals("f")){
			if(t>=700){
				System.out.println("항공 승무원 지원 자격 가능자입니다");
			}else{
				System.out.println("지원 가능하지 않습니다");
			}
		}else if(duk.equals("m")){
			if(t>=800){
				System.out.println("항공 승무원 지원 자격 가능자입니다");
			}else{
				System.out.println("지원 가능하지 않습니다");
			}
		}else{
			System.out.println("지원 가능하지 않습니다");
		}
	}

}
