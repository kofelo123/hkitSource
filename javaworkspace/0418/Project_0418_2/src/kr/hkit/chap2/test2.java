package kr.hkit.chap2;

import java.util.Scanner;

public class test2 {
	Scanner scanner = new Scanner(System.in);
	int kor, eng, math, avg;
	String name;

	public void sumavg() {

		// String 입력받기
		System.out.println("이름은?");
		name = scanner.nextLine();

		System.out.println("한국어 점수를 입력해주세요");
		kor = scanner.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		eng = scanner.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		math = scanner.nextInt();

		System.out.println(name + "님의 점수 입니다.");
		System.out.println("총점은=" + (kor + eng + math));
		System.out.println("평균은=" + (kor + eng + math) / 3.0);

	}

	public void testif() {

		System.out.println("한국어 점수를 입력해주세요");
		kor = scanner.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		eng = scanner.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		math = scanner.nextInt();

		avg = (kor + eng + math) / 3;
		System.out.println("평균점수는?" + avg);
		if (avg >= 70) {
			System.out.println("합격");
			if (avg == 100) {
				System.out.println("Perfect!");
			}
		}

		else {
			System.out.println("불합격");
			if (avg <= 40)
				System.out.println("과락입니다.");
		}
	}

	public static void main(String[] args) {

		test2 test = new test2();
		// test.sumavg();
		test.testif();
	}
}
