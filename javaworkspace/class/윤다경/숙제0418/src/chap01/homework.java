package chap01;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		
		int num1;
		int num2; 
		
		Scanner sc = new Scanner(System.in);
			
		System.out.println("�����Է�1 : ");
		num1 = sc .nextInt();
		System.out.println("�����Է�2 : ");
		num2 = sc .nextInt();
		
		if((num1 % 2 == 0)&&(num2 % 2 ==0))
			System.out.println("¦�� �Դϴ�.");
		else
            System.out.println("Ȧ�� �Դϴ�.");
			
		}
			
		

	}
