package ch08;

import java.util.Scanner;

public class Bimando {
	public static void main(String[] args){
		//세가지 값 출력 체중, 키,성별 입력받기
		double height,weight,standardweight;//키, 몸무게
		int gender;//성별
		Scanner scan = new Scanner(System.in);
		System.out.print("성별번호입력하세요(1.남자,2.여자):");
		gender = scan.nextInt();
		System.out.print("체중을 입력하세요:");
		weight = scan.nextInt();
		System.out.print("키입력하세요:");
		height = scan.nextInt();
		
		//남자
		if(gender ==1){
			standardweight = height-100;
			if(standardweight-weight < 5){
				System.out.println("미달");
			}
			else if(standardweight-weight >5){
				System.out.println("초과");
			}
			else if(standardweight-weight<=5 && standardweight-weight<5){
				System.out.println("표준");
			}
		}
		
		//여자
		if(gender ==2){
			standardweight = height - 105;
			if(standardweight-weight<5){
				System.out.println("미달");
			}
			else if(standardweight-weight>5){
				System.out.println("초과");
			}
			else if(standardweight-weight<=5 && standardweight-weight<5){
				System.out.println("표준");
			}
		}
	}
}
