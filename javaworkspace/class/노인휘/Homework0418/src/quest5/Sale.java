package quest5;

import java.util.Scanner;

public class Sale {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int time = 0;
		int input = 0;
		int output = 0;

		System.out.println("���Խð��� �Է��ϼ��� (0 ~ 24)");
		time = scan.nextInt();
		System.out.println("������ ���� ���� �Է��ϼ���");
		input = scan.nextInt();

		if (time < 12 && time >= 0) {
			output = input * 95 / 100;
		} else if (time >= 12 && time < 24) {
			output = input * 975 / 1000;
		}

		System.out.println("���Խð� : " + time + "��");
		System.out.println("�� ���Աݾ� : " + input);
		System.out.println("���� ���� �ݾ� : " + output);

	}

}
