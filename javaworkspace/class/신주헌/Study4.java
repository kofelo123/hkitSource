package Homework;

import java.util.Scanner;

public class Study4 {
	public static void main(String[] args){
		int rank;//����
		int salay;// ����
		int realMoney;//�� ���ɾ�
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���� �Է��ϼ���:");
		rank = scanner.nextInt();
		System.out.print("������ �Է��ϼ���:");
		salay = scanner.nextInt();
		
		switch (rank) {
		case 5:
		case 6:
			realMoney = (int)(salay-salay*0.12);
			System.out.println("����:" + rank);
			System.out.println("����:" + salay);
			System.out.println("�Ǽ��ɾ�(����12%����):" + realMoney);
			break;
			
		case 7:
		case 8:
			realMoney = (int)(salay-salay*0.8);
			System.out.println("����:" + rank);
			System.out.println("����:" + salay);
			System.out.println("�Ǽ��ɾ�(����8%����):" + realMoney);
			break;

		default:
			break;
		}
	}
}
