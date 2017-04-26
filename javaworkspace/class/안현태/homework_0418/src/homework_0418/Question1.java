package homework_0418;

import java.util.Scanner;

public class Question1{

	public static void main(String[] args) {
		int age;
		double hakzum;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하시오 : ");
		age = sc.nextInt();
		System.out.print("성적을 입력하시오: ");
		hakzum = sc.nextDouble();
		
		if(age<30 && hakzum >=3.5)
			System.out.println("추천 대상입니다");
		else
			System.out.println("추천 대상이 아닙니다");
	}

}
