package quest1;

import java.util.Scanner;

public class Recommendation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int age;
		double grade;

		System.out.println("���̸� �Է��ϼ���");
		age = scan.nextInt();
		System.out.println("������ �Է��ϼ���");
		grade = scan.nextDouble();

		if (age < 30 && grade >= 3.5) {
			System.out.println("��õ����Դϴ�.");
		} else
			System.out.println("��õ ����� �ƴմϴ�.");

	}
}
