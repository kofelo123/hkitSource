package test03;

import java.util.Scanner;

public class Test03 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int m, w, temp, num;  //����
		
		System.out.println("1�� ����, 2�� ���� �Դϴ�. �Է��ϼ���");
		temp = sc.nextInt();
		
		System.out.println("���������� �Է��ϼ���");
		num = sc.nextInt();
		
		switch(temp){
		case 1:
			if(num >= 800){
				System.out.println("�װ� �¹��� ���� �ڰ� ������ �Դϴ�.");
			}
			else
				System.out.println("���� �ڰ��� �����ϴ�.");
			break;
		case 2:
			if(num >= 700){
				System.out.println("�װ� �¹��� ���� �ڰ� ������ �Դϴ�.");
			}
			else
				System.out.println("���� �ڰ��� �����ϴ�.");
			break;
		}
				
	}

}
