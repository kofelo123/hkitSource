package qiz1;

import java.util.Scanner;

public class qiz1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a;
		int total=0;
		System.out.print("�ƹ� ���ڸ��Է��Ͻʽÿ�");
		a= sc.nextInt();
		total=total+a;
		do{a--;
			total=total+a;
			System.out.println("����:"+total);	
		}while(a>1);
	}

}
