package homework1_7;

import java.util.Scanner;

public class Homework1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double kg, cm;
		String sex;
		int sub = 0;
		double standard = 0;
		
		System.out.println("성별을 입력하시오 (남자 M, 여자 F)");
		sex = sc.nextLine();
		System.out.println("체중을 입력하시오");
		kg = sc.nextDouble();
		System.out.println("키를 입력하시오");
		cm = sc.nextDouble();
		

		if(sex.charAt(0) == 'M' || sex.charAt(0) == 'm')
			sub = 100;
		else if(sex.charAt(0) == 'F' || sex.charAt(0) == 'f')
			sub = 105;
		else
		{
			System.out.println("성별을 잘못입력하셨습니다.");
			return;
		}
	
		standard = cm - sub;
		
		if(standard - kg < -5)
			System.out.println("비만");
		else if(standard - kg >= 5)
			System.out.println("약체");
		else
			System.out.println("표준체형");
	}

}
