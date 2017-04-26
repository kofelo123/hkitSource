package chap02;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a=100;
		int sum=0;
		do{
			if((a%2)==1){
				sum=sum+a;
			}
			a--;
		}while(a>0);
		System.out.print("1~100까지의 홀수의 합은 : "+sum);
	}

}
