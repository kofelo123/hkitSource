package hw06;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=8;
		
		System.out.print("����� �Է� : ");
		int num=sc.nextInt();
		System.out.printf("** %d�� **\n",num);
		
		do{
			System.out.println(x + " * " + num + " = " + x*num);
			x-=2;
		}while(x>0);
	}

}
