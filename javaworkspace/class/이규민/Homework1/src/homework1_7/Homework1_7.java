package homework1_7;

import java.util.Scanner;

public class Homework1_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double kg, cm;
		String sex;
		int sub = 0;
		double standard = 0;
		
		System.out.println("������ �Է��Ͻÿ� (���� M, ���� F)");
		sex = sc.nextLine();
		System.out.println("ü���� �Է��Ͻÿ�");
		kg = sc.nextDouble();
		System.out.println("Ű�� �Է��Ͻÿ�");
		cm = sc.nextDouble();
		

		if(sex.charAt(0) == 'M' || sex.charAt(0) == 'm')
			sub = 100;
		else if(sex.charAt(0) == 'F' || sex.charAt(0) == 'f')
			sub = 105;
		else
		{
			System.out.println("������ �߸��Է��ϼ̽��ϴ�.");
			return;
		}
	
		standard = cm - sub;
		
		if(standard - kg < -5)
			System.out.println("��");
		else if(standard - kg >= 5)
			System.out.println("��ü");
		else
			System.out.println("ǥ��ü��");
	}

}
