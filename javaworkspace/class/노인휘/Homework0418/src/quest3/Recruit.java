package quest3;

import java.util.Scanner;

public class Recruit {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String sex;
		int score;

		System.out.println("������ �Է��ϼ��� ��)�� or ��");
		sex = scan.nextLine();
		System.out.println("���������� �Է��ϼ���");
		score = scan.nextInt();

		if ((sex.equals("��") && score >= 800) || (sex.equals("��") && score >= 700)) {
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
		} else
			System.out.println("�װ� �¹��� ���� �ڰ� �����ڰ� �ƴմϴ�.");
	}
}
