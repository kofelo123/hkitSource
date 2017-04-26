package pr1;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int y;
		double g;

		System.out.println("나이는?");
		y = sc.nextInt();
		System.out.println("성적은?");
		g = sc.nextDouble();

		if ((y < 30) && (g >= 3.5)) {
			System.out.println("추천대상입니다.");
		}

		else {
			System.out.println("추천대상이 아닙니다.");
		}

	}

}
