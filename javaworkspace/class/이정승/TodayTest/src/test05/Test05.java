package test05;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//���ǰ��� ���Խð� �Է�, ���������� �ݾ��� ���
		//���� �ݾ���5% ����
		//���� �ݾ��� 2.5%����
		
		
		int time;
		double price, pay;
		
		System.out.println("���Խð� : ");
		time = sc.nextInt();
		
		System.out.println("�� ���Աݾ� : ");
		price = sc.nextInt();
		
		if(time >= 12){
			pay = price - price*0.025;
		}
		else
			pay = price - price*0.05;
		
		System.out.println("���� ���� �ݾ� : " + pay);
		
	}

}
