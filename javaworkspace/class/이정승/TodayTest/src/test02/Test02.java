package test02;

import java.util.Scanner;

public class Test02 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int a, b;  //����
		
		System.out.println("����1�� �Է��ϼ���");
		a = sc.nextInt();
		
		System.out.println("����2�� �Է��ϼ���");
		b = sc.nextInt();
		
		if((a%2 == 0) && (b%2 == 0) ){
			System.out.println("�� �� ¦�� �Դϴ�.");
		}
		else if((a%2 != 0) && (b%2 != 0))
			System.out.println("�� �� Ȧ�� �Դϴ�.");
		else
			System.out.println("¦��, Ȧ�� �������ϴ�.");
	}

}
