package kr.hkit.chap1;

import java.util.Scanner;

public class Prog01 {
	public static void main(String[] args) {
		int age = 0;
		double score = 0.0;
		String msg = "";

		Scanner scanner = new Scanner(System.in);

		System.out.print("�����Է� : ");
		age = scanner.nextInt();
		System.out.print("�����Է� : ");
		score = scanner.nextDouble();

		if (age < 30) {
			if (score >= 3.5) {
				msg="��õ ����Դϴ�.";
			} else {
				msg = "��õ����� �ƴմϴ�.";
			}
		}
		System.out.println(msg);
	}
}