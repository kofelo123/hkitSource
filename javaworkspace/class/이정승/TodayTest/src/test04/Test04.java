package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
	//본봉과 직급 입력받아
		
		Scanner sc = new Scanner(System.in);
		
		int m, a;
		double total=0, temp=0;
		final double MAX = 0.12;
		final double MIN = 0.08;
		
		System.out.println("직급 : ");
		a = sc.nextInt();
		System.out.println("본봉 : ");
		m = sc.nextInt();
		
		switch(a){
		case 7:
		case 8:
			total = m - m*MIN;
			temp = MIN;
			break;
			
		case 5:
		case 6:
			total = m - m*MAX;
			temp = MAX;
			break;
		default:
			System.out.println("잘못입력");
		}
		
		System.out.println("실수령액(세금"+ temp*100 + "%적용) : " + total);
		//연산
		

	}

}
