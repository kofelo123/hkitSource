package test01;

import java.util.Scanner;

public class Test01 {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
	
		int a, b;  //����
		
		System.out.println("���̸� �Է��ϼ���");
		a = sc.nextInt();
		
		System.out.println("������ �Է��ϼ���");
		b = sc.nextInt();
		
		if(a < 30 && b >= 3.5){
			System.out.println("��õ����Դϴ�.");
		}
		else
			System.out.println("��õ����� �ƴմϴ�.");

	}

}
