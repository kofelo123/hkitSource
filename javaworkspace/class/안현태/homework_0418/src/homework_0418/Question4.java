package homework_0418;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		int zikgeb;
		int bonbong;
		double realmoney;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직급을 입력하시오 :");
		zikgeb = sc.nextInt();
		System.out.println("본봉을 입력하시오 :");
		bonbong = sc.nextInt();
		
		System.out.println("직급 : "+ zikgeb);
		System.out.println("본봉 : "+ bonbong);
		
		switch (zikgeb) {
		case 7:
		case 8:
			realmoney = bonbong * 0.92;
			System.out.println("실수령액 : "+ realmoney);
			
			break;
		case 5:
		case 6:
			realmoney = bonbong * 0.88;
			System.out.println("실수령액 : "+ realmoney);
			
		default:
			break;
		}

	}
}
