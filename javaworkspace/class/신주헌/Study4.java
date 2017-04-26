package Homework;

import java.util.Scanner;

public class Study4 {
	public static void main(String[] args){
		int rank;//직급
		int salay;// 본봉
		int realMoney;//실 수령액
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("직급 입력하세요:");
		rank = scanner.nextInt();
		System.out.print("본봉을 입력하세요:");
		salay = scanner.nextInt();
		
		switch (rank) {
		case 5:
		case 6:
			realMoney = (int)(salay-salay*0.12);
			System.out.println("직급:" + rank);
			System.out.println("본봉:" + salay);
			System.out.println("실수령액(세금12%적용):" + realMoney);
			break;
			
		case 7:
		case 8:
			realMoney = (int)(salay-salay*0.8);
			System.out.println("직급:" + rank);
			System.out.println("본봉:" + salay);
			System.out.println("실수령액(세금8%적용):" + realMoney);
			break;

		default:
			break;
		}
	}
}
