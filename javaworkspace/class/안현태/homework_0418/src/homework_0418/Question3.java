package homework_0418;

import java.util.Scanner;

public class Question3 {
	public static void main(String args[]){
		String s;
		int jumsoo;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		s=sc.nextLine();
		
		System.out.println("���������� �Է��ϼ��� : ");
		jumsoo=sc.nextInt();
		
		if( (s.equals("f") && jumsoo>=700)  || (s.equals("m") && jumsoo>=800) )
		System.out.println("�װ� �¹��� ���� �ڰ� �������Դϴ�.");
	
		else
			System.out.println("���� �ڰ� �����ڰ� �ƴմϴ�.");
	}
}
