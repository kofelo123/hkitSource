package quest6;

import java.util.Scanner;

public class Pay2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int rank = 0;
		int work_time = 0;
		int after_pay = 0;

		System.out.println("������ �Է��ϼ���");
		rank = scan.nextInt();
		System.out.println("�ٹ��ð��� �Է��ϼ���");
		work_time = scan.nextInt();

		if (rank == 7 || rank == 8) {
			if (work_time > 40) {
				after_pay = (40 * 15000) + (22500 * (work_time - 40));
			} else
				after_pay = 40 * 15000;
		}

		else if (rank == 5 || rank == 6) {
			if (work_time > 40) {
				after_pay = (40 * 20000) + (30000 * (work_time - 40));
			} else
				after_pay = 40 * 20000;
		}
					
		System.out.println("���� : " + rank + "��");
		System.out.println("�ٹ��ð� : " + work_time + "�ð�");
		System.out.println("�� �޿� : " + after_pay);

	}
}
