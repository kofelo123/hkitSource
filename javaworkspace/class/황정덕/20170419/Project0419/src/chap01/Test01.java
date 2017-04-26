package chap01;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		int sum=0;
		System.out.print("숫자를 입력 : ");
		a=in.nextInt();
		do{
			sum=sum+a;
			a--;
		}while(a>0);
		System.out.print("숫자의 합은 : "+sum);
	}

}
