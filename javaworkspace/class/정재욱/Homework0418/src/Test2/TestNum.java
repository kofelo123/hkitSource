package Test2;

import java.util.Scanner;

public class TestNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ΰ��� ���ڸ� �Է��ϼ��� : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if((num1+num2)%2==0) {
			System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ�� �Դϴ�.");
		} else {
			System.out.println("�� ���ڴ� �ٸ� �� �Դϴ�.");
		}
	}

}
