package hw01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		int x=sc.nextInt();
		int i=1, total=0;
		
		do{
			total = total+x;
			x--;
		}while(i<=x);
		System.out.println("������ " + total +"�Դϴ�.");
	}

}
