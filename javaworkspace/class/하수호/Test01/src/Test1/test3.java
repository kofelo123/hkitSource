package Test1;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int G;
		int Score;
		
		System.out.println("������ �Է��ϼ���1.����,2.����");
		G=sc.nextInt();
		System.out.println("���ͼ����� �Է��ϼ���");
		Score=sc.nextInt();
		if(1==G && Score>=800){
			System.out.println("�װ� �¹��� ���� �ڰݰ������Դϴ�");
		}else if(2==G && Score>=700){
			System.out.println("�װ� �¹��� ���� �ڰݰ������Դϴ�");
		}else 
			System.out.println("�װ� �¹��� ���� �ڰ� �Ұ��������Դϴ�.");
}
}
