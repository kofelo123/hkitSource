package kr.hkit.chap6;

import java.util.Scanner;

public class TestIf3 {
	Scanner scanner = new Scanner(System.in);
	int num;

	public void ifTest() {
		while (true) {
			System.out.print("1~12 ���ڸ� �Է����ּ���: ");
			num = scanner.nextInt();

			if (num == 3 || num == 4 || num == 5) {
				System.out.println("��");
			} else if (num == 6 || num == 7 || num == 8) {
				System.out.println("����");
			} else if (num == 9 || num == 10 || num == 11) {
				System.out.println("����");
			} else if (num == 12 || num == 1 || num == 2) {
				System.out.println("�ܿ�");
			} else {
				System.out.println("�߸��Է� �Ͽ����ϴ�.");

			}

		}

	}

	public void ifTest2() {

		System.out.print("1~12 ���ڸ� �Է����ּ���: ");
		num = scanner.nextInt();

		switch (num) { //���ǰ��� �������� ����. �ش��ϴ°��� ����.
		case 12:
		case 1:
		case 2:
			System.out.println("�ܿ�");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("��");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("����");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("����");
			break;

		default:
			System.out.println("�߸� �Է�");
			break;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestIf3 testIf3 = new TestIf3();
		testIf3.ifTest();
	}

}
