package quest2;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;

		System.out.println("ù��° ���ڸ� �Է��ϼ���");
		num1 = scan.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���");
		num2 = scan.nextInt();

		if ((num1 % 2 == 0 && num2 % 2 == 0)||(num1 % 2 == 1 && num2 % 2 == 1)){
			System.out.println("�� ���� ��� ¦�� �Ǵ� Ȧ�� �Դϴ�.");
		}
		else
			System.out.println("�� ���ڴ� ��� ¦�� �Ǵ� Ȧ���� �ƴմϴ�.");
	}

}
