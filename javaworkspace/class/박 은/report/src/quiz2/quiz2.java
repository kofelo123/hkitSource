package quiz2;

import java.util.Scanner;

public class quiz2{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a , b;
		System.out.println("�ΰ��� ���ڸ� �Է��ϼ���.");
		a= sc.nextInt();
		b= sc.nextInt();
		if(a%2==0&b%2==0 || a%2==1&b%2==1){
		
		System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���Դϴ�.");
		}
		else
			System.out.println("�� ���ڴ� ���� ¦�� �Ǵ� Ȧ���� �ƴմϴ�.");
			

	}

}
