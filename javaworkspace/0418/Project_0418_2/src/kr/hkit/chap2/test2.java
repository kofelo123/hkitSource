package kr.hkit.chap2;

import java.util.Scanner;

public class test2 {
	Scanner scanner = new Scanner(System.in);
	int kor, eng, math, avg;
	String name;

	public void sumavg() {

		// String �Է¹ޱ�
		System.out.println("�̸���?");
		name = scanner.nextLine();

		System.out.println("�ѱ��� ������ �Է����ּ���");
		kor = scanner.nextInt();
		System.out.println("���� ������ �Է����ּ���");
		eng = scanner.nextInt();
		System.out.println("���� ������ �Է����ּ���");
		math = scanner.nextInt();

		System.out.println(name + "���� ���� �Դϴ�.");
		System.out.println("������=" + (kor + eng + math));
		System.out.println("�����=" + (kor + eng + math) / 3.0);

	}

	public void testif() {

		System.out.println("�ѱ��� ������ �Է����ּ���");
		kor = scanner.nextInt();
		System.out.println("���� ������ �Է����ּ���");
		eng = scanner.nextInt();
		System.out.println("���� ������ �Է����ּ���");
		math = scanner.nextInt();

		avg = (kor + eng + math) / 3;
		System.out.println("���������?" + avg);
		if (avg >= 70) {
			System.out.println("�հ�");
			if (avg == 100) {
				System.out.println("Perfect!");
			}
		}

		else {
			System.out.println("���հ�");
			if (avg <= 40)
				System.out.println("�����Դϴ�.");
		}
	}

	public static void main(String[] args) {

		test2 test = new test2();
		// test.sumavg();
		test.testif();
	}
}
