package quest7;

import java.util.Scanner;

public class Weight {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		double weight;
		double height;
		double standard_weight = 0.0;
		String sex;
		String status;

		System.out.println("ü���� �Է��ϼ���");
		weight = scan.nextDouble();
		System.out.println("Ű�� �Է��ϼ���");
		height = scan.nextDouble();
		System.out.println("������ �Է��ϼ��� ��)�� or ��");
		sex = scan.next();

		if (sex.equals("��")) {
			standard_weight = height - 100;
		} 
		else if (sex.equals("��")) {
			standard_weight = height - 105;
		}
		
		if (standard_weight - 5 > weight)
			status = "�̴�";
		else if (standard_weight + 5 <= weight)
			status = "�ʰ�";
		else
			status = "ǥ��";

		System.out.println(status);
	}
}
