package Test7;

import java.util.Scanner;

public class TestFat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bmi = 0;
		String result;
		char nn;
		
		System.out.print("성별을 입력하시오(남/여) : ");
		String gender = sc.nextLine();
		System.out.print("키를 입력하시오(cm) : ");
		int weight = sc.nextInt();
		System.out.print("몸무게를 입력하시오(kg) : ");
		int height = sc.nextInt();
		
		
		if(gender.equals("남")) {
			bmi = weight-100;
		} else if(gender.equals("여")) {
			bmi = weight-105;
		} else {
			System.out.println("잘못입력");
		}
		
		if(bmi > 5) {
			result = "미달";
		} else if(bmi < -5) {
			result = "초과";
		} else {
			result = "표준";
		}
		
		System.out.println("당신은 표준체중보다 " + result + "입니다." );
	}

}
