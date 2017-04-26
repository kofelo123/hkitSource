package kr.hkit.chap1;

import java.util.Scanner;

public class Prog01 {
	public static void main(String[] args) {
		int age = 0;
		double score = 0.0;
		String msg = "";

		Scanner scanner = new Scanner(System.in);

		System.out.print("나이입력 : ");
		age = scanner.nextInt();
		System.out.print("점수입력 : ");
		score = scanner.nextDouble();

		if (age < 30) {
			if (score >= 3.5) {
				msg="추천 대상입니다.";
			} else {
				msg = "추천대상이 아닙니다.";
			}
		}
		System.out.println(msg);
	}
}