package quest4;

import java.util.Scanner;

public class Pay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int before_pay = 0;
		int rank = 0;
		int after_pay = 0;

		System.out.println("������ �Է��ϼ���(5~8��)");
		rank = scan.nextInt();

		System.out.println("������ �Է��ϼ���");
		before_pay = scan.nextInt();

		if (rank == 7 || rank == 8) {
			after_pay = before_pay * 92 / 100;
			System.out.println("���� : " + rank);
			System.out.println("���� : " + before_pay);
			System.out.println("�Ǽ��ɾ�(����8%����) : " + after_pay);
		} else if (rank == 5 || rank == 6) {
			after_pay = before_pay * 88 / 100;
			System.out.println("���� : " + rank);
			System.out.println("���� : " + before_pay);
			System.out.println("�Ǽ��ɾ�(����12%����) : " + after_pay);
		}
	}
}
