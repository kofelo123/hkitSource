package Test1;

import java.util.Scanner;

public class TestAge {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.println("������ �Է��ϼ��� : ");
		double score = sc.nextDouble();
		
		if((age<30) && (score>=3.5)) {
			System.out.println("��õ ����Դϴ�.");
		} else {
			System.out.println("��õ ����� �ƴմϴ�.");
		}
	}

}
