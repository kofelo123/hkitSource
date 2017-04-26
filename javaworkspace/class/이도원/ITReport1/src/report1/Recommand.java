package report1;

import java.util.Scanner;

public class Recommand {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int age;
		double grade;
		
		System.out.println("나이를 입력하세요.");
		System.out.print("=> ");
		age = scan.nextInt();
		
		System.out.println("성적를 입력하세요.");
		System.out.print("=> ");
		grade = scan.nextDouble();
		
		if(age < 30 && grade >= 3.5){
			System.out.println("\n추천 대상입니다.");
		}
		else {
			System.out.println("\n추천 대상이 아닙니다.");
		}

	}

}
