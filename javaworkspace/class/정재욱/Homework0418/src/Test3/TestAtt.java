package Test3;

import java.util.Scanner;

public class TestAtt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(����/����) : ");
		String gender = sc.nextLine();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int toeic = sc.nextInt();
		
		if((gender.equals("����") && toeic>=700) || (gender.equals("����") && toeic>=800)) {
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
		} else {
			System.out.println("�¹��� �ڰ��� �����ϴ�.");
		}
	}

}
