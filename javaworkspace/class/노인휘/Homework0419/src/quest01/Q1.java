package quest01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		int total = 0;

		System.out.println("���� �ϳ��� �Է��ϼ���.");
		num = scan.nextInt();

		do {
			total += num;
			num--;
		} while (num >= 1);

		System.out.println("��: " + total);

	}

}
