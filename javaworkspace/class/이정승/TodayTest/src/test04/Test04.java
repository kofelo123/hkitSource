package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
	//������ ���� �Է¹޾�
		
		Scanner sc = new Scanner(System.in);
		
		int m, a;
		double total=0, temp=0;
		final double MAX = 0.12;
		final double MIN = 0.08;
		
		System.out.println("���� : ");
		a = sc.nextInt();
		System.out.println("���� : ");
		m = sc.nextInt();
		
		switch(a){
		case 7:
		case 8:
			total = m - m*MIN;
			temp = MIN;
			break;
			
		case 5:
		case 6:
			total = m - m*MAX;
			temp = MAX;
			break;
		default:
			System.out.println("�߸��Է�");
		}
		
		System.out.println("�Ǽ��ɾ�(����"+ temp*100 + "%����) : " + total);
		//����
		

	}

}
