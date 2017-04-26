package chap04;

import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a,b;
		String duk;
		System.out.print("직급을 입력하시오 : ");
		a=in.nextInt();
		System.out.print("본봉을 입력하시오 : ");
		b=in.nextInt();
		switch(a){
		case 5:
		case 6:
			System.out.println("직급 : "+a+"급");
			System.out.println("본공 : "+b);
			System.out.println("실수령액(세금 12%) : "+(b-b*0.12));
			break;
		case 7:
		case 8:
			System.out.println("직급 : "+a+"급");
			System.out.println("본공 : "+b);
			System.out.println("실수령액(세금 8%) : "+(b-b*0.08));
			break;	
		default:
			break;
		}
	}

}
