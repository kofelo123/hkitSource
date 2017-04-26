package kr.hkit.chap6;

import java.util.Scanner;

public class TestIf3 {
	Scanner scanner = new Scanner(System.in);
	int num;

	public void ifTest() {
		while (true) {
			System.out.print("1~12 숫자를 입력해주세요: ");
			num = scanner.nextInt();

			if (num == 3 || num == 4 || num == 5) {
				System.out.println("봄");
			} else if (num == 6 || num == 7 || num == 8) {
				System.out.println("여름");
			} else if (num == 9 || num == 10 || num == 11) {
				System.out.println("가을");
			} else if (num == 12 || num == 1 || num == 2) {
				System.out.println("겨울");
			} else {
				System.out.println("잘못입력 하였습니다.");

			}

		}

	}

	public void ifTest2() {

		System.out.print("1~12 숫자를 입력해주세요: ");
		num = scanner.nextInt();

		switch (num) { //조건값을 넣을수는 없다. 해당하는값만 가능.
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;

		default:
			System.out.println("잘못 입력");
			break;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestIf3 testIf3 = new TestIf3();
		testIf3.ifTest();
	}

}
