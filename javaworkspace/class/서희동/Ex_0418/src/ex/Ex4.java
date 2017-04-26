package ex;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		int grade;
		int money;
		int sil;  //실 급여
		Scanner sc = new Scanner(System.in);
		System.out.println("직급 : ");
		grade = sc.nextInt();
		System.out.println("본봉 : ");
		money = sc.nextInt();
		
		if(grade ==7 || grade == 8){
			sil = money-(money*6/100);
			System.out.println("직급 : "+grade+"급");
			System.out.println("본봉 : "+money+"원");
			System.out.println("실수령액(세금 6%적용)"+sil+"원");
		}else if(grade == 5 || grade == 6){
			sil = money-(money*12/100);
			System.out.println("직급 : "+grade+"급");
			System.out.println("본봉 : "+money+"원");
			System.out.println("실수령액(세금 12%적용)"+sil+"원");
		}

	}

}
