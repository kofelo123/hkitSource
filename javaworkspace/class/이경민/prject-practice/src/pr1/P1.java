package pr1;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int y;
		double g;

		System.out.println("���̴�?");
		y = sc.nextInt();
		System.out.println("������?");
		g = sc.nextDouble();

		if ((y < 30) && (g >= 3.5)) {
			System.out.println("��õ����Դϴ�.");
		}

		else {
			System.out.println("��õ����� �ƴմϴ�.");
		}

	}

}
