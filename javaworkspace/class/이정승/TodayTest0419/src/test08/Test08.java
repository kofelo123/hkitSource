package test08;

import java.util.Scanner;

public class Test08 {
	public static void main(String [] args){
		//���� �Է¹޾� �ش��ϴ� ������ ���
		
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		do
		{
			System.out.println("������ �˰���� ���� �Է��ϼ��� : (����� 0)");
			num = sc.nextInt();
			switch(num){
			case 3:
			case 4:
			case 5:
				System.out.println("�� �Դϴ�");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("���� �Դϴ�");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("���� �Դϴ�");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("�ܿ� �Դϴ�");
				break;
			default :
				break;
			}
		}while(num != 0);
	}
}
