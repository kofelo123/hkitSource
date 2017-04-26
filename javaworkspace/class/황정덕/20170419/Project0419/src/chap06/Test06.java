package chap06;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=1,b=8;
		System.out.print("사용자 입력 : ");
		a=in.nextInt();
		System.out.println("***"+a+"단***");
		do{
			System.out.println(b+" * "+a+" = "+a*b);
			b=b-2;
		}while(b>0);
	}

}
