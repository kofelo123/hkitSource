package homework_0418;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��Ͻÿ�:");
		a=sc.nextInt();
		
		System.out.println("���ڸ� �Է��Ͻÿ�:");
		b=sc.nextInt();
		
		if( ((a%2==0) && (b%2==0)) || ((a%2!=0) && (b%2!=0)) ){
			System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���Դϴ�");
		}
		else
			System.out.println("�� ���ڴ� �ٸ��ϴ�");
	}

}
