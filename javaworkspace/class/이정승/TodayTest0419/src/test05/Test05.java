package test05;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args){
		//3���� 3�� ��� ���ϱ� , num������ 3�� ��� ��
		//�����Է�
		//3�� ����� ������ �Էµ� ���ڸ� �Ѿ�����, ��� ����, �� �հ�, N���� ���°������ do while �̿�
		
	Scanner sc  = new Scanner(System.in);
		
		int num =0, sum = 0, i = 0, count = 0;
		
		System.out.println("���ڸ� �Է��ϼ���");
		num = sc.nextInt();
		
		do{
			
			if(i%3 == 0){
				if(i > num){
					break;
				}
				sum = sum + i;
				count++;
				System.out.println("���� i�� �� : " + i);
				
			}
			i++;
	
		}while(true);
		
		System.out.println(num + "�� �Ѿ������� �� : " + i);
		System.out.println(num + "�� �Ѿ������� �� �հ� : " + sum);
		System.out.println(num + "�� �Ѿ����� �� ��° 3�� ����ΰ� : " + count);
		
		
	}
}
