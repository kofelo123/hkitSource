package test04;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// 1���� 100������ ���� 10�� ��� ��ŭ ��� ����

	Scanner sc  = new Scanner(System.in);
		
		int num =0, sum = 0, i = 1;
		
		System.out.println("���ڸ� �Է��ϼ���");
		num = sc.nextInt();
		
		do{
			sum = sum + i;
			i++;
	//		System.out.println("sum��" + sum);
			
			if(i%10 == 0){
				System.out.println("1���� - " + i +" : " + sum);
			}
			
		}while(i <= num);
		
		System.out.println("1���� " + num + "������ ����" + sum +"�Դϴ�");
		
	}

}
