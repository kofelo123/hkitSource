package report2;

import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int first_number, second_number;
		
		System.out.println("ù ��° ���� �Է��ϼ���.");
		first_number = scan.nextInt();
		System.out.println("�� ��° ���� �Է��ϼ���.");
		second_number = scan.nextInt();
		
		if((first_number%2 == 0 && second_number%2 == 0)
				|| (first_number%2 == 1 && second_number%2 == 1)){
			System.out.println("\n�� ���� ���ڴ� ���� ¦�� �Ǵ� Ȧ�� �Դϴ�.");
		}
		else {
			System.out.println("\n�� ���� ���ڴ� ���� ¦�� �Ǵ� Ȧ���� �ƴմϴ�.");
		}
	}

}
