package quest3;

import java.util.Scanner;

public class Recruit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sex;
		int score;

		System.out.println("성별을 입력하세요 예)남 or 여");
		sex = scan.nextLine();
		System.out.println("토익점수를 입력하세요");
		score = scan.nextInt();

		if ((sex.equals("남") && score >= 800) || (sex.equals("여") && score >= 700)) {
			System.out.println("항공 승무원 지원 자격 가능자입니다.");
		} else
			System.out.println("항공 승무원 지원 자격 가능자가 아닙니다.");
	}
}
