package chap01;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		
		int Gender=0;
		int Toeic=0;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է� : ");
		Gender=sc.nextInt();
		System.out.println("���� �Է� : ");
		Toeic=sc.nextInt();
		
		if  (((Gender == 1) && (Toeic >=800 )) || ((Gender == 2) && (Toeic >=700 )))
			System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
	
		}
		
		}
	


	