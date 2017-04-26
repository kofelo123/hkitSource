package ex;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		int grade;
		int time;
		int money;
		double sil; //실 급여
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직급 : ");
		grade = sc.nextInt();
		System.out.println("근무 시간 : ");
		time = sc.nextInt();
		
		if((grade==7 || grade==8) && time>=40){
			sil = 40*15000+((time-40)*22500);
			System.out.println("직급 : "+grade+"급");
			System.out.println("근무 시간 : "+time+"시간");
			System.out.println("주 급여 : "+sil+"원");
		}else if((grade==7 || grade==8) && time<=40){
			sil = 40*15000;
			System.out.println("직급 : "+grade+"급");
			System.out.println("근무 시간 : "+time+"시간");
			System.out.println("주 급여 : "+sil+"원");
		}else if((grade==5|| grade==6) && time>=40){
			sil = 40*20000+((time-40)*30000);
			System.out.println("직급 : "+grade+"급");
			System.out.println("근무 시간 : "+time+"시간");
			System.out.println("주 급여 : "+sil+"원");
		}else if((grade==5 || grade==6) && time<=40){
			sil = 40*20000;
			System.out.println("직급 : "+grade+"급");
			System.out.println("근무 시간 : "+time+"시간");
			System.out.println("주 급여 : "+sil+"원");
		}
	}
}
