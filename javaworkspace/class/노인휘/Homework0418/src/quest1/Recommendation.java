package quest1;

import java.util.Scanner;

public class Recommendation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int age;
		double grade;

		System.out.println("나이를 입력하세요");
		age = scan.nextInt();
		System.out.println("성적을 입력하세요");
		grade = scan.nextDouble();

		if (age < 30 && grade >= 3.5) {
			System.out.println("추천대상입니다.");
		} else
			System.out.println("추천 대상이 아닙니다.");

	}
}
