package test1;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, i=1 ,total=0;
		System.out.print("���ڸ� �Է��ϼ��� : ");
		 x=sc.nextInt();
		 		
		do{
			total = total+x;
			x--;
		}while(i<=x);
		System.out.println("������ " + total +"�Դϴ�.");
	}

}
