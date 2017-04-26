package Test1;

import java.util.Scanner;

public class TestAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.println("성적을 입력하세요 : ");
		double score = sc.nextDouble();
		
		if((age<30) && (score>=3.5)) {
			System.out.println("추천 대상입니다.");
		} else {
			System.out.println("추천 대상이 아닙니다.");
		}
	}

}
