package ch08;

import java.util.Scanner;

public class Bimando {
	public static void main(String[] args){
		//������ �� ��� ü��, Ű,���� �Է¹ޱ�
		double height,weight,standardweight;//Ű, ������
		int gender;//����
		Scanner scan = new Scanner(System.in);
		System.out.print("������ȣ�Է��ϼ���(1.����,2.����):");
		gender = scan.nextInt();
		System.out.print("ü���� �Է��ϼ���:");
		weight = scan.nextInt();
		System.out.print("Ű�Է��ϼ���:");
		height = scan.nextInt();
		
		//����
		if(gender ==1){
			standardweight = height-100;
			if(standardweight-weight < 5){
				System.out.println("�̴�");
			}
			else if(standardweight-weight >5){
				System.out.println("�ʰ�");
			}
			else if(standardweight-weight<=5 && standardweight-weight<5){
				System.out.println("ǥ��");
			}
		}
		
		//����
		if(gender ==2){
			standardweight = height - 105;
			if(standardweight-weight<5){
				System.out.println("�̴�");
			}
			else if(standardweight-weight>5){
				System.out.println("�ʰ�");
			}
			else if(standardweight-weight<=5 && standardweight-weight<5){
				System.out.println("ǥ��");
			}
		}
	}
}
