package Test7;

import java.util.Scanner;

public class TestFat {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bmi = 0;
		String result;
		char nn;
		
		System.out.print("������ �Է��Ͻÿ�(��/��) : ");
		String gender = sc.nextLine();
		System.out.print("Ű�� �Է��Ͻÿ�(cm) : ");
		int weight = sc.nextInt();
		System.out.print("�����Ը� �Է��Ͻÿ�(kg) : ");
		int height = sc.nextInt();
		
		
		if(gender.equals("��")) {
			bmi = weight-100;
		} else if(gender.equals("��")) {
			bmi = weight-105;
		} else {
			System.out.println("�߸��Է�");
		}
		
		if(bmi > 5) {
			result = "�̴�";
		} else if(bmi < -5) {
			result = "�ʰ�";
		} else {
			result = "ǥ��";
		}
		
		System.out.println("����� ǥ��ü�ߺ��� " + result + "�Դϴ�." );
	}

}
