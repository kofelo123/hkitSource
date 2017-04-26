package test6;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x=8,num;
		
		System.out.print("숫자를 입력하세요 ");
		num=sc.nextInt();
		System.out.printf(" %d단 \n",num);
		
		do{
			System.out.println(x + " * " + num + " = " + x*num);
			x-=2;
		}while(x>0);
	}

}
